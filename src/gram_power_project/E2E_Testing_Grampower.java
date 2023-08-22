package gram_power_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2E_Testing_Grampower {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Tools\\chromedriver\\chromedriver.exe");
		
		 
		 Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
