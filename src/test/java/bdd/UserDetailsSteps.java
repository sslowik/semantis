package bdd;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

import java.util.List;

@RunWith(Cucumber.class)
public class UserDetailsSteps {

    @Given("^User is logged in$")
    public void user_is_logged_in() throws Throwable {
        throw new PendingException();
    }

    @When("^User sets the contact details$")
    public void user_sets_the_contact_details(List<User> userList) throws Throwable {
    }

    @Then("^User profile is updated$")
    public void user_profile_is_updated() throws Throwable {
        throw new PendingException();
    }
}

class User {
    public String user_id;
    public String user_email;
    public String user_phone;
}
