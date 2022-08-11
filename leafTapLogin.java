package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class leafTapLogin {

	public static void main(String[] args) {
		//set path & launch chromebrowser
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			
	    //load url
			driver.get("https://acme-test.uipath.com/login");
			driver.manage().window().maximize();
	   //enter email
            driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
       //enter paasword
            driver.findElement(By.id("password")).sendKeys("leaf@12");
            driver.findElement(By.className("form-check-label")).click();
       //click log in button
           driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
       //get the page title and print
           String title="dashboard";
           System.out.println(title);
       //click logout
           driver.findElement(By.linkText("Log Out")).click();
       //close the browser
           driver.close();
	}

}
