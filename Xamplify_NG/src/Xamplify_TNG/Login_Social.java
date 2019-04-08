package Xamplify_TNG;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login_Social {
	
	WebDriver driver = WebDriverConfig.getInstance();
	Properties prop = Propertiesfile.readPropertyFile("fileproperties.properties");
	
@Test(priority=1)
	public void homePage() throws InterruptedException
	{

		driver.manage().window().maximize();
		driver.get(prop.getProperty("Baseurl")); 								
		driver.findElement(By.xpath(prop.getProperty("Loginclick1"))).click();
	}

@Test(priority=2,enabled=false)
	public void facebook() throws InterruptedException
	{
Thread.sleep(8000);	
	driver.findElement(By.xpath(prop.getProperty("FbClick"))).click();
Thread.sleep(5000);
		WebElement fbUserName = driver.findElement(By.xpath(prop.getProperty("Fbemailclick")));
		fbUserName.sendKeys(prop.getProperty("Fbmailid"));
		WebElement fbPwd = driver.findElement(By.xpath(prop.getProperty("Fbpwdclick")));
		fbPwd.sendKeys(prop.getProperty("Fbpwd"));
		driver.findElement(By.xpath(prop.getProperty("Fbsignin"))).click();
Thread.sleep(5000);
		driver.findElement(By.xpath(prop.getProperty("Logoutclick"))).click();
Thread.sleep(3000);
		driver.findElement(By.xpath(prop.getProperty("Logout"))).click();
Thread.sleep(5000);
		driver.findElement(By.xpath(prop.getProperty("Loginclick1"))).click();
	}

@Test(priority=3,enabled=false)
	public void twitter() throws InterruptedException
	{
Thread.sleep(5000);		
	driver.findElement(By.xpath(prop.getProperty("TwitterClick"))).click();
Thread.sleep(5000);
		WebElement TUserName = driver.findElement(By.xpath(prop.getProperty("TUsernameClick")));
		TUserName.sendKeys(prop.getProperty("TUsername"));
		WebElement TPwd = driver.findElement(By.xpath(prop.getProperty("TPwdClick")));
		TPwd.sendKeys(prop.getProperty("Tpwd"));
		driver.findElement(By.xpath(prop.getProperty("TSubmit"))).click();
Thread.sleep(5000);
		driver.findElement(By.xpath(prop.getProperty("Logoutclick"))).click();
Thread.sleep(3000);
		driver.findElement(By.xpath(prop.getProperty("Logout"))).click();
Thread.sleep(5000);
		driver.findElement(By.xpath(prop.getProperty("Loginclick1"))).click();
	}

@Test(priority=4,enabled=false)
	public void Linkedin() throws InterruptedException
	{
Thread.sleep(5000);		
	driver.findElement(By.xpath(prop.getProperty("LIClick"))).click();
Thread.sleep(5000);
		WebElement LUserName = driver.findElement(By.id(prop.getProperty("LUserNameclick")));
		LUserName.sendKeys(prop.getProperty("LUserName"));
		WebElement LPwd = driver.findElement(By.id(prop.getProperty("Lpwdclick")));
		LPwd.sendKeys(prop.getProperty("Lpwd"));
		driver.findElement(By.xpath(prop.getProperty("LSubmit"))).click();
Thread.sleep(5000);
		driver.findElement(By.xpath(prop.getProperty("Logoutclick"))).click();
Thread.sleep(3000);
		driver.findElement(By.xpath(prop.getProperty("Logout"))).click();
Thread.sleep(5000);
		driver.findElement(By.xpath(prop.getProperty("Loginclick1"))).click();
	}

@Test(priority=5,enabled=true)
	public void general_login() throws InterruptedException
	{
	
Thread.sleep(5000);
		WebElement usernameElement = driver.findElement(By.name(prop.getProperty("GusernameClick"))); 
		WebElement passwordElement = driver.findElement(By.name(prop.getProperty("GpasswordClick")));
		usernameElement.sendKeys(prop.getProperty("Gusername"));
		passwordElement.sendKeys(prop.getProperty("Gpassword"));
		driver.findElement(By.id(prop.getProperty("Gsubmit"))).click();
Thread.sleep(3000);
	}
}




