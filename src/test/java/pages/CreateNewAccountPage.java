package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CreateNewAccountPage {

    private WebDriver driver;

    public CreateNewAccountPage(WebDriver driver){
        this.driver = driver;
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
        driver.findElement(firstNameInput).sendKeys(firstName);
        return this;
    }

    public CreateNewAccountPage iEnterLastNameForCreateAnAccount(String lastName){
        driver.findElement(lastNameInput).sendKeys(lastName);
        return this;
    }

    public CreateNewAccountPage iEnterPasswordForCreateAnAccount(String password){
        driver.findElement(passwordInput).sendKeys(password);
        return this;
    }

    public CreateNewAccountPage iEnterAddress1ForCreateAnAccount(String address1){
        driver.findElement(addressInput).sendKeys(address1);
        return this;
    }

    public CreateNewAccountPage iEnterCityForCreateAnAccount(String city){
        driver.findElement(cityInput).sendKeys(city);
        return this;
    }

    public CreateNewAccountPage iSelectState(String state){
        driver.findElement(stateSelector).click();
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.format(stateOption,state)))).click();
        return this;
    }

    public CreateNewAccountPage iEnterPostCodeForCreateAnAccount(String postCode){
        driver.findElement(postCodeInput).sendKeys(postCode);
        return this;
    }

    public CreateNewAccountPage iEnterMobilePhoneForCreateAnAccount(String mobilePhone){
        driver.findElement(mobilePhoneInput).sendKeys(mobilePhone);
        return this;
    }

    public CreateNewAccountPage iPressSubmitAccountButton(){
        driver.findElement(submitAccountButton).click();
        return this;
    }

    public List<WebElement> getErrors(){
        return driver.findElements(errorAlertBoxErrors);
    }

    public String getErrorByNumber(int number){
        return getErrors().get(number-1).getText();
    }

    public boolean isErrorVisible(String errorTxt){
        return driver.findElements(By.xpath(String.format(errorAlertBoxErrorByTxt,errorTxt))).size() > 0 &&
                driver.findElements(By.xpath(String.format(errorAlertBoxErrorByTxt,errorTxt))).get(0).isDisplayed();
    }
}
