import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://bcom.levistrauss.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("j_username")).sendKeys("Uk.equity@test.com");
		driver.findElement(By.id("j_password")).sendKeys("Levis2015#");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/button")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("https://bcom.levistrauss.com/order/upload")).click();

//		WebElement element = driver.findElement(By.linkText("https://bcom.levistrauss.com/order/upload"));
//		JavascriptExecutor je = ((JavascriptExecutor) driver);
//		
//		je.executeScript("argument[0].scrollIntoView(true);",element);
		//driver.findElement(By.cssSelector("a.button-large"));
		driver.findElement(By.id("fileToUpload")).sendKeys("C:\\Users\\Sweekriti\\Downloads");
		
	}

}
