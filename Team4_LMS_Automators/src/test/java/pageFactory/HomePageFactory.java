package pageFactory;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.DriverFactory;

public class HomePageFactory {
	
	WebDriver driver = DriverFactory.getDriver();
	@FindBy (id="mat-select-value-1")	WebElement SelectRole;
	@FindBy(id="mat-option-0")	WebElement AdminRole;
	@FindBy(id="login")WebElement Login;
	@FindBy(xpath="/html/body/app-root/app-header/mat-toolbar/span[1]") WebElement LMS;
	@FindBy(id="dashboard")	WebElement we_home;
	@FindBy(id="program") WebElement we_program;
	@FindBy(xpath = "/html/body/app-root/app-header/mat-toolbar/div/button[3]") WebElement we_batch;
	@FindBy(xpath = "/html/body/app-root/app-header/mat-toolbar/div/button[4]") WebElement we_class;
	@FindBy(id="logout") WebElement we_logout;
	@FindBy(xpath= "/html/body/app-root/app-header/mat-toolbar/span[1]") WebElement LMStitle;
	@FindBy(xpath = "/html/body/app-root/app-header/mat-toolbar/div") WebElement navBarText;
	@FindBy(xpath="/html/body/app-root/app-header/mat-toolbar/div")	private WebElement toolbar;
	@FindBy(xpath="/html/body/app-root/app-dashboard/div/div[1]/mat-card/mat-card-content/mat-grid-list/div/mat-grid-tile[1]/figure/div/app-admindata/div/div[2]/strong") WebElement welcomeMessage;

//	WebElement LMS_new = LMS;
	
// constructor
    public HomePageFactory() {
    	//this.driver = driver;
    	PageFactory.initElements(driver, this);
    }

    public String getHomePageTitle() {
        return driver.getTitle();
    }
    
	public String pagetitle() {
		return driver.getTitle();
	}

	public void selectrole() {
		SelectRole.click();
		AdminRole.click();
	}
	
	public void clicklogin() {
		Login.click ();
	}
	
	public boolean get_lms_location() {
		if (LMS.getLocation().getX() < 50) {
			return true;
		}else {
			return false;
		}
	}
	
	public String get_toolbar_elements_text() {
		return we_home.getText() + we_program.getText() + we_batch.getText() + we_class.getText() + we_logout.getText();
	}
	
	public String getLMSTitleText() {
		return LMStitle.getText();
	}
	
	public String getnavBarText() {
		 return navBarText.getText();
	}
	
//    public boolean home_first_place() {
//    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
//    	WebElement we_home1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dashboard")));
//    	
//    	int[] xPos = {	we_home1.getLocation().getX(),
////						we_program.getLocation().getX(),
////						we_batch.getLocation().getX(),
////						we_class.getLocation().getX(),
////						we_logout.getLocation().getX()
//	 		 };
//    	Arrays.sort(xPos);
//    	
//    	if ( xPos[0] == we_home.getLocation().getX()) {
//    		return true;
//    	}else {
//    		return false;
//    	}
//    }

	public String getWelcomeMessage() {
		return welcomeMessage.getText();
	}	
	
}








	






  
//  public boolean HomePageTextValidation()
//	{
//		util.waitForElement(programBtn);
//		String HomePageText=HomePageTitle.getText();
//		if(HomePageText.equals(" LMS - Learning Management System "))
//		return true;
//		else 
//			return false;
//	}  
//  
//  
//  public boolean LMStextValidation()
//	{
//		util.waitForElement(programBtn);
//		String LMStext=dashboardTitle.getText();
//		if(LMStext.equals(" LMS - Learning Management System "))
//		return true;
//		else 
//			return false;
//	}
//  
//  
//  

