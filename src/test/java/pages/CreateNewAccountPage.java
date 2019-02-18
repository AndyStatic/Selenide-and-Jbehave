package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CreateNewAccountPage {

    public CreateNewAccountPage openCreateNewAccountPage(){
        Selenide.open("/index.php?controller=authentication&back=my-account#account-creation");
        return this;
    }

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
    private By errorAlertBoxErrors = By.xpath("//*[@id='center_column']/div/ol/li");
    private String errorAlertBoxErrorByTxt = "//*[@id='center_column']/div/ol/li[text()='%s']";

    public CreateNewAccountPage iEnterFirstNameForCreateAnAccount(String firstName){
        $(firstNameInput).sendKeys(firstName);
        return this;
    }

    public CreateNewAccountPage iEnterLastNameForCreateAnAccount(String lastName){
        $(lastNameInput).sendKeys(lastName);
        return this;
    }

    public CreateNewAccountPage iEnterPasswordForCreateAnAccount(String password){
        $(passwordInput).sendKeys(password);
        return this;
    }

    public CreateNewAccountPage iEnterAddress1ForCreateAnAccount(String address1){
        $(addressInput).sendKeys(address1);
        return this;
    }

    public CreateNewAccountPage iEnterCityForCreateAnAccount(String city){
        $(cityInput).sendKeys(city);
        return this;
    }

    public CreateNewAccountPage iSelectState(String state){
        $(stateSelector).selectOption(state);
        return this;
    }

    public CreateNewAccountPage iEnterPostCodeForCreateAnAccount(String postCode){
        $(postCodeInput).sendKeys(postCode);
        return this;
    }

    public CreateNewAccountPage iEnterMobilePhoneForCreateAnAccount(String mobilePhone){
        $(mobilePhoneInput).sendKeys(mobilePhone);
        return this;
    }

    public CreateNewAccountPage iPressSubmitAccountButton(){
        $(submitAccountButton).click();
        return this;
    }

    public ElementsCollection getErrors(){
        return $$(errorAlertBoxErrors);
    }

    public String getErrorByNumber(int number){
        return getErrors().get(number-1).getText();
    }

    public boolean isErrorVisible(String errorTxt){
        return $$(By.xpath(String.format(errorAlertBoxErrorByTxt,errorTxt))).size() > 0 &&
                $$(By.xpath(String.format(errorAlertBoxErrorByTxt,errorTxt))).get(0).isDisplayed();
    }
}
