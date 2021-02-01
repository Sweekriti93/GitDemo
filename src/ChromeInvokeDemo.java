import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeInvokeDemo {

	public static void main(String[] args) {
		
		//path of chrom edriver--- C:\Program Files\chromedriver.exe"
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		
		driver.close();
		driver.quit();
		

	}

}
