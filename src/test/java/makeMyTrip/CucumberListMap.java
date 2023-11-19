package makeMyTrip;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CucumberListMap {
	public WebDriver driver;
	public void screenShots(String s) throws Throwable {
		TakesScreenshot tk=(TakesScreenshot)driver;
		File screen = tk.getScreenshotAs(OutputType.FILE);
		 File descs=new File("C:\\Users\\Hp\\Pictures\\"+s+".png");
	      FileUtils.copyFile(screen, descs);
	}
	@Given("Launch MakemyTrip Application {string}")
	public void launch_MakemyTrip_Application(String url) throws Throwable {
		WebDriverManager.edgedriver().setup();
		   driver=new EdgeDriver();
		   driver.get(url);
		   driver.manage().window().maximize();
		   screenShots("MS");
	   
	}

	@Given("User close the Advertisments")
	public void user_close_the_Advertisments() throws Throwable {
		Thread.sleep(5000);
		driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
		driver.findElement(By.xpath("//a[@class='close']")).click();
	    driver.switchTo().parentFrame();
	    driver.findElement(By.xpath("//div//span[@class='commonModal__close']")).click();
	   
	}

	@When("User cliks on the one way trip")
	public void user_cliks_on_the_one_way_trip() throws Throwable {
		driver.findElement(By.xpath("//li[@class='selected']")).click();
		 screenShots("MS1");
	    
	}

	@When("User enterr the from place #with one dim list")
	public void user_enterr_the_from_place_with_one_dim_list(DataTable dataTable)throws Throwable {
		List<String> li=dataTable.asList();
		String value=li.get(0);
		 driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		    driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(value);
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//p[text()='"+value+", India']")).click();
		    screenShots("MS2");
	    
	}

	@When("User enters the to place#with one dim map")
	public void user_enters_the_to_place_with_one_dim_map(DataTable plac) throws Throwable {
		Map<String, String> mp=plac.asMap(String.class,String.class);
		String ms=mp.get("place1");
		driver.findElement(By.xpath("//label[@for='toCity']")).click();
		  driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(ms);
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//p[text()='"+ms+", India']")).click();
		  screenShots("MS3");
	}

	@When("User clikes on the one way trip")
	public void user_clikes_on_the_one_way_trip() {
		driver.findElement(By.xpath("//li[@class='selected']")).click();
	    
	}
	@When("User enters the from place #with one dim list")
	public void user_enters_the_from_place_with_one_dim_list(DataTable dataTable) throws Throwable {
		List<String> li=dataTable.asList();
		String value1=li.get(2);
		 driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		    driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(value1);
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//p[text()='"+value1+", India']")).click();
		    screenShots("MS4");
	   
	}


	@When("User enterr the to place#with one dim map")
	public void user_enterr_the_to_place_with_one_dim_map(DataTable place) throws InterruptedException {
		Map<String, String> mp=place.asMap(String.class,String.class);
		String mss=mp.get("place3");
		driver.findElement(By.xpath("//label[@for='toCity']")).click();
		  driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(mss);
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//p[text()='"+mss+", India']")).click();
	   
	}



}
