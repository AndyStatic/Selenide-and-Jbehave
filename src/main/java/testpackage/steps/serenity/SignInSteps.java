package testpackage.steps.serenity;

import net.thucydides.core.annotations.Step;
import testpackage.pages.SignInPage;

public class SignInSteps {

    private SignInPage signInPage;

    @Step("User opens Sing In page")
    public void openSignInPage(){
        signInPage.open();
    }

    @Step("User types email [0] for new account")
    public void iEnterEmailForCreateAnAccount(String email){
        signInPage.iEnterEmailForCreateAnAccount(email);
    }

    @Step("User press Submit button for register new account")
    public void iPressSubmitCreateButton(){
        signInPage.iPressSubmitCreateButton();
    }
}
