import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com//cgi-bin//login.cgi");
		driver.manage().window().maximize();
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(5000); //waits for 5 seec
		
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();//clicks on ok button
		driver.close();
		
		//alert.dismiss(); //click on cancel button
		

	}

}
