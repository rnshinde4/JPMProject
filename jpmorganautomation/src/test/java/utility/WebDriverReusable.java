package utility;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import utility.ReadPropertyFile;

public class WebDriverReusable {
	public static WebDriver driver;
	public static String browser = ReadPropertyFile.getConfigData("browser");
	public static String chromeDriverPath = ReadPropertyFile.getConfigData("chromeDriver");
	public static String iEDriverPath = ReadPropertyFile.getConfigData("iEDriver");
	
	/*-------------Below method is for initialization of driver------------ */
	public static WebDriver getDriver() {
		
		Logger logger = Logger.getLogger("WebDriverReusable");
		
		try {
			switch (browser) {
			case "IE":
				System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + iEDriverPath);
				driver = new InternetExplorerDriver(); 
				break;
			case "chrome":
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + chromeDriverPath);
				driver = new ChromeDriver();
				break;
			default:
				logger.info("No browser is defined");
				break;
			}
		} catch (Exception e) {
			logger.debug("Exception captured:" + e.getMessage());
			e.printStackTrace();
		}
		return driver;
	}	
}
