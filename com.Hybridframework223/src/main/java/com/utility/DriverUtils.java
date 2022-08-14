package com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.BaseClass;

public class DriverUtils extends BaseClass{

	public static String getScreenshot(String name) {
		
		TakesScreenshot  ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String path= System.getProperty("user.dir")+"/screenshots/"+name+".jpg";
		File dest= new File(path);
		try {
			log.warn("file should not be null");
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			log.error("file is not present at specified location");
			e.printStackTrace();
		}
		return path;
	}
	
	
}
