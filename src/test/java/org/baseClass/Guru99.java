package org.baseClass;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Guru99 extends BaseClass {
	
	public static String url="https://www.guru99.com/become-an-instructor";
	
	//local //instance //global
public static void main(String[] args) throws Throwable {
	
	
		BaseClass b=new BaseClass();
		b.browserLaunch(url);
		WebElement ele1=driver.findElement(By.xpath("//h2[text()='💡 Simply fill-up the form below to begin:']"));
		b.scrollDown(ele1);
		b.switchFrame();
		WebElement ele2= driver.findElement(By.xpath("(//button[text()='Next'])[1]"));
		b.mouseAction(ele2);
		b.sendKeyss(driver.findElement(By.xpath("(//input[@type='text'])[3]")), "maruthu");
		WebElement email = driver.findElement(By.xpath("(//input[@type='email'])[1]"));
	  b.sendKeyss(email, "pandimaruthu@gmail.com");
	  WebElement email1= driver.findElement(By.xpath("(//input[@type='number'])[1]"));
	  b.sendKeyss(email1,"66995503");
		  WebElement as=  driver.findElement(By.xpath("(//button[text()='Next'])[3]"));
		  b.sendKeyss(null, as, 0);
	    Thread.sleep(1000);
	    WebElement aas=  driver.findElement(By.xpath("(//span[text()='YES'])[1]"));
	    b.sendKeyss(null, aas, 0);
	    Thread.sleep(1000);
	    WebElement aas1=driver.findElement(By.xpath("(//span[text()='YES'])[2]"));
	    b.sendKeyss(null, aas1, 0);
	    Thread.sleep(1000);
	    WebElement aas2=driver.findElement(By.xpath("(//span[@class='jfCheckbox-customInputIcon'])[1]"));
	    b.sendKeyss(null, aas2, 0);
	    
	    WebElement aas3=driver.findElement(By.xpath("(//button[text()='Next'])[8]"));
	    b.sendKeyss(url, aas3, 0);
	    Thread.sleep(1000);
	    WebElement aas4=driver.findElement(By.xpath("(//label[@aria-hidden='true'])[4]"));
	    b.sendKeyss(null, aas4, 0);
	    Thread.sleep(1000);
	    Runtime.getRuntime().exec("C:\\Users\\Hp\\Downloads\\file upload.exe");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//button[text()='Next'])[9]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//span[@class='jfCheckbox-customInputIcon'])[8]")).click();
	    Thread.sleep(1000);
	   WebElement first= driver.findElement(By.xpath("(//button[text()='Submit'])[11]"));
	   
	   WebElement second=driver.findElement(By.xpath("(//*[@class='jfInput-button forNext u-right'])[11]"));
	   if(first.isDisplayed()) {
		   first.click(); 
	   }else if(second.isDisplayed()) {
		   second.click();
		   driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("maruthu");
		   driver.findElement(By.xpath("(//button[text()='Submit'])[12]")).click();
		   
	   }
	   WebElement thankyou = driver.findElement(By.xpath("(//*[contains(text(),'Thank You!')])[2]"));
	 b.takeScreenShot("ms",thankyou);
	    	}
}
