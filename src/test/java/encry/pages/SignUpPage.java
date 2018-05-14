package encry.pages;

import encry.Expectations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends Page {

    public static WebDriver driver;
    private static WebElement element;

    @FindBy(css = "input[name='Name']")
    private WebElement firstName;

    @FindBy(css = "input[name='E-mail']")
    private WebElement email;

    @FindBy(css = "input[name='Password']")
    private WebElement password;

    @FindBy(css = "input[name='Confirm password']")
    private WebElement confirmPassword;

    @FindBy(css = "button.button.accent")
    private WebElement btnSignUp;

    @FindBy(css = "a.auth_form_link[routerlink='tariff_plans']")
    private WebElement linkTariffPlans;

    @FindBy(css = "div.auth_form_message")
    private WebElement messageCreateUser;

    public SignUpPage typeFirstName(String name) {
        firstName.sendKeys(name);
        return new SignUpPage(driver);
    }

    public SignUpPage typeEmail(String mail) {
        email.sendKeys(mail);
        return new SignUpPage(driver);
    }

    public SignUpPage typePassword(String pass) {
        password.sendKeys(pass);
        return new SignUpPage(driver);
    }

    public SignUpPage typeConfirmPassword(String confirmPass) {
        confirmPassword.sendKeys(confirmPass);
        return new SignUpPage(driver);
    }

    public SignUpPage btnConfirmRegister() {
        btnSignUp.click();
        return new SignUpPage(driver);
    }

    public String getTextMessageCreateUser() {
        Expectations.wMessageCreateUser();
        String message = messageCreateUser.getText();
        return message;
    }

    public boolean isElementVisibleFieldFirstName() {
        if(isElementVisible(firstName, 3)){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isElementVisibleFieldEmail() {
        if(isElementVisible(email, 3)){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isElementVisibleFieldPassword() {
        if(isElementVisible(password, 3)){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isElementVisibleFieldConfirmPassword() {
        if(isElementVisible(confirmPassword, 3)){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isElementVisibleFieldBtnSignUp() {
        if(isElementVisible(btnSignUp, 3)){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isElementVisibleFieldLinkTariffPlans() {
        if(isElementVisible(linkTariffPlans, 3)){
            return true;
        }
        else {
            return false;
        }
    }

    public String getPlaceholderName() {
        Expectations.wFormAuth();
        return getPlaceholder(firstName);
    }

    public String getPlaceholderEmail() {
        Expectations.wFormAuth();
        return getPlaceholder(email);
    }

    public String getPlaceholderPassword() {
        Expectations.wFormAuth();
        return getPlaceholder(password);
    }

    public String getPlaceholderConfirmPassword() {
        Expectations.wFormAuth();
        return getPlaceholder(confirmPassword);
    }

    public SignUpPage(WebDriver driver) {
        super(driver);
    }
}
