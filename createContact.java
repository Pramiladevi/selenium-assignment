package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class createContact {

	public static void main(String[] args) {
        
		//set path & launch chromebrowser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//load the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		//UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		String text=driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		//Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();	
		//Click on contacts Button
		driver.findElement(By.linkText("Contacts")).click();
		//Click on Create Contact
		driver.findElement(By.linkText("Create Contact")).click();
		//Enter FirstName Field Using id Locator
		driver.findElement(By.id("firstNameField")).sendKeys("pramila");
		// Enter LastName Field Using id Locator
		driver.findElement(By.id("lastNameField")).sendKeys("s");
		//Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("pramila");
		//Enter LastName(Local) Field Using id Locator
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("s");
		//Enter Department Field Using any Locator of Your Choice
		driver.findElement (By.name("departmentName")).sendKeys("testing");
		// Enter Description Field Using any Locator of your choice 
		driver.findElement(By.id("createContactForm_description")).sendKeys("create contact");
		// Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("spmpramila1234@gmail.com");
		// Select State/Province as NewYork Using Visible Text
		
		WebElement dropdown1=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dd1=new Select(dropdown1);
		dd1.selectByVisibleText("New Mexico");
		
		//Click on Create Contact
		driver.findElement(By.name("submitButton")).click();
		//Click on edit button 
		driver.findElement(By.linkText("Edit")).click();
		//. Clear the Description Field using .clear
		driver.findElement(By.name("description")).clear();
		//Fill ImportantNote Field with Any text
		driver.findElement(By.name("importantNote")).sendKeys("contact created");
		// Click on update button using Xpath locator
		driver.findElement(By.xpath("//td[@colspan='4']/input")).click();
		//Get the Title of Resulting Page.
        String text1=driver.findElement(By.id("sectionHeaderTitle_contacts")).getText();
        System.out.println("title"+ text1);
		
		
	}

}
