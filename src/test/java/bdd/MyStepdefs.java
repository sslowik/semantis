package bdd;

//import io.cucumber.java8.En;

//public class MyStepdefs implements En {
//    public MyStepdefs() {
//        Given("^User is logged in$", () -> {
//        });
//        When("^User sets the contact details$", () -> {
//        });
//        Then("^User profile is updated$", () -> {
//        });
//    }

    /** Example for CGI / Deutsche Bank
     *
     * @param expectedAmountToPay
     * @param toleranceRate

    @Then("^User receives amount to pay: (\\d+\\.?\\d*) with tolerance: (\\d+\\.?\\d*)$")
    public void userReceivesAmountToPayAmountToPay(Double expectedAmountToPay, Double toleranceRate) {
        PriceResponse response = application.getPriceResponse();

        Double actualAmountToPay = response.getAmountToPay();
        Double acceptedDifference = expectedAmountToPay * toleranceRate;

        assert Math.abs(actualAmountToPay  - expectedAmountToPay) <= acceptedDifference : "Actual amount to pay: " + actualAmountToPay + " differ from expected one: " + expectedAmountToPay + " for more then toleranceRate: " + toleranceRate;
     */
//}
