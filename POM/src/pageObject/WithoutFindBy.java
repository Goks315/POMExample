package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class WithoutFindBy {

	public static WebElement txtUsername;
	public static WebElement txtPassword;
	public static WebElement btnLogin;
	
	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		
		PageFactory.initElements(driver, WithoutFindBy.class);
		txtUsername.sendKeys("Admin");
		txtPassword.sendKeys("admin123");
		btnLogin.click();
	}
	
}
