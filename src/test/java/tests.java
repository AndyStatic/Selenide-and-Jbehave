import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import pages.CreateNewAccountPage;
import pages.SignInPage;
import steps.CreateNewAccountSteps;
import steps.SignInSteps;

@RunWith(SerenityRunner.class)
public class tests {

    @Steps
    SignInSteps signInSteps;
    @Steps
    CreateNewAccountSteps createNewAccountSteps;

    @Managed
    WebDriver driver;

    @Test
    public void coverageTest() {
        signInSteps.openSignInPage();
        signInSteps.iEnterEmailForCreateAnAccount("hmrc51@test.com");
        signInSteps.iPressSubmitCreateButton();

        createNewAccountSteps.openCreateNewAccountPage();
        createNewAccountSteps.iEnterFirstNameForCreateAnAccount("Hello");
        createNewAccountSteps.iEnterLastNameForCreateAnAccount("World");
        createNewAccountSteps.iEnterPasswordForCreateAnAccount("Qwerty");
        createNewAccountSteps.iEnterAddress1ForCreateAnAccount("Test Str 123");
        createNewAccountSteps.iEnterCityForCreateAnAccount("London");
        createNewAccountSteps.iSelectState("Alaska");
        createNewAccountSteps.iEnterPostCodeForCreateAnAccount("00000");
        createNewAccountSteps.iEnterMobilePhoneForCreateAnAccount("123456789");
        createNewAccountSteps.iPressSubmitAccountButton();
        Assert.assertEquals(0, createNewAccountSteps.getErrors().size());
    }

}
