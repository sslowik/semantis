package bdd;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CgiStepDef {
    @Given("Exchange rates are:")
    public void exchangeRatesAre(DataTable exchangeRates) {
    }

    @Given("User logs into application")
    public void userLogsIntoApplication() {
    }

    @When("User sends request for price:")
    public void userSendsRequestForPrice() {
    }

    @Then("User receives amount to pay: <amountToPay> with tolerance: <toleranceRate>")
    public void userReceivesAmountToPayAmountToPayWithToleranceToleranceRate() {
    }
}
