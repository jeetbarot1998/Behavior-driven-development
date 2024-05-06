package api.cucumber.features.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
    @Given("The User should be logged in")
    public void the_User_should_be_logged_in() {
        System.out.println("Executing the_User_should_be_logged_in method");
    }

    @Given("I type the message as {string} in the text box")
    public void i_type_the_message_as_in_the_text_box(String string) {
        System.out.println("Executing i_type_the_message_as_in_the_text_box method with input: " + string);
    }

    @When("I type the message in the box")
    public void i_type_the_message_in_the_box() {
        System.out.println("Executing i_type_the_message_in_the_box method");
    }

    @When("Clicks on Post button")
    public void clicks_on_Post_button() {
        System.out.println("Executing clicks_on_Post_button method");
    }

    @Then("the message should be posted")
    public void the_message_should_be_posted() {
        System.out.println("Executing the_message_should_be_posted method");
    }

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        System.out.println("Executing i_am_on_the_login_page method");
    }

    @When("I enter {string} and {string}")
    public void i_enter_and(String string, String string2) {
        System.out.println("Executing i_enter_and method with inputs: " + string + " and " + string2);
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        System.out.println("Executing i_should_be_logged_in_successfully method");
    }

    @Given("User is at login page of the app")
    public void user_is_at_login_page_of_the_app() {
        System.out.println("Executing user_is_at_login_page_of_the_app method");
    }

    @When("When the user is giving the following credentials")
    public void when_the_user_is_giving_the_following_credentials(DataTable dataTable) {
        dataTable.asList().forEach(System.out::println);
        System.out.println("Executing when_the_user_is_giving_the_following_credentials method with data: " + dataTable.toString());
    }

    @Then("user should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        System.out.println("Executing user_should_be_logged_in_successfully method");
    }

}
