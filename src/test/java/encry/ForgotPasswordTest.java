package encry;

import encry.pages.ForgotPasswordPage;
import encry.pages.LoginPage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class ForgotPasswordTest extends TestNgTestBase {

    private LoginPage loginPage;
    private ForgotPasswordPage forgotPasswordPage;

//    @Parameters({"platform", "browserName", "version"})
    @BeforeMethod
    public void initPageObjects(/*String platform, String browserName, String version*/) {
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        forgotPasswordPage = PageFactory.initElements(driver, ForgotPasswordPage.class);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(1600, 900));
    }

    @Stories("ForgotPasswordPage")
    @Features("Input Email Recovery displayed")
    @Test
    public void visibleInputEmailRecovery  () {
        driver.get(baseUrl +"/password-recovery");
        assertTrue(forgotPasswordPage.isElementVisibleInputEmailRecovery());
    }

    @Stories("ForgotPasswordPage")
    @Features("Input Confirm Button displayed")
    @Test
    public void visibleConfirmButton  () {
        driver.get(baseUrl +"/password-recovery");
        assertTrue(forgotPasswordPage.isElementVisibleBtnSubmit());
    }

    /*@Features("ForgotPasswordPage")
    @Stories("Delete User")
    @Test(priority = 1)
    public void authentification_loginIncorrect() {
        String message = response(postDataLogin(), pathLogin, 400);
        Assert.assertEquals(message, "User not found.");
    }*/


}
