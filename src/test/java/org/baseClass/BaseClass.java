package org.baseClass;

import java.io.File;
import java.io.IOException;
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

public class BaseClass implements IBaseClass{
	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static 	WebElement ele;

	@Override
	public void browserLaunch(String url) throws Throwable {
		WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
		driver.get(url);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
	}

	@Override
	public void browserClose() {
	driver.quit();
		
	}

	@Override
	public void sendKeyss(WebElement e, String value) {
		 e.sendKeys(value);
		   
	}

	@Override
	public void sendKeyss(String value, WebElement e) {
		
		e.sendKeys(value);
		}

	@Override
	public void sendKeyss(String value, WebElement e, int i) {
		e.click();
		
		
	}

	@Override
	public void handleWindows() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleAlert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void takeScreenShot(String ms,WebElement e) throws  Throwable {
		    if(displayed(e)) {
			   
			   TakesScreenshot tk=(TakesScreenshot)driver;
			    Thread.sleep(2000);
			    js.executeScript("arguments[0].scrollIntoView(true)", ele);
			    Thread.sleep(3000);
				  File src=tk.getScreenshotAs(OutputType.FILE);
				  File desc=new File("C:\\Users\\Hp\\Pictures\\result1.png");
			      FileUtils.copyFile(src, desc);

		   }
		   
		   
		
	}
	
	public boolean displayed(WebElement e)
	{
		boolean displayed = e.isDisplayed();
		return displayed;
	}
	@Override
	public void scrollDown(WebElement ele1) {
		 js=(JavascriptExecutor)driver;
	    WebDriverWait d = new WebDriverWait(driver, Duration.ofSeconds(0));
		
	    d.until(ExpectedConditions.visibilityOfAllElements(ele1));
         //Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView(true)", ele1);
		
	}

	@Override
	public void switchFrame() {
		  driver.switchTo().frame(0);
	}

	
	public void mouseAction(WebElement ele2) {
		ele2.click();
	}
	
	

}
