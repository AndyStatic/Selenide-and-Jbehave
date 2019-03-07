package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import java.util.List;

import static java.lang.String.format;
import static org.openqa.selenium.By.xpath;

@DefaultUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation")
public class CreateNewAccountPage extends PageObject {

    private By firstNameInput = By.id("customer_firstname");
    private By lastNameInput = By.id("customer_lastname");
    private By passwordInput = By.id("passwd");
    private By addressInput = By.id("address1");
    private By cityInput = By.id("city");
    private By stateSelector = By.id("id_state");
    private String stateOption = "//select[@id='id_state']/option[text()='%s']";
    private By postCodeInput = By.id("postcode");
    private By mobilePhoneInput = By.id("phone_mobile");
    private By submitAccountButton = By.id("submitAccount");
    private By errorAlertBoxErrors = xpath("//*[@id='center_column']/div/ol/li");
    private String errorAlertBoxErrorByTxt = "//*[@id='center_column']/div/ol/li[text()='%s']";

    public CreateNewAccountPage iEnterFirstNameForCreateAnAccount(String firstName){
        find(firstNameInput).sendKeys(firstName);
        return this;
    }

    public CreateNewAccountPage iEnterLastNameForCreateAnAccount(String lastName){
        find(lastNameInput).sendKeys(lastName);
        return this;
    }

    public CreateNewAccountPage iEnterPasswordForCreateAnAccount(String password){
        find(passwordInput).sendKeys(password);
        return this;
    }

    public CreateNewAccountPage iEnterAddress1ForCreateAnAccount(String address1){
        find(addressInput).sendKeys(address1);
        return this;
    }

    public CreateNewAccountPage iEnterCityForCreateAnAccount(String city){
        find(cityInput).sendKeys(city);
        return this;
    }

    public CreateNewAccountPage iSelectState(String state){
        find(stateSelector).click();
        find(xpath(format(stateOption,state))).waitUntilVisible().click();
        return this;
    }

    public CreateNewAccountPage iEnterPostCodeForCreateAnAccount(String postCode){
        find(postCodeInput).sendKeys(postCode);
        return this;
    }

    public CreateNewAccountPage iEnterMobilePhoneForCreateAnAccount(String mobilePhone){
        find(mobilePhoneInput).sendKeys(mobilePhone);
        return this;
    }

    public CreateNewAccountPage iPressSubmitAccountButton(){
        find(submitAccountButton).click();
        return this;
    }

    public List<WebElementFacade> getErrors(){
        return findAll(errorAlertBoxErrors);
    }

    public String getErrorByNumber(int number){
        return getErrors().get(number-1).getText();
    }

    public boolean isErrorVisible(String errorTxt){
        return findAll(xpath(format(errorAlertBoxErrorByTxt,errorTxt))).size() > 0 &&
                findAll(xpath(format(errorAlertBoxErrorByTxt,errorTxt))).get(0).isDisplayed();
    }

    public CreateNewAccountPage getErrorByTextIsNotVisible(String errorTxt){
        //$(By.xpath(String.format(errorAlertBoxErrorByTxt,errorTxt))).shouldNotBe(visible);
        find(xpath(format(errorAlertBoxErrorByTxt,errorTxt))).shouldNotBeVisible();
        return this;
    }
}
