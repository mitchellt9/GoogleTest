import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginTest 
{
	private static WebDriver driver;   //Static cannot access non static variable/functions, so pass driver as an argument elsewhere so that you do not need to instantiate again

	@SuppressWarnings("deprecation")
	public static void main(String args[]) throws InterruptedException
	{
		driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		
		//VALUES
		String email = "rosekate99@gmail.com";
		String pwd = "rosekate9999";
		
		
		
		
		// GET TITLE
		String loggedin = driver.getTitle();
		System.out.println(loggedin);
		
		
		//ASSERT TITLE
		Assert.assertEquals("Gmail", loggedin);
		
		//OR use the below code for validation
		
	/*	String ExpectedPageTitle = "Gmail";
		String ActualPageTitle = driver.getTitle();
		if(ExpectedPageTitle.equals(ActualPageTitle))
		{
		System.out.println("Verification successful-The correct title displayed on Web page");
		}
		else
		{
		System.out.println("Verification failed-It displayed wrong title on web page");
		}
		
	*/	
		//ENTER CREDS
		WebElement email_text = driver.findElement(By.id("Email"));
		email_text.sendKeys(email);
		driver.findElement(By.id("next")).click();
		
		// ASSERT RIGHT DISPLAY NAME IN PWD PAGE
	/*	WebElement display_name = driver.findElement(By.id("email-display"));
		System.out.println(display_name);
	*/	Thread.sleep(2000);
		
		//UNCHECK PERSISTENT COOKIE
		WebElement persistent_cookie = driver.findElement(By.xpath(".//*[@id='PersistentCookie']"));
		boolean check = persistent_cookie.isSelected();
		if(check == true)
		{
			persistent_cookie.click();
		}
		else
		{
			System.out.println("Already Unchecked");
		}
		
		//ENTER PWD
		Thread.sleep(1000);
		WebElement pwd_text = driver.findElement(By.id("Passwd"));
		pwd_text.sendKeys(pwd);
		driver.findElement(By.id("signIn")).click();
		
		//ASSERT TITLE TO VALIDATE INBOX
		String b = driver.getTitle();
		System.out.println(b);
		
		//ASSERT URL To VALIDATE INBOX
	/*	WebDriverWait wait = WebDriverWait(driver,15); */
		
		Thread.sleep(3000);
		String inbox_url = driver.getCurrentUrl();
		Assert.assertEquals("https://mail.google.com/mail/u/0/#inbox", inbox_url);
		System.out.println("I am in the Inbox");
		
		String main_window = driver.getWindowHandle();
		
		
		
		
		//TRAVERSING TO CONTACT TAB THROUGH DROP-DOWN
		try{
		WebElement contact = driver.findElement(By.xpath(".//*[@id=':j']"));
		contact.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 5); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id=':1h']/div")));  // until this submenu is found
		
		WebElement contact_click_menu = driver.findElement(By.xpath(".//*[@id=':1h']/div"));
		contact_click_menu.click();
		}
		catch(Exception e)
		{
			System.out.println("did not get the object");
		}
		
		
		//RETURN TO INBOX
		driver.switchTo().window(main_window);
		//driver.navigate().back();
		Thread.sleep(3000);
		String contacted = driver.getCurrentUrl();
		Assert.assertEquals("https://mail.google.com/mail/u/0/#inbox", contacted);
		System.out.println("Successfully returned from Contacts");
		
		
		//USE FILTER OPTIONS
		driver.findElement(By.xpath(".//*[@id=':2b']/div[1]/div")).click();
		driver.findElement(By.xpath(".//*[@id=':je']")).click();
		
		LogoutTest.logout(driver);
		
//		//LOGOUT
//		driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
//		driver.findElement(By.linkText("Sign out")).click();
//		Thread.sleep(3000);
//		String loggedout = driver.getTitle();
//		Assert.assertEquals("Gmail", loggedout);
//		System.out.println("Successfully Logged out");
		
		
		//QUIT
		driver.quit();
	}

	
	
	private static WebDriverWait WebDriverWait(WebDriver driver, int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
