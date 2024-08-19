package week2.Day1.HomeAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeads {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Satish");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("two");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Satish Company");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Company Title");
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(5000);
		
		String Title = driver.getTitle();
		System.out.println("I am priting title: "+Title);
		
		if (Title.contains("opentaps CRM")) {
			System.out.println("Title is displayed correctly.");
		}
		else {
			System.out.println("Title is not displayed correctly.");
		}
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
