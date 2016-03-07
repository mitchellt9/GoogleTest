
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Compose {

	public static void compose(WebDriver driver) throws InterruptedException {
	
		//driver.switchTo().frame("canvas_frame");
		Thread.sleep(3000);
		//Now , click on compose mail
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		Thread.sleep(3000);
		
		//Click on Maximize Button
		driver.findElement(By.xpath(".//*[@id=':la']")).click();
		
		//Click on "To" field
		driver.findElement(By.className("vO")).sendKeys("sarantest.v10@gmail.com");
		Thread.sleep(3000);
		
		//Click on "Subject" field
		driver.findElement(By.className("aoT")).sendKeys("MailSubject");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@id=':ns']")).sendKeys("aaaa");;
	}

}

