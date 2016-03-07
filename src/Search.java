import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search {

	public static void search(WebDriver driver) throws InterruptedException
	{
		WebElement search = driver.findElement(By.id("gbqfq"));
		search.sendKeys("iOS Dev Weekly - Issue 240");
		WebElement Button =driver.findElement(By.id("gbqfb"));
		Button.click();
		Thread.sleep(3000);
		List<String> x = new ArrayList<String>();
		System.out.println(x.size());
		
		for(String i:x)
		{
			System.out.println(i);
		}		
	}
}

