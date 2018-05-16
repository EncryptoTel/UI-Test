package encry;

import encry.pages.SignUpPage;
import encry.pages.TempMail;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;

public class SignUpTest extends TestNgTestBase {

    private SignUpPage signUpPage;
    private TempMail tempMail;
    private Expectations expectations;

    //    @Parameters({"platform", "browserName", "version"})
    @BeforeMethod
    public void initPageObjects(/*String platform, String browserName, String version*/) {
        signUpPage = PageFactory.initElements(driver, SignUpPage.class);
        tempMail = PageFactory.initElements(driver, TempMail.class);
        expectations = PageFactory.initElements(driver, Expectations.class);
    }

    @Stories("SignUp")
    @Features("Visible Elements")
    @Test(priority = 0)
    public void visibleLogotype() {
        driver.get(baseUrl + "/sign-up");
        Assert.assertTrue(signUpPage.isElementVisibleLogotype());
    }

    @Stories("SignUp")
    @Features("Visible Elements")
    @Test(priority = 1)
    public void visibleFieldFirstName() {
        driver.get(baseUrl + "/sign-up");
        Assert.assertTrue(signUpPage.isElementVisibleFieldFirstName());
    }

    @Stories("SignUp")
    @Features("Visible Elements")
    @Test(priority = 2)
    public void visibleFieldEmail() {
        driver.get(baseUrl + "/sign-up");
        Assert.assertTrue(signUpPage.isElementVisibleFieldEmail());
    }

    @Stories("SignUp")
    @Features("Visible Elements")
    @Test(priority = 3)
    public void visibleFieldPassword() {
        driver.get(baseUrl + "/sign-up");
        Assert.assertTrue(signUpPage.isElementVisibleFieldPassword());
    }

    @Stories("SignUp")
    @Features("Visible Elements")
    @Test(priority = 4)
    public void visibleFieldConfirmPassword() {
        driver.get(baseUrl + "/sign-up");
        Assert.assertTrue(signUpPage.isElementVisibleFieldConfirmPassword());
    }

    @Stories("SignUp")
    @Features("Visible Elements")
    @Test(priority = 5)
    public void visibleBtnSignUp() {
        driver.get(baseUrl + "/sign-up");
        Assert.assertTrue(signUpPage.isElementVisibleFieldBtnSignUp());
    }

    @Stories("SignUp")
    @Features("Visible Elements")
    @Test(priority = 6)
    public void visibleLinkTariffPlans() {
        driver.get(baseUrl + "/sign-up");
        Assert.assertTrue(signUpPage.isElementVisibleFieldLinkTariffPlans());
    }

    @Stories("SignUp")
    @Features("Visible Elements")
    @Test(priority = 7)
    public void visibleLinkSignIn() {
        driver.get(baseUrl + "/sign-up");
        Assert.assertTrue(signUpPage.isElementVisibleFieldLinkSignIn());
    }

    @Stories("SignUp")
    @Features("Check Elements")
    @Test(priority = 8)
    public void checkPlaceholderFirstName() {
        driver.get(baseUrl + "/sign-up");
        Assert.assertEquals(signUpPage.getPlaceholderName(), "Name");
    }

    @Stories("SignUp")
    @Features("Check Elements")
    @Test(priority = 9)
    public void checkPlaceholderEmail() {
        driver.get(baseUrl + "/sign-up");
        Assert.assertEquals(signUpPage.getPlaceholderEmail(), "E-mail");
    }

    @Stories("SignUp")
    @Features("Check Elements")
    @Test(priority = 10)
    public void checkPlaceholderPassword() {
        driver.get(baseUrl + "/sign-up");
        Assert.assertEquals(signUpPage.getPlaceholderPassword(), "Password");
    }

    @Stories("SignUp")
    @Features("Check Elements")
    @Test(priority = 11)
    public void checkPlaceholderConfirmPassword() {
        driver.get(baseUrl + "/sign-up");
        Assert.assertEquals(signUpPage.getPlaceholderConfirmPassword(), "Confirm password");
    }

    @Stories("SignUp")
    @Features("Check Elements")
    @Test(priority = 12)
    public void checkTextTariff() {
        driver.get(baseUrl + "/sign-up");
        Assert.assertEquals(signUpPage.getTextAreaTariffPlan(), "Your tariff plan is Basic (Free). \n" + "Change it?\n");
    }

    @Stories("SignUp")
    @Features("Check Elements")
    @Test
    public void checkTextLinkTariff() {
        driver.get(baseUrl + "/sign-up");
        Assert.assertEquals(signUpPage.getLinkTariffPlan(), "Change it?");
    }

    @Stories("SignUp")
    @Features("Check Elements")
    @Test(priority = 13)
    public void checkBtnTextSignUp() {
        driver.get(baseUrl + "/sign-up");
        Assert.assertEquals(signUpPage.getTextBtnSignUp(), "Sign Up");
    }

    @Stories("SignUp")
    @Features("Check Elements")
    @Test(priority = 14)
    public void checkTextAlreadyHaveAccount() {
        driver.get(baseUrl + "/sign-up");
        Assert.assertEquals(signUpPage.getTextAreaAlreadyHaveAccount(), "Already have an EncryptoTel Account?");
    }

    @Stories("SignUp")
    @Features("Check Elements")
    @Test(priority = 15)
    public void checkLinkTextSignIn() {
        driver.get(baseUrl + "/sign-up");
        Assert.assertEquals(signUpPage.getLinkSignIn(), "Sign in now");
    }

    @Stories("SignUp")
    @Features("Check Elements")
    @Test(priority = 16)
    public void checkRouteLinkChangeTariff() {
        driver.get(baseUrl + "/sign-up");
        Assert.assertEquals(signUpPage.getRouteLinkTariffPlan(), "tariff_plans");
    }

    @Stories("SignUp")
    @Features("Check Elements")
    @Test(priority = 16)
    public void checkRouteLinkSignIn() {
        driver.get(baseUrl + "/sign-up");
        Assert.assertEquals(signUpPage.getRouteLinkSignIn(), "../sign-in");
    }

    @Stories("SignUp")
    @Features("Check Elements")
    @Test(priority = 16)
    public void checkHrefLinkChangeTariff() {
        driver.get(baseUrl + "/sign-up");
        Assert.assertEquals(signUpPage.getHrefLinkTariffPlan(), "http://pbx-front-dev.encry.ru/sign-up/tariff_plans");
    }

    @Stories("SignUp")
    @Features("Check Elements")
    @Test(priority = 16)
    public void checkHrefLinkSignIn() {
        driver.get(baseUrl + "/sign-up");
        Assert.assertEquals(signUpPage.getHrefLinkSignIn(), "http://pbx-front-dev.encry.ru/sign-in");
    }

    @Stories("SignUp")
    @Features("Check Elements")
    @Test(priority = 17)
    public void checkLinkSignIn() {
        driver.get(baseUrl + "/sign-up");
        signUpPage.goToSignIn();
        Assert.assertEquals(driver.getCurrentUrl(), "http://pbx-front-dev.encry.ru/sign-in");
    }

    @Stories("SignUp")
    @Features("Register")
    @Test(priority = 17)
    public void registerTemp() throws InterruptedException {
        driver.get(baseUrl + "/sign-up");
        openTab();
        driver.get(tempEmail);
        switchToWindow(parentHandler);
        signUpPage.typeFirstName("testName");
        System.out.println(tempMail.tempEmail());
        signUpPage.typeEmail();
        Thread.sleep(3000);

    }

}
