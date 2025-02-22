package stepDefinition;

//import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driver.DriverFactory;
import io.cucumber.java.en.Then;
import pageFactory.HomePageFactory;
import pageFactory.Login;
import utilities.ConfigReader;



public class Home_Steps {
	
	Login login = new Login();
//	ConfigReader reader = new ConfigReader();
	DriverFactory driver = new DriverFactory();	
	HomePageFactory Home = new HomePageFactory();
	

	public void stepsToLogin() {
		login.enterUsername(ConfigReader.getProperty("username"));
		login.enterPassword(ConfigReader.getProperty("password"));
		Home.selectrole();
		Home.clicklogin();
	}

	@Then("Admin should see LMS -Learning management system as title")
	public void admin_should_see_lms_learning_management_system_as_title() {
		stepsToLogin();
	    Assert.assertEquals(Home.pagetitle(),"LMS");
	}

	@Then("Admin should NOT see LMS_Test as title")
	public void admin_should_not_see_lms_test_as_title() {
		stepsToLogin();
	    Assert.assertNotEquals(Home.pagetitle(),"LMS_Test");
	}
	
	@Then("Admin should see LMS title on the top left corner of page")
	public void admin_should_see_lms_title_on_the_top_left_corner_of_page() {
		stepsToLogin();
	    Assert.assertEquals(Home.get_lms_location(),true);
	}

	@Then("Admin should see correct spelling in navigation bar text")
	public void admin_should_see_correct_spelling_in_navigation_bar_text() {
		stepsToLogin();
	    Assert.assertEquals(Home.get_toolbar_elements_text(),"Home"+"Program"+"Batch"+"Class"+"Logout");
	}
	
	
	@Then("Admin should see correct spelling and space in LMS title")
	public void admin_should_see_correct_spelling_and_space_in_lms_title() {
	  stepsToLogin();
	  Assert.assertEquals(Home.getLMSTitleText(),"LMS - Learning Management System");
	}

	@Then("Admin should see the navigation bar text on the top right side")
	public void admin_should_see_the_navigation_bar_text_on_the_top_right_side() {
	    stepsToLogin();
	    Assert.assertEquals(Home.getnavBarText(),"Home\r\n"
	    		+ "Program\r\n"
	    		+ "Batch\r\n"
	    		+ "Class\r\n"
	    		+ "Logout ");
	}

	@Then("Admin should see home in the first place")
	public void admin_should_see_home_in_the_first_place() {
//		Assert.assertEquals(Home.home_first_place(),true);
//		Assert.assertEquals(Home.sort_elements(),Home.get_home_xPos());
	}
	
	@Then("Admin should see welcome message with user name and role")
    public void admin_should_see_welcome_message_with_user_name_and_role() {
        String expectedWelcomeMessage = "Welcome sdetnumpyninja@gmail.com (Role: Admin)";
        Assert.assertEquals(Home.getWelcomeMessage().contains(expectedWelcomeMessage), true);
    }
	
	
}



