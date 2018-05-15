package encry;

import encry.pages.LoginPage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;

import java.util.concurrent.TimeUnit;

public class LoginPageTest extends TestNgTestBase {

    private LoginPage loginPage;
    private Expectations expectations;

    @Parameters({"platform", "browserName", "version"})
    @BeforeMethod
    public void initPageObjects(String platform, String browserName, String version) {
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        expectations = PageFactory.initElements(driver, Expectations.class);
    }

    @Stories("LoginPage")
    @Features("Logotype displayed")
    @Test
    public void loginDisplayed() {
        driver.get(baseUrl);
        Assert.assertTrue(loginPage.isElementVisibleLogotype());
    }

    @Stories("LoginPage")
    @Features("InputUserName displayed")
    @Test
    public void inputUserNameDisplayed() {
        driver.get(baseUrl);
        Assert.assertTrue(loginPage.isElementVisibleInputUserName());
    }

    @Stories("LoginPage")
    @Features("InputUserPassword displayed")
    @Test
    public void inputUserPasswordDisplayed() {
        driver.get(baseUrl);
        Assert.assertTrue(loginPage.isElementVisibleInputUserPassword());
    }

    @Stories("LoginPage")
    @Features("BtnSubmit displayed")
    @Test
    public void buttonSubmitVisible() {
        driver.get(baseUrl);
        Assert.assertTrue(loginPage.isElementVisibleFirstName());
    }

    @Stories("LoginPage")
    @Features("LinkForgotPassword displayed")
    @Test
    public void linkForgotPasswordDisplayed() {
        driver.get(baseUrl);
        Assert.assertTrue(loginPage.isElementVisibleLinkForgotPassword());
    }

    @Stories("LoginPage")
    @Features("LinkTempCode displayed")
    @Test
    public void linkTempCodeDisplayed() {
        driver.get(baseUrl);
        Assert.assertTrue(loginPage.isElementVisibleLinkTempCode());
    }

    @Stories("LoginPage")
    @Features("LinkRegister displayed")
    @Test
    public void linkRegisterDisplayed() {
        driver.get(baseUrl);
        Assert.assertTrue(loginPage.isElementVisibleLinkRegister());
    }
}
