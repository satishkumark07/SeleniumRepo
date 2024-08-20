package week2.Day2.HomeAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAcntSelectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[contains(@class,'Submit')]")).click();
		
		driver.findElement(By.xpath("//div[contains(@class,'crmsfa')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Account day2 two");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester.");
		driver.findElement(By.xpath("//input[@id='numberEmployees']")).sendKeys("30");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("LeafTaps");
		
		WebElement industry=driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select industryOption=new Select(industry);
		industryOption.selectByValue("IND_SOFTWARE");
		
		WebElement ownership=driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select ownershipOption=new Select(ownership);
		ownershipOption.selectByVisibleText("S-Corporation");
		
		WebElement marketing=driver.findElement(By.xpath("//select[@name='marketingCampaignId']"));
		Select marketingOption=new Select(marketing);
		marketingOption.selectByIndex(6);
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		if (driver.findElement(By.xpath("//span[@class='tabletext'][contains(text(),'Account day2 two')]")) != null) {
			System.out.println("Title is displayed correctly.");
			
		}
		else {
			System.out.println("Title is not displayed correctly.");
		}
		
		driver.close();
		
		
		
		
	}

}
