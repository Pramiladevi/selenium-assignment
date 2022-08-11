package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebookassign {

	public static void main(String[] args) {
	//set path & launch chromebrowser
		WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	
	//load url
	driver.get("https://en-gb.facebook.com/");
	
	//driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	//maximise the window
	driver.manage().window().maximize();
	
	//add implict wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    //create new account 
	driver.findElement(By.linkText("Create New Account")).click();
	//enter the first name
	driver.findElement(By.name("firstname")).sendKeys("devi");
	//enter the last name
	driver.findElement(By.name("lastname")).sendKeys("s");	
	//email address
	driver.findElement(By.name("reg_email__")).sendKeys("spmpramiladevisvb2017@gmail.com");
	driver.findElement(By.name("reg_email_confirmation__")).sendKeys("spmpramiladevisvb2017@gmail.com");
	driver.findElement(By.id("password_step_input")).sendKeys("neem@123");
	
	
	//dropdown1(day)
	WebElement dropdown1=driver.findElement(By.id("day"));
	Select dd1=new Select (dropdown1);
    dd1.selectByValue("21");
	//dropdown2(month)
    WebElement dropdown2=driver.findElement(By.id("month"));
    Select dd2=new Select(dropdown2);
    dd2.selectByValue("12");
    //dropdown3(year)
    WebElement dropdown3=driver.findElement(By.id("year"));
    Select dd3=new Select(dropdown3);
    dd3.selectByValue("1999");
  
    //select radio button "female"
    driver.findElement(By.name("sex")).click();
    //sign up click function
    driver.findElement(By.name("websubmit")).click();
	
9
	
}
	
}

