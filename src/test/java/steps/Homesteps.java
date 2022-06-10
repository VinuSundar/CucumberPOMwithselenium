package steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Dimension;

import com.factory.DriverFactory;
import com.pages.HomePage;
import com.pages.Loginpage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Homesteps {
	private Loginpage lp=new Loginpage(DriverFactory.getDriver());
	private HomePage hp;
	

@Given("user is already on login page")
public void user_is_already_on_login_page() {
	System.out.println("user is on login page");

}

@Given("user logins to application")
public void user_logins_to_application(DataTable dataTable) {
List<Map<String,String>> credlist = dataTable.asMaps();
String un=credlist.get(0).get("username");
String pwd=credlist.get(0).get("password");
hp=lp.dologin(un, pwd);
System.out.println("user is on home page");
}

@Given("user is in Home Page")
public void user_is_in_home_page() {
    String title=hp.gettitle();
}

@Then("user gets inventory names")
public void user_gets_inventory_names(DataTable homeTable) {
   List<List<String>> explist= homeTable.asLists();
   System.out.println("expected account list " +explist);
   List<String> actuallist=hp.getitems();
   System.out.println("actual account list " +actuallist);
   //Assert.assertEquals(explist, actuallist);
}

@Then("section should be {int}")
public void section_should_be(Integer int1) {
	int int2=hp.getsize();
	Assert.assertTrue(int1.equals(int2));
	 System.out.printf("list is ",int2);
}

}
