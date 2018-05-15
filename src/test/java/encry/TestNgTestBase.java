package encry;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Capabilities;

import org.openqa.selenium.WebElement;
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

  protected WebDriver driver;

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

  /*boolean isElementVisible(WebElement webElement, int timeOut) {
    boolean isElementVisible = false;
    WebDriverWait wait = new WebDriverWait(driver, timeOut);
    if (timeOut < HeartbeatMessage.DEFAULT_TIMEOUT || timeOut < 2){
      driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
    }
    try {
      wait.until(ExpectedConditions.visibilityOf(webElement));
      isElementVisible =  true;
    } finally {
      driver.manage().timeouts()
              .implicitlyWait(HeartbeatMessage.DEFAULT_TIMEOUT, TimeUnit.SECONDS);
    }
    return isElementVisible;
  }*/
}
