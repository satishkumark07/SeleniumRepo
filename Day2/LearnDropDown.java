package week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

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
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("three");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Satish Company");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Company Title");
		//this is for selecting value from source dropdown
		WebElement so = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select opt=new Select(so);
		opt.selectByIndex(5);
		Thread.sleep(2000);
		
		//this is for selecting value from marketing compaign dropdown
		WebElement mk = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select mkopt=new Select(mk);
		mkopt.selectByValue("CATRQ_AUTOMOBILE");
		Thread.sleep(2000);
				
		//this is for selecting value from preferred currency dropdown (KPW - North Korean Won)
		WebElement pc = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select pcopt=new Select(pc);
		pcopt.selectByVisibleText("KPW - North Korean Won");
		Thread.sleep(2000);
		
		
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
