package pageFactory;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.DriverFactory;

public class HomePageFactory {
	
	WebDriver driver = DriverFactory.getDriver();
	//WebDriverWait wait;
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
//	@FindBy(xpath="/html/body/app-root/app-header/mat-toolbar/div")	private WebElement toolbar;
//	@FindBy(xpath="/html/body/app-root/app-dashboard/div/div[1]/mat-card/mat-card-content/mat-grid-list/div/mat-grid-tile[1]/figure/div/app-admindata/div/div[2]/strong")
	@FindBy(xpath="//strong[normalize-space()='Welcome sdetnumpyninja@gmail.com']")
	WebElement welcomeMessage;
	@FindBy(xpath="//div[@class='widget blue']/div[@class='value']") WebElement UserCountNote;
	
	
////	xpath /html/body/app-root/app-dashboard/div/div[3]/mat-grid-list/div/mat-grid-tile[1]/figure/div/app-staffdata/mat-table
////	classname mat-table cdk-table table-container mat-elevation-z8
//	@FindBy(xpath = "//div[@class='pagination-icons']") WebElement paginationIcons;
//
//    @FindBy(xpath = "//table[@id='staffTable']/tbody/tr") List<WebElement> staffRows;
//
//    @FindBy(xpath = "//button[@aria-label='Previous page']") WebElement previousPageIcon;
//
//    @FindBy(className="mat-focus-indicator mat-tooltip-trigger mat-paginator-navigation-first mat-icon-button mat-button-base mat-button-disabled ng-star-inserted")
//    WebElement firstPageIcon;

//BarGraph:
//relative xpath: //mat-card-content[@class='mat-card-content']//canvas[@class='chartjs-render-monitor']
//relative css: .chartjs-render-monitor[width='640']
//jspath: document.querySelector(".chartjs-render-monitor[width='640']")
//abs xpath: /html[1]/body[1]/app-root[1]/app-home[1]/div[1]/app-dashboard[1]/div[1]/div[1]/mat-card[1]/mat-card-content[1]/mat-grid-list[1]/div[1]/mat-grid-tile[2]/figure[1]/div[1]/div[1]/canvas[1]
	@FindBy(xpath="//mat-card-content[@class='mat-card-content']//canvas[@class='chartjs-render-monitor']")
	WebElement BarGraph;
	
//PieChart:
//relative xpath: //app-doughnutchart
//relative css: .chartjs-render-monitor[width='1400']
//abs xpath: /html[1]/body[1]/app-root[1]/app-home[1]/div[1]/app-dashboard[1]/div[1]/div[3]/mat-grid-list[1]/div[1]/mat-grid-tile[2]/figure[1]/div[1]/app-doughnutchart[1]/div[1]/canvas[1]
	@FindBy(xpath="//app-doughnutchart")
	WebElement PieChart;
	
//	@FindBy(xpath="//div[normalize-space()='49']")
	
	// constructor
    public HomePageFactory() {
//    	this.driver = driver;
    	PageFactory.initElements(driver, this);
    }
    
//    public HomePageFactory(WebDriver driver) {
//        this.driver = driver;
//    //    this.wait = new WebDriverWait(driver, 10); // 10 seconds wait time
//        PageFactory.initElements(driver, this);
//    }

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
	
	public boolean getnavBarLoc() {
// check the location of the Text on Top Right
		 if ( navBarText.getLocation().getX() > 50 && navBarText.getLocation().getY() < 50 ) {
			 return true;
		 }else {
			 return false;
		 }
	}
	
	public WebElement get_webelement(String element) {
		WebElement we = null;
		switch (element) {
			case "home": we = we_home; break;
			case "program": we = we_program; break;
			case "batch": we = we_batch; break;
			case "class": we = we_class; break;
			case "logout": we = we_logout; break;
			case "bargraph": we = BarGraph; break;
			case "doughnut": we = PieChart; break;
		}
		return we;
	}
	
    public boolean toolBarElement_place(WebElement webElement, int i) {
// get the positions into an array and sort the positions	
    	int[] xPos = {	we_home.getLocation().getX(),
						we_program.getLocation().getX(),
						we_batch.getLocation().getX(),
						we_class.getLocation().getX(),
						we_logout.getLocation().getX()
	 		 		};
    	Arrays.sort(xPos);
// Verify the location of the WebElement
    	if ( xPos[i] == webElement.getLocation().getX()) {
    		return true;
    	}else {
    		return false;
    	}
    }

	public String getWelcomeMessage() {
		return welcomeMessage.getText();
	}	
	
//	public boolean getPieChart() {
//        if (PieChart.isDisplayed()) {
//            System.out.println("Doughnut is displayed");
//            return true;
//        } else {
//            System.out.println("Doughnut is NOT displayed");
//            return false;
//        }
//	}
//	
//	 public boolean verifyBarGraph() {
//	        if (BarGraph.isDisplayed()) {
//	            System.out.println("Bar graph is visible.");
//	            return true;
//	        } else {
//	            System.out.println("Bar graph is not visible.");
//	            return false;
//	        }
//	    }

	public Boolean isDisplayed(WebElement webElement) {
        if (webElement.isDisplayed()) {
            return true;
        } else {
            return false;
        }
	}


					//	public String getBarGraph() {
//		System.out.println(BarGraph.getText());
//		return BarGraph.getText();
//	}
//	
//	 public void getElementText() {
//		 firstPageIcon.getText();
//		 firstPageIcon.getAccessibleName();
//	 }
	
	
	
}








	






  

  

