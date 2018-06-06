package com.best1.scm.edi;
/*************************************************************************
 *
 * Copyright (C) 2004
 * Eastern Home Shopping Network
 * All Rights Reserved
 *
 * File: DelimitedFileReader.java
 *
 *************************************************************************
 * Date	          Name                         Description
 * 16-Nov-05     TCS-148033            		Created
 *************************************************************************/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;




/**
 * 
 * 	@CLASS NAME               : 	DelimitedFileReader
 *	@TYPE                     :     Utility
 * 	@AUTHOR                   :     TCS
 * 	@VERSION                  : 	1.0
 * 	@EXTENDS                  : 	Nil.
 * 	@INFORMATION              :		Utility for reading delimited files.
 * 									Uses the information in TCMN_TRNASACTIONSET and TCMN_DATASEGMENT for the field details.    
 * 	@TABLES REFERRED          : 	TCMN_TRNASACTIONSET, 
 * 									TCMN_DATASEGMENT
 * 	@LAST MODIFIED BY         :		TCS-148033
 * 	@LAST MODIFIED DATE       :		Nov 16, 2005
 *
 */
public class DelimitedFileReader
    extends EDIFileReader
{
	private String delimiter;

	/**
	  Constructor of the DelimitedFileReader class. 
	  Sets the file name and the transaction set id.
	  * @METHOD NAME			:	DelimitedFileReader
	  * @PARAMS					:	String uri, String id
	  * @THROWS					:	Nil.
	  * @LAST MODIFIED BY		:	TCS-148033
	  * @LAST MODIFIED DATE		:	Nov 16, 2005
	  */
	
	DelimitedFileReader(String uri, String id, String delimiter)
	{
		this.uri = uri;
		this.id = id;
		dbg("Delimiter is : "+delimiter);
		this.delimiter=delimiter;
	}
	
	/**
	  Reads the delimited file and sets the trailerMap, 
	  bodyList and the headerList fields with the data 
	  from the delimited file. 
	  * @METHOD NAME          :	readFile
	  * @PARAMS               :	Connection con
	  * @RETURNS              : void
	  * @THROWS            	  : EHSNBatchException
	  * @LAST MODIFIED BY     :	TCS-148033
	  * @LAST MODIFIED DATE   :	Nov 16, 2005
	  */
	
	public void readFile(Connection con) throws Exception
	{
		FileInputStream file = null;
		InputStreamReader reader = null;
		BufferedReader bufferedReader = null;

		bodyList = new ArrayList();
		try
		{
			TransactionsetDAO transactionSetDao = new TransactionsetDAO(con);
			
			//Get the transaction set detakls for the corresponding transaction set id.
			vo =	transactionSetDao.findByPrimaryKey(id);
			if (vo != null)
			{
				//Get the charecter set. if no charecterset fount usethe default charecter set.
				String charSet = vo.getCharSet();
				if (charSet == null)
				{
					charSet = EHSNEDIConstants.DEFAULT_CHARSET;
				}
				else if (charSet.trim().equals(""))
				{
					charSet = EHSNEDIConstants.DEFAULT_CHARSET;
				}
				
				//Get the file name.
				if (uri != null)
				{
					file = new FileInputStream(uri);

					reader = new InputStreamReader(file, charSet);
					bufferedReader = new BufferedReader(reader);
				}

				DatasegmentDAO dataSegmentDAO = new DatasegmentDAO(con);
				//Header
				//Get the header segment from the transactionset
				String headerSegments = vo.getHeadersegmentrefid();
				if (headerSegments != null)
				{
					//Get the list of header segment id.
					StringTokenizer segId = new StringTokenizer(headerSegments, ",");
					headerList = new ArrayList();
					while (segId.hasMoreTokens())
					{
						String headerSegmentId = segId.nextToken();
						if (headerSegmentId != null)
						{
							//Get header details using the header segment id.
							ArrayList headerElementList = dataSegmentDAO.findByPrimaryKey(headerSegmentId);
							dbg("PROCESSING HEADER...");
							try
							{
								//Read a header line and process it.
								String headerLine = bufferedReader.readLine();
								dbg("Read header:" + headerLine);
								headerList.add(processDelimitedLine(headerLine, headerElementList));
							}
							catch (Exception ebe)
							{
								throw ebe;
							}
							
						}
					}
				}

				String dataSegmentId = vo.getDatasegmentrefid();
				String trailerSegmentId = vo.getTrailersegmentrefid();
				String trailerDefaultStartValue = null;
				ArrayList trailerElementList = null;

				//Start processing Data and trailer
				ArrayList dataElementList = dataSegmentDAO.findByPrimaryKey(dataSegmentId);
				dbg("To process data");
				if (trailerSegmentId != null)
				{
					//Trailer segment available. Get the trailer segment details.
					dbg("Trying to process file with data and trailer");
					
					//Get trailer details from the trailer segment id.
					trailerElementList = dataSegmentDAO.findByPrimaryKey(trailerSegmentId);
					DatasegmentVO dataSegmentVo = (DatasegmentVO) trailerElementList.get(0);
					
					/* Read a line. 
					 * Read next line. If the next line is null, then the current line is the trailer
					 * Otherwise the current line is in the data part.
					 */

					String currLine = bufferedReader.readLine();
					
					if (currLine == null)
					{
						//No data at all. Throw Exception
						throw new Exception("No data found");
					}


					/* Try to read next line.
					 * If the next line is not available we are at the trailer.
					 * Otherwise we are still in the data part.
					 */
					while (true)
					{
						String nextLine = bufferedReader.readLine();
						if (null == nextLine)
						{
							//We are at the trailer.
							trailerMap = processDelimitedLine(currLine, trailerElementList);
							break;
						}
						else
						{
							//We are are at the data part still.
							bodyList.add(processDelimitedLine(currLine, dataElementList));
							currLine = nextLine;
						}
					}
				}
				else
				{
					dbg("Trying to read file with NO trailer.");
					//No trailer for this EDI file.
					boolean isFirstLineRead = false;
					while (true)
					{
						/* Read a line. 
						 * If the line is null and this is the first line read then 
						 * 		there is no data part in the file. 
						 * 		Throw exception.
						 * If the line is null but not first line, 
						 * 		then the end of the file has been reached. 
						 * 		Exit from the loop
						 * If the line is not null, process the line
						 */
						String line = bufferedReader.readLine();
						dbg("read line "+line);

						if (line == null)
						{
							if (!isFirstLineRead)
							{
								//No data at all. Throw Exception
								throw new Exception("No data found");
							}
							else
							{
								
								break;
							}
						}
						//We have read the first line.
						isFirstLineRead = true;
						//Process the line read.
						dbg("To process line");
						bodyList.add(processDelimitedLine(line, dataElementList));
					}
				}
			}
		}
		catch (Exception ebx)
		{
			throw ebx;
		}
		
		finally
		{
			//Clean-up
			try
			{
				file.close();
				reader.close();
				bufferedReader.close();
			}
			catch (Exception ex)
			{
				throw ex;
			}
		}

	}

    public HashMap readFileByRow( Connection conn,TransactionsetVO vo )
    throws Exception
	{
	    HashMap hm = new HashMap();
	    return hm;
	}
    
		/**
	 	This method takes a delimited String line, and an ArrayList of
	 	DatasegmentVO's , process the line, split it into fields and remove pad characters if any.
		 * @METHOD NAME              : processLine
		 * @PARAMS                   : String line, ArrayList dataElementList
		 * @RETURNS                  : HashMap with the indivudual elements of the datasegment as key value pairs.
		 * @THROWS                	 : EHSNBatchException
		 * @LAST MODIFIED BY         : TCS-148033
		 * @LAST MODIFIED DATE       : 16-Nov-2005
		 **/
	private HashMap processDelimitedLine(String line, 
											ArrayList dataElementList)
											throws Exception
	{
		DatasegmentVO dataSegmentVo = null;
		HashMap lineMap = new HashMap();
		String temp = ""; 
		try
		{
			int dataElementListSize = dataElementList.size();

			//Split input line based on the delimiter.
			StringTokenizer inputTokenizer = new StringTokenizer(line, delimiter);
			//Get the no of fields in the line.
			int noOfFields = inputTokenizer.countTokens();
			
			dbg("line read : "+
													line);
			
			dbg("No of fields expected : "+
													dataElementListSize+
													" No of fields got: "+
													noOfFields );
			/* If the expected no of fields in the line (=length of the dataElementList) and
			 * the  actual no of fields in the line donit match, then throw an exception.
			 */			 
			if (noOfFields != dataElementListSize)
			{
				throw new Exception("No of fields in file wrong");
			}
			else
			{
				//Loop through the datasegment list
				for (int j = 0; j < dataElementListSize; j++)
				{
					//Get a DatasegmentVO from the dataElementList 
					dataSegmentVo = (DatasegmentVO) dataElementList.get(j);
					
					//Process every attribute, remove pad chars and addit to the lineMap HashMap
					if (!(dataSegmentVo.getAttributename().equalsIgnoreCase(EHSNEDIConstants.EDI_DATASEGEMENT_FIELDNAME_SPACE))
						&& (!(dataSegmentVo.getAttributename().equalsIgnoreCase(EHSNEDIConstants.EDI_DATASEGEMENT_FIELDNAME_ZERO))))
					{
						String attName = dataSegmentVo.getAttributename();
						String attValue = inputTokenizer.nextToken();
						String padChar = dataSegmentVo.getPadchar();

						//If this field has padchars, remove them.
						if ((padChar != null) && (!padChar.equals("")))
						{
							StringBuffer tempString = new StringBuffer(attValue);

							if ((dataSegmentVo.getAlignment() != null)
								&& (dataSegmentVo.getAlignment().equalsIgnoreCase(
																	EHSNEDIConstants.EDI_DATASEGEMENT_RIGHT_ALIGN)))
							{
								int len = tempString.length();

								for (int i = 0; i < len; i++)
								{
									if (tempString.charAt(i) == padChar.toCharArray()[0])
									{
										tempString.replace(i, i + 1, " "); 
									} 
									else
									{
										break; 
									} 
								}
								attValue = tempString.toString().trim();
								
							}
							else if (
								(dataSegmentVo.getAlignment() != null)
								 && (dataSegmentVo.getAlignment().equalsIgnoreCase(
																	EHSNEDIConstants.EDI_DATASEGEMENT_LEFT_ALIGN)))
							{
								int len = tempString.length();

								for (int i = (len - 1); i >= 0; i--)
								{
									if (tempString.charAt(i) == padChar.toCharArray()[0])
									{
										tempString.replace(i, i + 1, " "); 
									} 
									else
									{
										break; 
									} 
								}
								attValue = tempString.toString().trim();
							}
						}
						else
						{
							attValue = attValue.trim();
						}
						if ((dataSegmentVo.getOptionalFlag()!= EHSNEDIConstants.FIELD_OPTIONAL_FLAG)	
							&& (dataSegmentVo.getDatatype() != null))
						{
							if (EHSNEDIConstants.EDI_DATATYPE_INTEGER.equals(dataSegmentVo.getDatatype()))
							{
								Long.parseLong(attValue);
							}
							if (EHSNEDIConstants.EDI_DATATYPE_DATE.equals(dataSegmentVo.getDatatype()))
							{
								attValue = EHSNEDIUtils.getTimeStampStringForDateString(attValue,
																						dataSegmentVo.getDateformat());
							}
						}
						temp += attName + attValue;
						lineMap.put(attName, attValue);
					}
				}
			}
		}
		catch (Exception ebe)
		{
			throw ebe;
		}

		return lineMap;
	}

}
