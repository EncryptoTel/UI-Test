package encry.pages;

import encry.Expectations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPage extends Page {

    @FindBy(css = "#logo_EncryptoTel")
    public WebElement logo;

    @FindBy(css = "#confirmation_email")
    public WebElement inputEmailRecovery;

    @FindBy(css = "button.button.accent")
    public WebElement btnSubmit;

    @FindBy(css = "#a.auth_form_link[routerlink='../sign-in']")
    public WebElement linkBackToLoginPage;

    @FindBy(css = "a.auth_form_link[routerlink='../sign-up']")
    public WebElement linkRegisterAccount;

    public boolean isElementVisibleBtnSubmit() {
        if(isElementVisible(btnSubmit, 3)){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isElementVisibleInputEmailRecovery() {
        if(isElementVisible(inputEmailRecovery, 3)){
            return true;
        }
        else {
            return false;
        }
    }

    public ForgotPasswordPage(WebDriver webDriver) {
        super(webDriver);
    }
}
