package com.guru99.gurubank.pruebas.stepdefinitions;


import com.guru99.gurubank.pruebas.steps.Guru99BankSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Guru99BankStepDefinitions {

    @Steps
    Guru99BankSteps guru99BankSteps;

    @Given("^A user is in the gurubank page$")
    public void aUserIsInTheGurubankPage() throws InterruptedException {

        guru99BankSteps.openBrowser();


    }


    @And("^Login in  gurubank$")
    public void loginInGurubank() {
        guru99BankSteps.loginUser();

    }


    @And("^Select new user$")
    public void selectNewUser() {
        guru99BankSteps.newCustomer();
    }

    @When("^Fill all requested fields$")
    public void fillAllRequestedFields() {
        guru99BankSteps.createNewCustomer();
    }

    @Then("^the user should see the text \"([^\"]*)\"$")
    public void theUserShouldSeeTheText(String arg1)  {
        guru99BankSteps.successfullyCreation();

    }
    @And("^Create a new account$")
    public void create_a_new_account()  {
        guru99BankSteps.createNewAccount();
    }

    @Then("^The user should see the text$")
    public void the_user_should_see_the_text() {
        guru99BankSteps.validateNewAccount();

    }
}
