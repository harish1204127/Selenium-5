package Basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;


public class get_attribute {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com/");
		WebElement googleSearchBtn = driver.findElement(By.name("q"));
		System.out.println("name="+googleSearchBtn.getAttribute("name"));
		System.out.println("text="+googleSearchBtn.getAttribute("type"));
		System.out.println("title="+googleSearchBtn.getAttribute("title"));
		System.out.println("class="+googleSearchBtn.getAttribute("class"));
		System.out.println("type="+googleSearchBtn.getAttribute("type"));

		System.out.println("spellcheck="+googleSearchBtn.getAttribute("spellcheck"));
		System.out.println("role="+googleSearchBtn.getAttribute("role"));
		System.out.println("autocorrect="+googleSearchBtn.getAttribute("autocorrect"));

	}

}
