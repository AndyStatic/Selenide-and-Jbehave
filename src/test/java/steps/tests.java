package steps;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.CreateNewAccountPage;
import pages.SignInPage;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.browser;


public class tests {

    private SignInPage signInPage;
    private CreateNewAccountPage createNewAccountPage;
    private String browserString="chrome";

    @Before
    public void setUp() {
        switch (browserString) {
            case "chrome":
                //Chrome Driver
                System.setProperty("webdriver.chrome.driver", "E:\\libs\\chromedriver.exe");
                baseUrl = "http://automationpractice.com";
                browser = "chrome";
                break;
        }
    }

    @Test
    public void coverageTest(){
        signInPage = new SignInPage();
        signInPage.openSignInPage()
            .iEnterEmailForCreateAnAccount("hmrc44@test.com")
            .iPressSubmitCreateButton();

        createNewAccountPage = new CreateNewAccountPage();
        createNewAccountPage.openCreateNewAccountPage()
            .iEnterFirstNameForCreateAnAccount("Hello")
            .iEnterLastNameForCreateAnAccount("World")
            .iEnterPasswordForCreateAnAccount("Qwerty")
            .iEnterAddress1ForCreateAnAccount("Test Str 123")
            .iEnterCityForCreateAnAccount("London")
            .iSelectState("Alaska")
            .iEnterPostCodeForCreateAnAccount("00000")
            .iEnterMobilePhoneForCreateAnAccount("123456789")
            .iPressSubmitAccountButton();
        Assert.assertEquals(0, createNewAccountPage.getErrors().size());
    }

}
