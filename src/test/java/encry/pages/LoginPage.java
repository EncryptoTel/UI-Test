package encry.pages;

import encry.Expectations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Page {

    @FindBy(css = "#logo_EncryptoTel")
    private WebElement logotype;

    @FindBy(css = "#username")
    private WebElement inputUserName;

    @FindBy(css = "input[name='Password']")
    private WebElement inputUserPassword;

    @FindBy(css = ".button.accent")
    private WebElement btnSignIn;

    @FindBy(css = "a.auth_form_link[routerlink = '../password-recovery']")
    private static WebElement linkForgotPassword;

    @FindBy(css = "a.auth_form_link[routerlink = '../temporary-code']")
    private WebElement linkTempCode;

    @FindBy(css = "a.auth_form_link[routerlink = '../sign-up']")
    private WebElement linkRegister;

    public boolean isElementVisibleLogotype() {
        if(isElementVisible(logotype, 3)){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isElementVisibleInputUserName() {
        if(isElementVisible(inputUserName, 3)){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isElementVisibleInputUserPassword() {
        if(isElementVisible(inputUserPassword, 3)){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isElementVisibleFirstName() {
        if(isElementVisible(btnSignIn, 3)){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isElementVisibleLinkForgotPassword() {
        if(isElementVisible(linkForgotPassword, 3)){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isElementVisibleLinkTempCode() {
        if(isElementVisible(linkTempCode, 3)){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isElementVisibleLinkRegister() {
        if(isElementVisible(linkRegister, 3)){
            return true;
        }
        else {
            return false;
        }
    }

    public static void forgotPassword() {
        linkForgotPassword.click();
        Expectations.wFormAuth();
    }

    public LoginPage(WebDriver webdriver) {
        super(webdriver);
    }
}
