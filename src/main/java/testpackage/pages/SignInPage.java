package testpackage.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account")
public class SignInPage extends PageObject {

    private By emailCreateInput = By.id("email_create");
    private By submitCreateButton = By.id("SubmitCreate");

    public SignInPage iEnterEmailForCreateAnAccount(String email){
        find(emailCreateInput).sendKeys(email);
        return this;
    }

    public SignInPage iPressSubmitCreateButton(){
        //$(submitCreateButton).waitUntil(enabled,5000); //5 sec
        find(submitCreateButton).waitUntilEnabled();
        find(submitCreateButton).click();
        return this;
    }
}
