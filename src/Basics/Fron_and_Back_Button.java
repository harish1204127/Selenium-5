package Basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Fron_and_Back_Button {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.navigate().to("https://www.rediff.com/");
		driver.findElement(By.className("mailicon")).click();
		Thread.sleep(5000L);
		// back button
		driver.navigate().back();
		Thread.sleep(5000L);
		driver.navigate().forward();
		Thread.sleep(5000L);

		driver.quit();
		
		
		
		
		
	}

}
