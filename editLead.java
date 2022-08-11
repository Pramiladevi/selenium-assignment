package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class editLead {

	public static void main(String[] args) throws InterruptedException {
	 //set path & launch chromebrowser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
    //load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
	//Enter the username	
        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
    //enter password
        driver.findElement(By.id("password")).sendKeys("crmsfa");
    //click log in
        driver.findElement(By.className("decorativeSubmit")).click();
    //click crmsfa link
        driver.findElement(By.linkText("CRM/SFA")).click();
    //click lead link
        driver.findElement(By.linkText("Leads")).click();
    //click find leads    
        driver.findElement(By.linkText("Find Leads")).click();
    //enter first name
       driver.findElement(By.id("ext-gen248")).sendKeys("pramila");   
    //Click Find leads button 
     driver.findElement(By.id("ext-gen334")).click();
     Thread.sleep(5000);
    // Click on first resulting lead    
        driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
    //Verify title of the page 
		String title1="View Lead | opentaps CRM";
		String title2=driver.getTitle();
		System.out.println(title2);
		if(title2.equals(title1)){   // double equal id =s give a incorrect value because of string we dot equal .value we use double equal
			System.out.println("verified");
		}else {
		System.out.println("not same");
		}
	
    //Click Edit  
      driver.findElement(By.className("subMenuButton")).click();
    //Change the company names
      driver.findElement(By.id("createLeadForm_companyName")).clear();
      driver.findElement(By.id("createLeadForm_companyName")).sendKeys("tcs");
    // Click Update  
     driver.findElement(By.className("smallSubmit")).click();
   //Confirm the changed name appears
	  String text1=driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
	  System.out.println(text1);
    //Close the browser (Do not log out) 
     driver.close();
     driver.quit();
     
	}

}
