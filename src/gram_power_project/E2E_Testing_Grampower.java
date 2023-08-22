package gram_power_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class E2E_Testing_Grampower {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Tools\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		 WebDriver Driver = new FirefoxDriver();	
		 
		 Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 Driver.get("https://data.grampower.com/hes/");
		 
		 Driver.findElement(By.xpath("//input[@name='username']")).sendKeys("automationuser");
		 Driver.findElement(By.xpath("//input[@name='password']")).sendKeys("grampower");
		 
		 Driver.findElement(By.xpath("//input[@value='LOG IN']")).click();
		 
		 WebDriverWait Wait=new WebDriverWait(Driver, 20);
		 WebElement Pop_up= Driver.findElement(By.xpath("//button[text()='Later']"));
		 Wait.until(ExpectedConditions.visibilityOf(Pop_up));
		 Pop_up.click();
			
		 try {
			  WebElement Total_meters = Driver.findElement(By.xpath("//div[@class='sitewrap clearfix']/descendant::li[text()='ROFANANDA A ']"));
			  System.out.println("Total Meters= "+Total_meters.getText());
				
		      } catch (NoSuchElementException e) {
			
		}
		 try {
			 WebElement Assined_Meter =Driver.findElement(By.xpath("//div[@id='div_assign_count']"));
			 System.out.println("Assined Meters= "+Assined_Meter.getText());
		} catch (NoSuchElementException e) {
			
		}
	
		 
	
		 
	}


}
