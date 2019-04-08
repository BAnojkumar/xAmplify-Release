package Xamplify_TNG;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class webcam {

	WebDriver driver = WebDriverConfig.getInstance();
	Properties prop = Propertiesfile.readPropertyFile("fileproperties.properties");
	


	
@Test(priority=1)
	public void web() throws InterruptedException
	{
	WebElement ele = driver.findElement(By.xpath("//a[@href='javascript:;']//i[@class='fa fa-cloud-upload']"));
	Actions act = new Actions(driver);
	act.moveToElement(ele).perform();
Thread.sleep(5000);
	driver.findElement(By.xpath("//span[@class='title'][contains(text(),'Upload Content')]")).click();
Thread.sleep(10000);
	driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/app-upload-video[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/img[1]")).click();
Thread.sleep(5000);
	driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/app-upload-video[1]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]")).click();
	}

@Test(priority=2)
	public void allow() throws InterruptedException
	{
	
Thread.sleep(8000);	
	Map<String, Object> prefs = new HashMap<String, Object>();
	prefs.put("profile.default_content_setting_values.notifications", 2);
	ChromeOptions options = new ChromeOptions();
	options.setExperimentalOption("prefs", prefs);
Thread.sleep(5000);
	
	}
}


