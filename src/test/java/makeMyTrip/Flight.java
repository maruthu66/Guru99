package makeMyTrip;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Flight {
	public WebDriver driver;
	public void screenShot(String ssName) throws Throwable {
		TakesScreenshot tk=(TakesScreenshot)driver;
		File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
		 File desc=new File("C:\\Users\\Hp\\Pictures\\"+ssName+".png");
	      FileUtils.copyFile(screenshotAs, desc);
	}
	
	@Given("Launch MakeMyTrip Application")
	public void launch_MakeMyTrip_Application() throws Throwable {
		WebDriverManager.edgedriver().setup();
	   driver=new EdgeDriver();
	   driver.get("https://www.makemytrip.com");
	   driver.manage().window().maximize();
	   screenShot("result");
	}

	@Given("User close the Advertisment")
	public void user_close_the_Advertisment() throws Throwable {
		Thread.sleep(5000);
		driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
		driver.findElement(By.xpath("//a[@class='close']")).click();
	    driver.switchTo().parentFrame();
	    driver.findElement(By.xpath("//div//span[@class='commonModal__close']")).click();
	    screenShot("result1");
	  
	}

	@Given("User cliks on one way trip")
	public void user_cliks_on_one_way_trip() throws Throwable {
		driver.findElement(By.xpath("//li[@class='selected']")).click();
		 screenShot("result2");
	}

	@Given("User enters the from place")
	public void user_enters_the_from_place() throws Throwable {
		 driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		    driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Chennai");
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("(//p[text()='Chennai International Airport'])[1]")).click();
		    screenShot("result3");
	}

	@Given("User enter the to place")
	public void user_enter_the_to_place() throws Throwable {
		driver.findElement(By.xpath("//label[@for='toCity']")).click();
  driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Tutucorin");
  Thread.sleep(3000);
  driver.findElement(By.xpath("//div[text()='TCR']")).click();
	   
	}

	@Given("User enter the date of depature")
	public void user_enter_the_date_of_depature() throws Throwable {
		try {
			driver.findElement(By.xpath("(//p[@class='blackText font20 code lineHeight36'])[1]")).click();
		} catch (Exception e) {
			System.out.println("run");
		}
		
		driver.findElement(By.xpath("(//div[@class='DayPicker-Day']//p[text()='20'])[1]")).click();
		 screenShot("result4");
	}

	@Given("User cliks on search")
	public void user_cliks_on_search() throws Throwable {
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//span[@class='bgProperties  overlayCrossIcon icon20']")).click();
		 screenShot("result5");
	}

	@Then("verify the from place,to place,travel date and class")
	public void verify_the_from_place_to_place_travel_date_and_class() {
	   
	}


	

}
