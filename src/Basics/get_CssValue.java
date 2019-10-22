package Basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;


public class get_CssValue {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com/");
		WebElement googleSearchBtn = driver.findElement(By.name("btnK"));
		System.out.println("color="+googleSearchBtn.getCssValue("color"));
		System.out.println("font-size="+googleSearchBtn.getAttribute("font-size"));
		System.out.println("text-align="+googleSearchBtn.getAttribute("text-align"));
		

	}

}
