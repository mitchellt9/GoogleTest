import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Compose 
{
public static void compose(WebDriver driver)
{
	driver.findElement(By.xpath(".//*[@id=':hw']/div/div")).click();
	
	String compose_window = driver.getWindowHandle();
	System.out.println(compose_window);
	driver.switchTo().window(compose_window);
	
	
	//ENTER DETAILS IN COMPOSE
	driver.findElement(By.xpath(".//*[@id=':lt']")).sendKeys("mitchell.thomas@webyog.com");
	
	
	//HIT SEND
	driver.findElement(By.id("Send")).click();
	
	//HANDLE ALERTS
	Alert a = driver.switchTo().alert();
	a.accept();
	
	
}
	
	
}
