package week2.Day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Step1
		ChromeDriver driver=new ChromeDriver();
		
		//Step2 > max the screen
		driver.manage().window().maximize();
		
		//step 3 : load the url
		driver.get("https://www.google.com");
		
		//step 5 close the browser
		driver.close();
		
		//EdgeDriver driver1=new EdgeDriver();
	}

}
