import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LogoutTest 
{
	//static WebDriver driver = new FirefoxDriver();
	
	@SuppressWarnings("deprecation")
	public static void logout(WebDriver driver) //passed from the main
	{
		driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
		driver.findElement(By.linkText("Sign out")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String loggedout = driver.getTitle();
		Assert.assertEquals("Gmail", loggedout);
		System.out.println("Successfully Logged out");
	}
	
}
