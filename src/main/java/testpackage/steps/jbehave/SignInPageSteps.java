package testpackage.steps.jbehave;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;
import testpackage.pages.SignInPage;


public class SignInPageSteps {

    private SignInPage signInPage;

    @Given("I open Sign In page")
    public void openSignInPage(){
        signInPage.open();
    }

    @When("I enter email for create an account \"$email\"")
    public void iEnterEmailForCreateAnAccount(String email){
        signInPage.iEnterEmailForCreateAnAccount(email);
    }

    @When("I press Submit Create button")
    public void iPressSubmitCreateButton(){
        signInPage.iPressSubmitCreateButton();
    }

}
