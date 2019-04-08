package Xamplify_TNG;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UploadContent 
{
	
	  WebDriver driver = WebDriverConfig.getInstance();
	  Properties prop = Propertiesfile.readPropertyFile("fileproperties.properties");
	
@BeforeMethod
	public void Content_MouseHover() throws InterruptedException 
	{

		WebElement ele = driver.findElement(By.xpath(prop.getProperty("Content_Mousehover")));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='title'][contains(text(),'Upload Content')]")).click();
Thread.sleep(10000);

	}
	
@Test(priority=1,enabled=false)
	public void video_browse() throws IOException, InterruptedException 
	{

		driver.findElement(By.xpath("//div[@class='col-xs-12']//button[@class='btn btn-primary'][contains(text(),'Browse')]")).click();
		
Thread.sleep(3000);
		
		Runtime.getRuntime().exec("C:\\Users\\anojk\\Desktop\\selenium1.exe"); 
Thread.sleep(12000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div/div/app-upload-video/div/div[3]/div/div[1]/div[2]/div[1]/div/div/div[2]/div[2]/button[2]")).click();
Thread.sleep(10000);
		driver.findElement(By.xpath("//body[@class='login page-header-fixed page-sidebar-closed-hide-logo page-container-bg-solid page-sidebar-closed-hide-logo']/app-root[@ng-version='4.3.6']/app-home/div[@class='page-container']/app-leftsidebar/div[@class='page-sidebar-wrapper']/div[@class='page-sidebar navbar-collapse collapse']/ul[@class='page-sidebar-menu page-sidebar-menu-hover-submenu']/li[1]/a[1]")).click();
Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[2]/button[1]")).click();
Thread.sleep(10000);
		
	}
	
@Test(priority=2)
	public void video_dropbox() throws IOException, InterruptedException
	{
		
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/app-upload-video[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/img[1]")).click();
	    
		Set<String> hashset = (HashSet<String>) driver.getWindowHandles();
	    List<String> list = new ArrayList<String>(hashset);
	    System.out.println(list.toString());

Thread.sleep(5000);
		
	    driver.switchTo().window(list.get(1));
		System.out.println(list.get(1));
		
Thread.sleep(17000);
		
		driver.findElement(By.xpath("//*[@id=\"regular-login-forms\"]/div/div/button/div")).click();
		
		WebElement EmailidElement = driver.findElement(By.xpath("//*[@id=\"identifierId\"]")); 
		EmailidElement.sendKeys("banoj@stratapps.com");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
Thread.sleep(3000);
		
		WebElement EmailpwdElement = driver.findElement(By.name("password")); 
		EmailpwdElement.sendKeys("Anojmsinus");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content")).click();
		
Thread.sleep(20000);				
		
		driver.findElement(By.className("mc-checkbox-border")).click();
		driver.findElement(By.xpath("//button[@class='mc-button mc-button-primary']")).click();
		
Thread.sleep(8000);
		
		driver.switchTo().window(list.get(0));
		
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		driver.findElement(By.xpath("//button[@class='swal2-confirm styled']")).click();
		
Thread.sleep(10000);
	}
	
@Test(priority=3)
	public void video_box() throws IOException, InterruptedException
	{
Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='col-xs-4 col-sm-4 col-md-3 text-center margin-top-16']//img[@class='box']")).click();
		
		 Set<String> hashset1 = (HashSet<String>) driver.getWindowHandles();
		 List<String> list1 = new ArrayList<String>(hashset1);
		 System.out.println(list1.toString());

Thread.sleep(5000);
			
		 driver.switchTo().window(list1.get(1));
		 System.out.println(list1.get(1));
			
Thread.sleep(17000);
			
		 WebElement EmailidElement1 = driver.findElement(By.name("login")); 
		 EmailidElement1.sendKeys("anojkumar.anu@gmail.com");
		 
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 
Thread.sleep(3000);
			
		 WebElement EmailpwdElement1 = driver.findElement(By.name("password")); 
		 EmailpwdElement1.sendKeys("Anoj14312*");
		 
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 
Thread.sleep(12000);
		 
		 WebElement radio1=driver.findElement(By.xpath("//ul[@id='box-select-item-list']//li[2]//div[1]//div[2]//div[1]//input[1]"));
		 radio1.click();
		 
		 driver.findElement(By.xpath("//button[@id='popup_button_select']//span[@class='button_val']")).click();
		 
Thread.sleep(5000);
		 
		 driver.switchTo().window(list1.get(0));
		 
		 driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		 driver.findElement(By.xpath("//button[@class='swal2-confirm styled']")).click();
		 
Thread.sleep(10000);
	}
	
@Test(priority=4,enabled=false) 
	public void Content_Browse() throws IOException, InterruptedException
	{
Thread.sleep(4000);
		
		driver.findElement(By.xpath(prop.getProperty("contenthover"))).click();
		
Thread.sleep(3000);

		
		Runtime.getRuntime().exec("C:\\Users\\anojk\\Desktop\\AutoIT\\csvupload.exe"); 
	}

@Test(priority=5)
	public void Content_Dropbox() throws IOException, InterruptedException
	{
Thread.sleep(5000);		
		
		driver.findElement(By.xpath("//div[@class='col-xs-4 col-sm-4 text-center']//img[@class='dropBox']")).click();
		
Thread.sleep(5000);
				
				 Set<String> hashset2 = (HashSet<String>) driver.getWindowHandles();
				 List<String> list2 = new ArrayList<String>(hashset2);
				 System.out.println(list2.toString());

Thread.sleep(8000);
					
				 driver.switchTo().window(list2.get(1));
				 System.out.println(list2.get(1));
				
Thread.sleep(20000);				
					
				driver.findElement(By.xpath("//label[@class='mc-checkbox mc-checkbox-unchecked']//span[@class='mc-checkbox-border']")).click();
				driver.findElement(By.xpath("//span[contains(text(),'Choose')]")).click();
					
Thread.sleep(8000);
					
				driver.switchTo().window(list2.get(0));
					
				driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();

Thread.sleep(5000);
	
	}

@Test(priority=6)
	public void Content_box() throws IOException, InterruptedException
	{
Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='col-xs-4 col-sm-4 text-center margin-top-16']//img[@class='box']")).click();
		
		 Set<String> hashset3 = (HashSet<String>) driver.getWindowHandles();
		 List<String> list3 = new ArrayList<String>(hashset3);
		 System.out.println(list3.toString());

 Thread.sleep(5000);
			
		 driver.switchTo().window(list3.get(1));
		 System.out.println(list3.get(1));
			
Thread.sleep(12000);
		 
		 WebElement radio2=driver.findElement(By.xpath("//input[@name='f_356424112961']"));
		 radio2.click();
		 
		 driver.findElement(By.xpath("//button[@id='popup_button_select']//span[@class='button_val']")).click();
		 
Thread.sleep(5000);
		 
		 driver.switchTo().window(list3.get(0));
		 
		 driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		 
Thread.sleep(10000);
	}
}
