package testpackage.steps.jbehave;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.junit.Assert;
import testpackage.pages.CreateNewAccountPage;

import java.util.Map;

public class CreateNewAccountPageSteps {

    private CreateNewAccountPage createNewAccountPage;

    @Given("Create New Account page is opened")
    @When("Create New Account page is opened")
    public void openCreateNewAccountPage(){
        createNewAccountPage.open();
    }

    @When("I enter fullname $table")
    public void iEnterFullNameForCreateAnAccount(ExamplesTable fullName){
        Map<String, String> fullNameMap = fullName.getRow(0);
        createNewAccountPage.iEnterFirstNameForCreateAnAccount(fullNameMap.get("firstname"));
        createNewAccountPage.iEnterLastNameForCreateAnAccount(fullNameMap.get("lastname"));
    }

    @When("I enter firstname for create an account \"$firstName\"")
    public void iEnterFirstNameForCreateAnAccount(String firstName){
        createNewAccountPage.iEnterFirstNameForCreateAnAccount(firstName);
    }

    @When("I enter lastname for create an account \"$lastName\"")
    public void iEnterLastNameForCreateAnAccount(String lastName){
        createNewAccountPage.iEnterLastNameForCreateAnAccount(lastName);
    }

    @When("I enter password for create an account \"$password\"")
    public void iEnterPasswordForCreateAnAccount(String password){
        createNewAccountPage.iEnterPasswordForCreateAnAccount(password);
    }

    @When("I enter address1 for create an account \"$address1\"")
    public void iEnterAddress1ForCreateAnAccount(String address1){
        createNewAccountPage.iEnterAddress1ForCreateAnAccount(address1);
    }

    @When("I enter city for create an account \"$city\"")
    public void iEnterCityForCreateAnAccount(String city){
        createNewAccountPage.iEnterCityForCreateAnAccount(city);
    }

    @When("I select state for create an account \"$state\"")
    public void iSelectState(String state){
        createNewAccountPage.iSelectState(state);
    }

    @When("I enter postcode for create an account \"$postCode\"")
    public void iEnterPostCodeForCreateAnAccount(String postCode){
        createNewAccountPage.iEnterPostCodeForCreateAnAccount(postCode);
    }

    @When("I enter mobile phone for create an account \"$mobilePhone\"")
    public void iEnterMobilePhoneForCreateAnAccount(String mobilePhone){
        createNewAccountPage.iEnterMobilePhoneForCreateAnAccount(mobilePhone);
    }

    @When("I press Submit Account button")
    public void iPressSubmitAccountButton(){
        createNewAccountPage.iPressSubmitAccountButton();
    }

    @Then("there is no error message displayed")
    public void getErrorsAmount(){
        Assert.assertEquals(0, createNewAccountPage.getErrors().size());
    }

}
