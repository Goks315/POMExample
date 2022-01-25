package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		
		//pageFactory
		PageFactory.initElements(driver, loginPageObject.class);
		loginPageObject.userName.sendKeys("Admin");
		loginPageObject.password.sendKeys("admin123");
		loginPageObject.loginbutton.click();
		
		//Without pageFactory
//		loginPageObject.userName(driver).sendKeys("Admin");
//		loginPageObject.password(driver).sendKeys("admin123");
//		loginPageObject.loginbutton(driver).click();
		
		//Assign Leave with page Factory
	    PageFactory.initElements(driver, assignLeaveObjects.class);
		assignLeaveObjects.assignLeave.click();
		assignLeaveObjects.employeeName.sendKeys("Goks");
		assignLeaveObjects.leaveType.sendKeys("CAN - Matternity");
		assignLeaveObjects.assign.click();
		
		
//		assignLeaveObjects.assignLeave(driver).click();
//		assignLeaveObjects.employeeName(driver).sendKeys("Goks");
//		assignLeaveObjects.leaveType(driver).sendKeys("CAN - Matternity");
//		assignLeaveObjects.assign(driver).click();
	}
		
}
