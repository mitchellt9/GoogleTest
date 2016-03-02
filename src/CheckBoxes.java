import org.openqa.selenium.WebElement;


public class CheckBoxes {
	
	//Checking
	public void CheckingChkbox(WebElement chkbx1){
	boolean checkstatus;
	checkstatus=chkbx1.isSelected();
	if (checkstatus==true){
	System.out.println("Checkbox is already checked");  
	}
	else
	{
	chkbx1.click();
	System.out.println("Checked the checkbox");
	}
	}
	 
	//Unchecking 
	public void UnCheckingChkbox(WebElement chkbx1){
	boolean checkstatus;
	checkstatus=chkbx1.isSelected();
	if (checkstatus==true) {
	chkbx1.click();
	System.out.println("Checkbox is unchecked");
	}
	else
	{
	System.out.println("Checkbox is already unchecked"); 
	}
	}

}
