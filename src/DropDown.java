import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class DropDown {

	public static void Drop_down(WebDriver driver) {
		
		driver.findElement(By.xpath(".//*[@id=':j']/div")).click();
		driver.findElement(By.xpath(".//*[@id=':1h']/div")).click();
		
		String Expected_pagetitle = "Google Contacts Preview";
		String Actual_pagetitle=driver.getTitle();
		
		if(Expected_pagetitle.equals(Actual_pagetitle))
		{
			System.out.println("Redirected to contacts section");
		}
		else
		{
			System.out.println("Redirected to Wrong window");
		}	

	}

}

