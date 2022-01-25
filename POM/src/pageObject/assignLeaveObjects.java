package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class assignLeaveObjects {
	//FindFactory
	@FindBy(xpath ="//*[@id=\'dashboard-quick-launch-panel-menu_holder\']/table/tbody/tr/td[1]/div/a/span" )
	public static WebElement assignLeave;
	@FindBy(id = "assignleave_txtEmployee_empName")
	public static WebElement employeeName;
	@FindBy(id = "assignleave_txtLeaveType")
	public static WebElement leaveType;
    @FindBy(id = "assignBtn")
	 public static WebElement assign;
	
//	public static WebElement assignLeave(WebDriver driver) {
//		return driver.findElement(By.xpath("//*[@id=\'dashboard-quick-launch-panel-menu_holder\']/table/tbody/tr/td[1]/div/a/span"));
//	}
//	public static WebElement employeeName(WebDriver driver) {
//		return driver.findElement(By.id("assignleave_txtEmployee_empName"));
//	}
//	public static WebElement leaveType(WebDriver driver) {
//		return driver.findElement(By.id("assignleave_txtLeaveType"));
//	}
//    public static WebElement assign(WebDriver driver) {
//		return driver.findElement(By.id("assignBtn"));
//	
//	}
}
