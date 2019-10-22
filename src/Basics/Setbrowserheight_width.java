package Basics;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Setbrowserheight_width {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.navigate().to("https://www.rediff.com/");
		int width = 600;
		int height = 400;
		Dimension dimension = new Dimension(width, height);
		driver.manage().window().setSize(dimension);
		
		
		
		
		
		
	}

}
