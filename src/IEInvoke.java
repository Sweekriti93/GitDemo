import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEInvoke {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","C:\\Program Files\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://google.com");
		//driver.quit();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
	}

}
