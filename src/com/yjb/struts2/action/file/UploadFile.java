package com.yjb.struts2.action.file;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 负责上传文件并将文件存储在安全的位置
  * @author 2478683913@qq.com
  * @version 创建时间：2019年8月18日  下午7:25:35
 */
public class UploadFile extends ActionSupport{
	   private File myFile;//上传的文件，input的name
	   
	   private String myFileContentType;//- 这是上传的文件的内容类型
	   private String myFileFileName;//这是上传的文件的名称
	   private String destPath;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public String execute()  {
		  
	      try {
	    	  /* Copy file to a safe location */
		      destPath = "E:/yjb/Struts2/";
		      System.out.println("Src File name: " + myFile);
		      System.out.println("Dst File name: " + myFileFileName);
		      File destFile  = new File(destPath, myFileFileName);
			  FileUtils.copyFile(myFile, destFile);
		} catch (IOException e) {
 			e.printStackTrace();
 			return ERROR;
		}
 		return SUCCESS;
	}

	public File getMyFile() {
		return myFile;
	}

	public void setMyFile(File myFile) {
		this.myFile = myFile;
	}

	public String getMyFileContentType() {
		return myFileContentType;
	}

	public void setMyFileContentType(String myFileContentType) {
		this.myFileContentType = myFileContentType;
	}

	public String getMyFileFileName() {
		return myFileFileName;
	}

	public void setMyFileFileName(String myFileFileName) {
		this.myFileFileName = myFileFileName;
	}

	public String getDestPath() {
		return destPath;
	}

	public void setDestPath(String destPath) {
		this.destPath = destPath;
	}

	
	
}
