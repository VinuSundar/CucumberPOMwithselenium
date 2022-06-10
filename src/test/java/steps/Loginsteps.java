package steps;

import com.factory.DriverFactory;
import com.pages.HomePage;
import com.pages.Loginpage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Loginsteps {
	
	private Loginpage lp=new Loginpage(DriverFactory.getDriver());

@Given("user is on login page")
public void user_is_on_login_page() {
	
System.out.println("user is on login page");
}

@When("user gets title of the page")
public void user_gets_title_of_the_page() {
  String logintitle = lp.gettitle();
 
  
}

@Then("page title should be {string}")
public void page_title_should_be(String string) {
	String logintitle = lp.gettitle();
	Assert.assertEquals(logintitle,string);System.out.println(string);
}



@When("user enters username {string}")
public void user_enters_username(String string) {
	lp.enterusername(string);
   
}

@When("user enters password {string}")
public void user_enters_password(String string) {
 lp.enterpassword(string);
 System.out.println("from user input" +string);//added before uploading in GIT
}

@When("user clicks login button")
public void user_clicks_login_button() {
 lp.login();
 System.out.println("user is succeffuly in homepage");
}




}
