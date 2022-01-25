package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginPageObject {
	
	@FindBy(id ="txtUsername" )
	public static WebElement userName;
	@FindBy(how = How.ID,using = "txtPassword")
	public static WebElement password;
	@FindBy(id ="btnLogin" )
	public static WebElement loginbutton;
	
	
	
	//Without Find Factory
//	public static WebElement userName(WebDriver driver) {
//		return driver.findElement(By.id("txtUsername"));
//	}
//
//	public static WebElement password(WebDriver driver) {
//		return driver.findElement(By.id("txtPassword"));
//}
//	
//	public static WebElement loginbutton(WebDriver driver) {
//		 return driver.findElement(By.id("btnLogin"));
//		
//	}
	
}
