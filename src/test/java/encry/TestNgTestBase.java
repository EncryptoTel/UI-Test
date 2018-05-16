package encry;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import ru.stqa.selenium.factory.WebDriverPool;
import sun.plugin2.message.HeartbeatMessage;

/**
 * Base class for TestNG-based test classes
 */
public class TestNgTestBase {

  protected static URL gridHubUrl = null;
  protected static String baseUrl;
  protected static Capabilities capabilities;

  protected static WebDriver driver;
  static String parentHandler;
  static String currentHandler;
  static String tempEmail = "https://dropmail.me/ru/";

  @BeforeSuite
  public void initTestSuite() throws IOException {
    SuiteConfiguration config = new SuiteConfiguration();
    baseUrl = config.getProperty("site.url");
    if (config.hasProperty("grid.url") && !"".equals(config.getProperty("grid.url"))) {
      gridHubUrl = new URL(config.getProperty("grid.url"));
    }
    capabilities = config.getCapabilities();
  }

  @BeforeMethod
  public void initWebDriver() {
    driver = WebDriverPool.DEFAULT.getDriver(gridHubUrl, capabilities);
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.manage().window().setSize(new Dimension(1600, 900));
  }

  @AfterMethod(alwaysRun = true)
  public void tearDownMethod() {
    WebDriverPool.DEFAULT.dismissAll();
  }

  @AfterSuite(alwaysRun = true)
  public void tearDown() {
    WebDriverPool.DEFAULT.dismissAll();
  }

  public static void openTab() {
    parentHandler();
    ((JavascriptExecutor) driver).executeScript("window.open();");
    switchTab();
    currentHandler();
  }

  static void parentHandler() {
    parentHandler = driver.getWindowHandle();
    System.out.println("parentHandler: " + parentHandler);
  }

  static void currentHandler() {
    currentHandler = driver.getWindowHandle();
    System.out.println("currentHandler: " + currentHandler);
  }

  static void switchTab() {
    for (String winHandle : driver.getWindowHandles()) {
      driver.switchTo().window(winHandle);
    }
  }

  static void switchToWindow(String handle) {
    driver.switchTo().window(handle);
    System.out.println("Switch to: " + handle);
  }

}
