import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Search 
{
public static void EmailSearch(WebDriver driver) throws InterruptedException
{
	
	WebElement search_input = driver.findElement(By.id("gbqfq"));
	search_input.sendKeys("buddy");
	search_input.sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[contains(text(), 'Hi budd')]"));
	
//	WebElement text1 = driver.findElement(By.xpath(".//*[@id=':4']"));
//	String result = text1.getText();
//	System.out.println(text);
//	if(text.matches("buddy"))
//	{
//		System.out.println("Success");
//	}
//	else
//	{
//		System.out.println("Failed");
//	}
	
	}
	
}
