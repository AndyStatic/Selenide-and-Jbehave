package testpackage.steps.serenity;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import testpackage.pages.CreateNewAccountPage;

import java.util.List;

public class CreateNewAccountSteps {

    private CreateNewAccountPage createNewAccountPage;

    @Step("User opens Create New Account page")
    public void openCreateNewAccountPage(){
        createNewAccountPage.open();
    }

    @Step("User types first name [0] for new account")
    public void iEnterFirstNameForCreateAnAccount(String firstName){
        createNewAccountPage.iEnterFirstNameForCreateAnAccount(firstName);
    }

    @Step("User types last name [0] for new account")
    public void iEnterLastNameForCreateAnAccount(String lastName){
        createNewAccountPage.iEnterLastNameForCreateAnAccount(lastName);
    }

    @Step("User types password [0] for new account")
    public void iEnterPasswordForCreateAnAccount(String password){
        createNewAccountPage.iEnterPasswordForCreateAnAccount(password);
    }

    @Step("User types address [0] for new account")
    public void iEnterAddress1ForCreateAnAccount(String address1){
        createNewAccountPage.iEnterAddress1ForCreateAnAccount(address1);
    }

    @Step("User types first name [0] for new account")
    public void iEnterCityForCreateAnAccount(String city){
        createNewAccountPage.iEnterCityForCreateAnAccount(city);
    }

    @Step("User selects state [0] for new account")
    public void iSelectState(String state){
        createNewAccountPage.iSelectState(state);
    }

    @Step("User types postcode [0] for new account")
    public void iEnterPostCodeForCreateAnAccount(String postCode){
        createNewAccountPage.iEnterPostCodeForCreateAnAccount(postCode);
    }

    @Step("User types phone number [0] for new account")
    public void iEnterMobilePhoneForCreateAnAccount(String mobilePhone){
        createNewAccountPage.iEnterMobilePhoneForCreateAnAccount(mobilePhone);
    }

    @Step("User press Submit button for create new account")
    public void iPressSubmitAccountButton(){
        createNewAccountPage.iPressSubmitAccountButton();
    }

    @Step("User not see error [0] displayed")
    public void getErrorByTextIsNotVisible(String errorTxt){
        createNewAccountPage.getErrorByTextIsNotVisible(errorTxt);
    }

    @Step("Amount of errors returned")
    public List<WebElementFacade> getErrors(){
        return createNewAccountPage.getErrors();
    }


}
