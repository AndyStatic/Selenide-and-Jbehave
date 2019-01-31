package steps;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.CreateNewAccountPage;
import pages.SignInPage;

import java.util.concurrent.TimeUnit;


public class tests {

    private WebDriver driver;
    private SignInPage signInPage;
    private CreateNewAccountPage createNewAccountPage;
    private String browser="chrome";

    @Before
    public void setUp() {
        switch (browser) {
            case "chrome":
                //Chrome Driver
                System.setProperty("webdriver.chrome.driver", "E:\\libs\\chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
                driver.manage().window().maximize();
                break;
        }
    }

    @Test
    public void coverageTest(){
        signInPage = new SignInPage(driver);
        signInPage.iEnterEmailForCreateAnAccount("hmrc43@test.com")
            .iPressSubmitCreateButton();

        createNewAccountPage = new CreateNewAccountPage(driver);
        createNewAccountPage.iEnterFirstNameForCreateAnAccount("Hello")
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

    @After
    public void tearDown() {
        driver.quit();
    }
}
