package makeMyTrip;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebookk {
	public WebDriver driver;
	int i;
	public void screenShots(String ms) throws Throwable {
		TakesScreenshot tk=(TakesScreenshot)driver;
		File screen = tk.getScreenshotAs(OutputType.FILE);
		 File descs=new File("C:\\Users\\Hp\\Pictures\\"+ms+".png");
	      FileUtils.copyFile(screen, descs);
		
	}
	
	@Given("launch Facebook {string}")
	public void launch_Facebook(String url) {
		WebDriverManager.edgedriver().setup();
		   driver=new EdgeDriver();
		   driver.get(url);
		   driver.manage().window().maximize();
		
	   
	}

	@When("Click create new account butt on")
	public void click_create_new_account_butt_on() {
	   driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	}

	@When("Create User Name {string}")
	public void create_User_Name(String fName) throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(fName);
				
	   
	}
	@When("Create User sur Name {string}")
	public void create_User_sur_Name(String lName) {
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lName);
	}

	@When("Enter Mobile number or email id {string}")
	public void enter_Mobile_number_or_email_id(String phno) {
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys(phno);
	   
	}

	@When("Create password {string}")
	public void create_password(String pass) {
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys(pass);
	   
	}

	@When("Click Date of Birth")
	public void click_Date_of_Birth() {
		WebElement ele=driver.findElement(By.xpath("//select[@id='day']"));
		 Select s=new Select(ele);
		  List<WebElement> option=  s.getOptions();   
	        for (WebElement elem : option) {
	        	System.out.println(elem.getText());
	        	String s1=elem.getText();
	        	if(s1.contains("21")) {
	        		driver.findElement(By.xpath("//option[@value='21']")).click();
	        	}
				}
		}
	@When("Select month")
	public void select_month() {
		WebElement ele=driver.findElement(By.xpath("//select[@id='month']"));
		 Select s=new Select(ele);
		  List<WebElement> option=  s.getOptions();   
	        for (WebElement elem : option) {
	        	System.out.println(elem.getText());
	        	String s1=elem.getText();
	        	if(s1.contains("Jun")) {
	        		driver.findElement(By.xpath("//option[text()='Jun']")).click();
	        	}
				}
	   
	}

	@When("select year")
	public void select_year() throws Throwable {
		WebElement ele=driver.findElement(By.xpath("//select[@id='year']"));
		 Select s=new Select(ele);
		  List<WebElement> option=  s.getOptions();   
	        for (WebElement elem : option) {
	        	System.out.println(elem.getText());
	        	String s1=elem.getText();
	        	if(s1.contains("1995")) {
	        		driver.findElement(By.xpath("//option[text()='1995']")).click();
	        		//screenShots("mss3");
	        	}
				}
	   
	}



	@When("Click Gender")
	public void click_Gender() throws Throwable {
driver.findElement(By.xpath("//label[text()='Male']")).click();
//screenShots("mss2");
	}

	@Then("Click SignUp {string}")
	public void click_SignUp(String string) throws Throwable {
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
			screenShots(string);
		
	    
	}



}
