package encry;

import encry.pages.SignUpPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;

public class SignUpTest extends TestNgTestBase {

    private SignUpPage signUpPage;
    private Expectations expectations;

//    @Parameters({"platform", "browserName", "version"})
    @BeforeMethod
    public void initPageObjects(/*String platform, String browserName, String version*/) {
        signUpPage = PageFactory.initElements(driver, SignUpPage.class);
        expectations = PageFactory.initElements(driver, Expectations.class);
    }

    @Stories("SignUp")
    @Features("Visible Fields")
    @Test
    public void visibleFieldFirstName() {
        driver.get(baseUrl + "/sign-up");
        Assert.assertTrue(signUpPage.isElementVisibleFieldFirstName());
    }

    @Stories("SignUp")
    @Features("Visible Fields")
    @Test
    public void visibleFieldEmail() {
        driver.get(baseUrl + "/sign-up");
        Assert.assertTrue(signUpPage.isElementVisibleFieldEmail());
    }

    @Stories("SignUp")
    @Features("Visible Fields")
    @Test
    public void visibleFieldPassword() {
        driver.get(baseUrl + "/sign-up");
        Assert.assertTrue(signUpPage.isElementVisibleFieldPassword());
    }

    @Stories("SignUp")
    @Features("Visible Fields")
    @Test
    public void visibleFieldConfirmPassword() {
        driver.get(baseUrl + "/sign-up");
        Assert.assertTrue(signUpPage.isElementVisibleFieldConfirmPassword());
    }

    @Stories("SignUp")
    @Features("Visible Buttons")
    @Test
    public void visibleBtnSignUp() {
        driver.get(baseUrl + "/sign-up");
        Assert.assertTrue(signUpPage.isElementVisibleFieldBtnSignUp());
    }

    @Stories("SignUp")
    @Features("Visible Links")
    @Test
    public void visibleLinkTariffPlans() {
        driver.get(baseUrl + "/sign-up");
        Assert.assertTrue(signUpPage.isElementVisibleFieldLinkTariffPlans());
    }

    @Stories("SignUp")
    @Features("Check Placeholders")
    @Test
    public void placeholderFirstName() {
        driver.get(baseUrl + "/sign-up");
        Assert.assertEquals(signUpPage.getPlaceholderName(), "Name");
    }

    @Stories("SignUp")
    @Features("Check Placeholders")
    @Test
    public void placeholderEmail() {
        driver.get(baseUrl + "/sign-up");
        Assert.assertEquals(signUpPage.getPlaceholderEmail(), "E-mail");
    }

    @Stories("SignUp")
    @Features("Check Placeholders")
    @Test
    public void placeholderPassword() {
        driver.get(baseUrl + "/sign-up");
        Assert.assertEquals(signUpPage.getPlaceholderPassword(), "Password");
    }

    @Stories("SignUp")
    @Features("Check Placeholders")
    @Test
    public void placeholderConfirmPassword() {
        driver.get(baseUrl + "/sign-up");
        Assert.assertEquals(signUpPage.getPlaceholderConfirmPassword(), "Confirm password");
    }
}
