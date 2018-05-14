package encry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Expectations extends TestNgTestBase {

    public static WebDriver driver;
    public static WebElement element;

//    SignUp Page

    public static void wFormAuth() {
        element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div > form")));
    }

    public static void wFieldFirstName() {
        element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='Name']")));
    }

    public static void wFieldEmail() {
        element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='E-mail']")));
    }

    public static void wFieldPassword() {
        element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='Password']")));
    }

    public static void wFieldConfirmPassword() {
        element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='Confirm password']")));
    }

    public static void wBtnSignUp() {
        element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.button.accent")));
    }

    public static void wMessageCreateUser() {
        element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.auth_form_message")));
    }

    public Expectations(WebDriver driver) {
        Expectations.driver = driver;
    }


}
