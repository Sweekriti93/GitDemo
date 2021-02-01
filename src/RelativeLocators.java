import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://courses.rahulshettyacademy.com//sign_up");
		driver.findElement(By.className("theme-btn")).click();
		WebElement nameEdirBox = driver.findElement(By.id("user_name"));
		driver.findElement(withTagName("control-label")).above(nameEdirBox).getText();
		 
		
		driver.quit();
	}

}
