package encry.pages;

import encry.Expectations;
import encry.TestNgTestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@SuppressWarnings("ALL")
public class SignUpPage extends Page {

    public  WebDriver driver;
    private WebElement element;
    private String name = "testName";
    private String eMail = "test@encry.ru";

    @FindBy(css = "#logo_EncryptoTel")
    private WebElement logotype;

    @FindBy(css = "input[name='Name']")
    private WebElement fieldFirstName;

    @FindBy(css = "input[name='E-mail']")
    private WebElement fieldEmail;

    @FindBy(css = "input[name='Password']")
    private WebElement fieldPassword;

    @FindBy(css = "input[name='Confirm password']")
    private WebElement fieldConfirmPassword;

    @FindBy(css = "div:nth-child(5)")
    private WebElement textAreaTariffPlan;

    @FindBy(css = "div:nth-child(7)")
    private WebElement textAreaAlreadyHaveAccount;

    @FindBy(css = "button.button.accent")
    private WebElement btnSignUp;

    @FindBy(css = "button > span")
    private WebElement spanSignUp;

    @FindBy(css = "div > a.auth_form_link")
    private WebElement linkTariffPlans;

    @FindBy(css = "form > a")
    private WebElement linkSignIn;

    @FindBy(css = "div.auth_form_message")
    private WebElement messageCreateUser;

    public SignUpPage typeFirstName(String name) {
        fieldFirstName.sendKeys(name);
        return new SignUpPage(driver);
    }

    public SignUpPage typeEmail(String mail) {
        fieldEmail.sendKeys(mail);
        return new SignUpPage(driver);
    }

    public SignUpPage typePassword(String pass) {
        fieldPassword.sendKeys(pass);
        return new SignUpPage(driver);
    }

    public SignUpPage typeConfirmPassword(String confirmPass) {
        fieldConfirmPassword.sendKeys(confirmPass);
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

    public boolean isElementVisibleLogotype() {
        if (isElementVisible(logotype, 3)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isElementVisibleFieldFirstName() {
        if (isElementVisible(fieldFirstName, 3)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isElementVisibleFieldEmail() {
        if (isElementVisible(fieldEmail, 3)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isElementVisibleFieldPassword() {
        if (isElementVisible(fieldPassword, 3)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isElementVisibleFieldConfirmPassword() {
        if (isElementVisible(fieldConfirmPassword, 3)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isElementVisibleFieldBtnSignUp() {
        if (isElementVisible(btnSignUp, 3)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isElementVisibleFieldLinkTariffPlans() {
        if (isElementVisible(linkTariffPlans, 3)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isElementVisibleFieldLinkSignIn() {
        if (isElementVisible(linkSignIn, 3)) {
            return true;
        } else {
            return false;
        }
    }

    public String getPlaceholderName() {
        Expectations.wFormAuth();
        return getPlaceholder(fieldFirstName);
    }

    public String getPlaceholderEmail() {
        Expectations.wFormAuth();
        return getPlaceholder(fieldEmail);
    }

    public String getPlaceholderPassword() {
        Expectations.wFormAuth();
        return getPlaceholder(fieldPassword);
    }

    public String getPlaceholderConfirmPassword() {
        Expectations.wFormAuth();
        return getPlaceholder(fieldConfirmPassword);
    }

    public String getTextBtnSignUp() {
//        return spanSignUp.getAttribute("innerText").contains(text);
        return getInnerText(spanSignUp);
    }

    public String getTextAreaTariffPlan() {
//        return textAreaTariffPlan.getAttribute("innerText").contains(text);
        return getInnerText(textAreaTariffPlan);
    }

    public String getLinkTariffPlan() {
//        return linkTariffPlans.getAttribute("innerText").contains(text);
        return getInnerText(linkTariffPlans);
    }

    public String getLinkSignIn() {
        return getInnerText(linkSignIn);
    }

    public String getTextAreaAlreadyHaveAccount() {
        return getInnerText(textAreaAlreadyHaveAccount);
    }

    public String getRouteLinkTariffPlan() {
        return getRouterLink(linkTariffPlans);
    }

    public String getRouteLinkSignIn() {
        return getRouterLink(linkSignIn);
    }

    public String getHrefLinkTariffPlan() {
        return getHref(linkTariffPlans);
    }

    public String getHrefLinkSignIn() {
        return getHref(linkSignIn);
    }

    public void goToSignIn() {
        linkSignIn.click();
        Expectations.wFormAuth();
    }

    public SignUpPage typeName() {
        Expectations.wFormAuth();
        fieldFirstName.sendKeys(name);
        return new SignUpPage(driver);
    }

    public SignUpPage typeEmail() {
        TempMail tempMail = new TempMail(driver);
        fieldEmail.sendKeys(tempMail.tempEmail());
        return new SignUpPage(driver);
    }

    public SignUpPage(WebDriver driver) {
        super(driver);
    }
}
