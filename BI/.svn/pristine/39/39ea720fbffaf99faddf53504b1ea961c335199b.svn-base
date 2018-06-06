package com.best1.base;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.best1.util.JsonUtil;
import com.best1.util.Node;

import jxl.Workbook;
import jxl.format.Alignment;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableImage;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

public class DataModel {
	private int page;// 当前页数
	private long total;// 总页数
	private long records;// 总记录数
	private List rows;// 多条查询记录
	private HashMap resultMap;// 一条查询记录
	private String value;
	private String errCode;// 错误代码
	private String errMsg;// 错误信息
	private HashMap userData; // 统计参数
	private String sql;//执行的sql
	private HashMap chartXML;//图表展现
	
	public DataModel() {
		this.page = 0;
		this.total = 0;
		this.records = 0;
		this.rows = null;
		resultMap = null;
		userData = new HashMap();
		value = "";
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public long getRecords() {
		return records;
	}

	public void setRecords(long records) {
		this.records = records;
	}

	public List getRows() {
		return rows;
	}

	public void setRows(List rows) {
		this.rows = rows;
	}

	public HashMap getResultMap() {
		return resultMap;
	}

	public void setResultMap(HashMap resultMap) {
		this.resultMap = resultMap;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public HashMap getUserData() {
		return userData;
	}

	public void setUserData(HashMap userData) {
		this.userData = userData;
	}

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	public HashMap getChartXML() {
		return chartXML;
	}

	public void setChartXML(HashMap chartXML) {
		this.chartXML = chartXML;
	}

	/**
	 * 转换dataModel的resultMap为json字符串
	 * 
	 * @return String
	 */
	public String resultMapToJson() {
		JSONObject jo = null;
		try {
			if (resultMap != null && resultMap.size() > 0) {
				resultMap.put("errCode", errCode);
				resultMap.put("errMsg", errMsg);
				jo = (JSONObject) JSONSerializer.toJSON(resultMap);
				return jo.toString();
			} else {
				return "{\"errCode\":\"" + errCode + "\",\"errMsg\":\""
						+ errMsg + "\"}";
			}
		} catch (Exception e) {
			return "{\"errCode\":\"" + errCode + "\",\"errMsg\":\"" + errMsg
					+ "\"}";
		}
	}

	/***************************************************************************
	 * @describe:返回JSON串，包括处理Date类型数据,转换dataModel的resultList为json字符串
	 **************************************************************************/
	public  String resultListToJson() {
		String result = null;
		try {
			HashMap<String, Object> map = new HashMap<String, Object>();
			if (rows != null && rows.size() > 0) {
				map.put("page", this.page);
				map.put("total", this.total);
				map.put("records", this.records);
				map.put("rows", this.rows);
				map.put("userdata", this.userData);
				map.put("errCode", this.errCode);
				map.put("errMsg", this.errMsg);
				map.put("resultMap", this.resultMap);
				map.put("value", this.value);
				map.put("chartXML", this.chartXML);
			} else {
				map.put("page", "0");
				map.put("total", "0");
				map.put("records", "0");
				map.put("rows", this.rows);
				map.put("errCode", this.errCode);
				map.put("errMsg", this.errMsg);
				map.put("resultMap", this.resultMap);
				map.put("value", this.value);
				map.put("chartXML", this.chartXML);
			}
			result = JsonUtil.getJSONString(map);
		} catch (Exception e) {
			return "{}";
		}
		return result;
	}
	
	/***************************************************************************
	 * @describe:把结果集rows转换成excel输出到输出流里
	 **************************************************************************/
	public void resultListToExcel(String colNamesStr, String colModelStr,
			ServletOutputStream  os) {
		try {
			WritableWorkbook wbook = Workbook.createWorkbook(os);   
			String[] colNames = colNamesStr.split(",");
			String[] colModel = colModelStr.split(",");
			int i = 0, j = 0;
			WritableSheet sheet = wbook.createSheet("第一页", 0);
			Map row = (HashMap) rows.get(0);
			for (i = 0; i < colNames.length; i++) {
				Label label = new Label(i, 0, colNames[i].toString());
				sheet.addCell(label);
			}
			for (i = 0; i < rows.size(); i++) {
				for (j = 0, row = (HashMap) rows.get(i); j < colModel.length; j++) {
					if(row.get(colModel[j])!=null){
						Label label = new Label(j, i + 1, row.get(colModel[j]).toString());
						sheet.addCell(label);
					}
				}
			}			
			wbook.write();
			wbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/***************************************************************************
	 * @describe:把结果集rows转换成excel输出到服务器端
	 **************************************************************************/
	public void resultListToExcelToServer(String colNamesStr, String colModelStr,
			File file) {
		try {
			WritableWorkbook wbook = Workbook.createWorkbook(file);   
			String[] colNames = colNamesStr.split(",");
			String[] colModel = colModelStr.split(",");
			int i = 0, j = 0;
			WritableSheet sheet = wbook.createSheet("第一页", 0);
			Map row = (HashMap) rows.get(0);
			for (i = 0; i < colNames.length; i++) {
				Label label = new Label(i, 0, colNames[i].toString());
				sheet.addCell(label);
			}
			for (i = 0; i < rows.size(); i++) {
				for (j = 0, row = (HashMap) rows.get(i); j < colModel.length; j++) {
					if(row.get(colModel[j])!=null){
						Label label = new Label(j, i + 1, row.get(colModel[j]).toString());
						sheet.addCell(label);
					}
				}
			}			
			wbook.write();
			wbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/***************************************************************************
	 * @describe:把结果集rows转换成excel输出到输出流里并对列进行合并
	 * 参数说明：
	 * layout为图片导入excel的位置，分上(top)下(bottom)左(left)右(right)
	 * addLineNum为增加行数，当layout=top时需要填写
	 * addColNum为增加猎术，当layout=left时需要填写
	 **************************************************************************/
	public void resultListToExcelMergeColumns(String colNamesStr, String colModelStr,String mergeColStr,String imageNameStr,
			//String layout,int addLineNum,int addColNum,
			ServletOutputStream  os) {
		try {
			WritableWorkbook wbook = Workbook.createWorkbook(os);   
			String[] colNames = colNamesStr.split(",");
			String[] colModel = colModelStr.split(",");
			String[] mergeCol = "".equals(mergeColStr)?new String[0]:mergeColStr.split(",");
			HashMap<String, Integer> colMap = new HashMap<String, Integer>();//存放合并列的列号
			int i = 0, j = 0;
			WritableSheet sheet = wbook.createSheet("第一页", 0);
			
			//文字对齐方式
	        WritableCellFormat wcf = new WritableCellFormat();  
	        wcf.setAlignment(Alignment.CENTRE);//把水平对齐方式指定为居中 
	        wcf.setVerticalAlignment(jxl.format.VerticalAlignment.CENTRE);//把垂直对齐方式指定为居中 
	        
			Map row = (HashMap) rows.get(0);
			for (i = 0; i < colNames.length; i++) {
				Label label = new Label(i, 0, colNames[i].toString(),wcf);
				sheet.addCell(label);
			}
			for (i = 0; i < mergeCol.length; i++) {
				while(j < colModel.length){
					if(mergeCol[i].toString().equals(colModel[j].toString())){
						colMap.put(mergeCol[i].toString(), j);
						j = 0;
						break;
					}
					j++;
				}
			}
			for (i = 0; i < rows.size(); i++) {
				for (j = 0, row = (HashMap) rows.get(i); j < colModel.length; j++) {
					if(row.get(colModel[j])!=null){
						Label label = new Label(j, i + 1, row.get(colModel[j]).toString(),wcf);
						sheet.addCell(label);
					}
				}
			}
			
			/*根据需要合并的列信息进行遍历，将单元格内值相同的列进行合并
			 * ps:sheet.mergeCells(列, 行, 列, 行);
			 */
			int startColumnIndex = 0,startRowIndex = 0,endColumnIndex = 0,endRowIndex = 0,k=0;
			for(k = 0; k < mergeCol.length; k++){
				String cellName = "";
				startColumnIndex = colMap.get(mergeCol[k].toString());
				endColumnIndex = colMap.get(mergeCol[k].toString());
				for (i = 0; i < rows.size(); i++) {
					row = (HashMap) rows.get(i);
					if("".equals(cellName)){
						cellName = row.get(mergeCol[k]).toString();//获得第一次得到的值
						startRowIndex = 1;
						endRowIndex = startRowIndex;
					}else if(cellName.equals(row.get(mergeCol[k]).toString())){
						endRowIndex++;
						if(endRowIndex == rows.size()){//当循环到最后一行时则执行合并
							sheet.mergeCells(startColumnIndex, startRowIndex, endColumnIndex, endRowIndex);
						}
					}else{//若!cellName.equals(row.get(mergeCol[k]).toString()),则将之前的单元格合并，后续单元格再重新计算
						sheet.mergeCells(startColumnIndex, startRowIndex, endColumnIndex, endRowIndex);
						startRowIndex = endRowIndex + 1;//重新定位起始单元格
						endRowIndex = startRowIndex;
					}
				}
			}
			//根据图片名称插入excel中  
			int imgcol,imgrow,imgwidth,imgheight;
			String imageName,layout,imgpath;
			if(!"".equals(imageNameStr) && imageNameStr != null){
				HttpServletRequest request = ServletActionContext.getRequest();
				imgpath = request.getSession().getServletContext().getRealPath("/")+"report/image/";
				String[] images = imageNameStr.split(";");
				for(int m=0;m<images.length;m++){
					String[] image = images[m].split(",");
					imageName = image[0];
					layout = image[1];
					imgcol = Integer.parseInt(image[2]);
					imgrow = Integer.parseInt(image[3]);
					imgwidth = Integer.parseInt(image[4]);
					imgheight = Integer.parseInt(image[5]);
					if("top".equals(layout)){
						for(k=0;k<imgheight;k++){
							sheet.insertRow(0);	
						}
					}else if("left".equals(layout)){
						for(k=0;k<imgwidth;k++){
							sheet.insertColumn(0);	
						}
					}
					File file = new File(imgpath+imageName);
					insertImage(sheet,imgcol,imgrow,imgwidth,imgheight,file);
				}
			}
			wbook.write();
			wbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/* sheet 待插入的工作表
	 * col 图片从该列开始
	 * row 图片从该行开始
	 * width 图片所占的列数
	 * height 图片所占的行数
	 * imgFile 要插入的图片文件
	 */
	public void insertImage(WritableSheet sheet,int col,int row,int width,int height,File imgFile){
		WritableImage img = new WritableImage(col,row,width,height,imgFile);
		sheet.addImage(img);
	}
	/***************************************************************************
	 * @describe:把具有树形结构的结果集转换json字符串
	 **************************************************************************/
	public String resultTreeToJson(){
		List<Node> nodeList = new ArrayList();  	
		//把rows里的hashmap变成Node
		if(rows==null||rows.size()<1){
			return "[]";
		}else{
			//转换rows为树形节点结构
			nodeList = transformList(rows);
			JsonUtil jsonUtil = new JsonUtil();
			//递归树形节点
			//jsonUtil.recursionFn(nodeList, (Node)nodeList.get(0)); 
		    return jsonUtil.modifyNodeListStr(nodeList);
		}
	}
	
	private List<Node> transformList(List list){
		List<Node> nodeList = new ArrayList(); 
		if(list!=null&&list.size()>0){
			for(int i = 0; i < list.size(); i++){
				HashMap map = (HashMap)list.get(i);
				String id = map.get("id")==null?"":map.get("id").toString();
				String text = map.get("text")==null?"":map.get("text").toString();
				String parentId = map.get("parentId")==null?"":map.get("parentId").toString();
				String level = map.get("level")==null?"":map.get("level").toString();
				map.remove("id");
				map.remove("text");
				map.remove("parentId");
				nodeList.add(new Node(id,parentId,text,level,map));
			}
		}else{
			nodeList = null;
		}
		return nodeList;
	}
}
