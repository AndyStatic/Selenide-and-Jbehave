package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {

    private WebDriver driver;

    public SignInPage(WebDriver driver){
        this.driver = driver;
    }

    private By emailCreateInput = By.id("email_create");
    private By submitCreateButton = By.id("SubmitCreate");

    public SignInPage iEnterEmailForCreateAnAccount(String email){
        driver.findElement(emailCreateInput).sendKeys(email);
        return this;
    }

    public SignInPage iPressSubmitCreateButton(){
        driver.findElement(submitCreateButton).click();
        return this;
    }
}
