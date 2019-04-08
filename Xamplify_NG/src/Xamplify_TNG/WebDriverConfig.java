package Xamplify_TNG;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverConfig {

public static WebDriver driver;

  public static WebDriver getInstance()
  {
    if (driver == null) 
    {
    /*	ChromeOptions options = new ChromeOptions();
    	options.addArguments("--disable-notifications");*/
    	
    	Map<String, Object> prefs = new HashMap<String, Object>();
    	prefs.put("profile.default_content_setting_values.notifications", 2);
        ChromeOptions options = new ChromeOptions();
    	options.setExperimentalOption("prefs", prefs);
    	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver2.exe");
    	driver = new ChromeDriver(options);
    }
    return driver;
  }
}
