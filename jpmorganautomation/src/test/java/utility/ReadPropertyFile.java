package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

public class ReadPropertyFile {
	
	
	/* This Method is used to read the static values from property file */	
	public static String getConfigData(String strConfigKey){
		Logger logger = Logger.getLogger("ReadPropertyFile");
		String valueForGivenKey = null;
		try {
			String filepath = System.getProperty("user.dir") + "\\src\\test\\resources\\environmentprop\\global.properties";
			File file = new File(filepath);
			FileInputStream fileInput = new FileInputStream(file);
			Properties prop = new Properties();
			prop.load(fileInput);
			valueForGivenKey = prop.getProperty(strConfigKey);
		} catch (Exception e) {
			logger.debug("There is an exception while reading the file" +e.getMessage());
			e.printStackTrace();
		}
		return valueForGivenKey;
	}
}
