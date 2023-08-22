package gram_power_project;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class E2E_Testing_2nd {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Tools\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		 WebDriver Driver = new FirefoxDriver();	
		 
		 Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 Driver.get("https://data.grampower.com/hes/");
		 
		 Driver.findElement(By.xpath("//input[@name='username']")).sendKeys("automationuser");
		 Driver.findElement(By.xpath("//input[@name='password']")).sendKeys("grampower");
		 Driver.findElement(By.xpath("//input[@value='LOG IN']")).click();
		 
		 Driver.findElement(By.xpath("//button[text()='Later']")).click();
		
		 try {
			 Driver.findElement(By.xpath("//div[@class='arrow-next']")).click();
		} catch (NoSuchElementException e) {
			
		}
		 
		 Driver.findElement(By.xpath("//div[@class='arrow-next']")).click();
		 
		 Driver.findElement(By.xpath("//div[@id='suggestion_box']/child::div/child::label")).click();
		 
		 Driver.findElement(By.xpath("//div[@title='ROFANANDA A']")).click();
		 
		 Driver.findElement(By.xpath("(//div[@aria-label='6'])[1]")).click();
		 
		 List<WebElement> Graph = Driver.findElements(By.xpath("(//*[local-name()='svg' and @aria-label='A chart.'])[2]//*[name()='rect']"));
		 Actions Act=new Actions(Driver);
		 
		for (WebElement A : Graph) {
			Act.moveToElement(A);
			
		}
	}

}
