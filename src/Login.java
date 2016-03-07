
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

@SuppressWarnings("deprecation")
public class Login
		{
			private static WebDriver driver;   //Static cannot access non static variable/functions, so pass driver as an argument elsewhere so that you do not need to instantiate again

			public static void main(String args[]) throws InterruptedException
			{
				driver = new FirefoxDriver();
				driver.get("https://www.gmail.com");
				driver.manage().window().maximize();
				
				//VALUES
				String email = "cmosx2011@gmail.com";
				String pwd = "Webyog123";
				
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
				Thread.sleep(3000);
				Compose.compose(driver);
				//Search.search(driver);

	}

}

