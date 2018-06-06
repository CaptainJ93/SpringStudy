package com.best1.action;

import com.best1.base.BaseAction;
import com.best1.base.DataModel;
import com.best1.util.FileUtil;

public class FileConfigAction extends BaseAction {
	
	public String getFileContent() throws Exception {
		String realpath = getRequest().getRealPath(paramMap.get("filepath").toString());
		FileUtil fileUtil = new FileUtil();
		String s = fileUtil.readFileByLines(realpath);
		DataModel resData = new DataModel();
		resData.setErrCode("0");
		resData.setValue(s);
		commonOutPrint(resData);
		return null;
	}
	
	public String saveFileContent() throws Exception {
		String realpath = getRequest().getRealPath(paramMap.get("filepath").toString());
		FileUtil fileUtil = new FileUtil();
		fileUtil.writeFileContent(realpath,paramMap.get("content").toString());
		DataModel resData = new DataModel();
		resData.setErrCode("0");
		commonOutPrint(resData);
		return null;
	}
}
