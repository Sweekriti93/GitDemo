import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.testproject.io//signup");
		driver.findElement(By.id("first-name")).sendKeys("Sweekriti");
		driver.findElement(By.name("last_name")).sendKeys("Sinha");
		driver.findElement(By.name("email")).sendKeys("sweekritipwc@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("SweeSai@123");;
		driver.findElement(By.className("tp-checkbox-input-view")).click();
		
	driver.manage().window().maximize();
	driver.findElement(By.className("tp-submit-wrapper")).click();
//	driver.wait(2000);
//	driver.close();
//		
//		

	}

}
