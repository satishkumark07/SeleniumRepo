package week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(3000);
		//getting title page
		String title = driver.getTitle();
		if (title.contains("Leaftaps")) {
			System.out.println("Login is successful");
		} else {
			System.out.println("Login is not successful");
		}
		
		//driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("SFA")).click();
		Thread.sleep(3000);
		driver.close();
		
		
		
	}

}
