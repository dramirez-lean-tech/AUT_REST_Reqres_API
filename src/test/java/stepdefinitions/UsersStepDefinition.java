package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static stepdefinitions.SetupConfiguration.AdminApi;
import static task.DeleteUser.userDeleted;
import static task.EditUser.userEdited;
import static task.GenerateToken.createToken;
import static task.NewUser.newUser;
import static task.RegisterUnsuccessful.unsuccessful;
import static task.SummaryUser.summaryUser;

public class UsersStepDefinition {


    @Given("^the user generate token$")
    public void the_user_generate_token() {
        AdminApi.attemptsTo(createToken());
    }

    @When("^the user create a new user$")
    public void the_user_create_a_new_user() {
         AdminApi.attemptsTo(newUser());
    }

    @When("^the user update a user$")
    public void the_user_update_a_user() {
        AdminApi.attemptsTo(userEdited());
    }

    @When("^the user delete a user$")
    public void the_user_delete_a_user() {
        AdminApi.attemptsTo(userDeleted());
    }

    @When("^the user adds a wrong email address$")
    public void the_user_adds_a_wrong_email_address() {
        AdminApi.attemptsTo(unsuccessful());
    }

    @When("^the user consults a user$")
    public void the_user_consults_a_user() {
        AdminApi.attemptsTo(summaryUser());
    }

    @Then("^the user will see the next code (.*)$")
    public void the_user_will_see_the_next_code(int code) {
        AdminApi.should(seeThatResponse(lastResponse -> lastResponse.statusCode(code)));
    }
}
