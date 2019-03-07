package pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.disabled;
import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.$;

public class SignInPage {

    public SignInPage openSignInPage(){
        Selenide.open("/index.php?controller=authentication&back=my-account");
        return this;
    }

    private By emailCreateInput = By.id("email_create");
    private By submitCreateButton = By.id("SubmitCreate");

    public SignInPage iEnterEmailForCreateAnAccount(String email){
        $(emailCreateInput).sendKeys(email);
        return this;
    }

    public SignInPage iPressSubmitCreateButton(){
        $(submitCreateButton).waitUntil(enabled,5000); //5 sec
        $(submitCreateButton).click();
        return this;
    }
}
