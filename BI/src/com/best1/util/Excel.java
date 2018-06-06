package com.best1.util;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Excel {

	// 获取excel文件有几页
	public int getPage(String filepath) {
		int page = 0;
		try {
			Workbook book = Workbook.getWorkbook(new File(filepath));
			page = book.getNumberOfSheets();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return page;
	}

	// 将excel文件读入到list(list)中
	public List read(String filepath, int page) {

		List<List> list = new ArrayList<List>();

		try {
			Workbook book = Workbook.getWorkbook(new File(filepath));
			Sheet sheet = book.getSheet(page);
			int rowcnt = sheet.getRows();
			int colcnt = sheet.getColumns();
			int i = 0;
			int j = 0;

			for (i = 0; i < rowcnt; i++) {
				List row = new ArrayList();
				for (j = 0; j < colcnt; j++) {
					row.add(sheet.getCell(j, i).getContents().trim());
				}
				for (j = 0; j < colcnt && "".equals(row.get(j)); j++)
					;
				if (j == colcnt)
					continue;

				list.add(row);
			}

			book.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	//将excel文件读入到list(list)中
	public List read(InputStream inputStream) {
		
		List<List> list = new ArrayList<List>();
		
		try {
			Workbook book = Workbook.getWorkbook(inputStream);
			Sheet sheet = book.getSheet(0);
			int rowcnt = sheet.getRows();
			int colcnt = sheet.getColumns();
			int i = 0;
			int j = 0;			
			
			for (i = 0; i < rowcnt; i++) {
				List row = new ArrayList();
				for (j = 0; j < colcnt; j++) {
					row.add(sheet.getCell(j, i).getContents().trim());
				}
				for (j = 0; j < colcnt && "".equals(row.get(j)); j++);
				if(j==colcnt)continue;
				
				list.add(row);
			}
		
			book.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;

	}
	public String writeList(List<List> list, String filefullpath) {
		int i = 0, j = 0;
		try {
			WritableWorkbook book = Workbook.createWorkbook(new File(
					filefullpath));
			WritableSheet sheet = book.createSheet("第一页", 0);
			for (i = 0; i < list.size(); i++) {
				List row = list.get(i);
				for (j = 0; j < row.size(); j++) {
					Label label = new Label(j, i, row.get(j).toString());
					sheet.addCell(label);
				}
			}
			book.write();
			book.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public String writeHashMap(List<HashMap> list, String filefullpath) {
		int i = 0, j = 0;
		try {
			WritableWorkbook book = Workbook.createWorkbook(new File(
					filefullpath));
			WritableSheet sheet = book.createSheet("第一页", 0);

			Map row = (HashMap) list.get(0);
			Iterator it = row.entrySet().iterator();
			while (it.hasNext()) {
				Map.Entry entry = (Map.Entry) it.next();
				Label label = new Label(j++, i, entry.getKey().toString());
				sheet.addCell(label);
			}

			for (i = 0; i < list.size(); i++) {
				j = 0;
				row = (HashMap) list.get(i);
				it = row.entrySet().iterator();
				while (it.hasNext()) {
					Map.Entry entry = (Map.Entry) it.next();
					Label label = new Label(j++, i + 1, entry.getValue()
							.toString());
					sheet.addCell(label);
				}
			}
			book.write();
			book.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public String writeHashMap2os(List<HashMap> list, OutputStream os) {
		int i = 0, j = 0;
		try {
			WritableWorkbook book = Workbook.createWorkbook(os);
			WritableSheet sheet = book.createSheet("第一页", 0);

			Map row = (HashMap) list.get(0);
			Iterator it = row.entrySet().iterator();
			while (it.hasNext()) {
				Map.Entry entry = (Map.Entry) it.next();
				Label label = new Label(j++, i, entry.getKey().toString());
				sheet.addCell(label);
			}

			for (i = 0; i < list.size(); i++) {
				j = 0;
				row = (HashMap) list.get(i);
				it = row.entrySet().iterator();
				while (it.hasNext()) {
					Map.Entry entry = (Map.Entry) it.next();
					Label label = new Label(j++, i + 1, entry.getValue()
							.toString());
					sheet.addCell(label);
				}
			}
			book.write();
			book.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
