package encry.pages;

import encry.Expectations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.plugin2.message.HeartbeatMessage;

import java.util.concurrent.TimeUnit;

/**
 * Abstract class representation of a Page in the UI. Page object pattern
 */
public abstract class Page {

  protected WebDriver driver;

  boolean isElementVisible(WebElement webElement, int timeOut) {
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
  }

  String getPlaceholder(WebElement element) {
    String placeholder = element.getAttribute("placeholder");
    return placeholder;
  }

  /*
   * Constructor injecting the WebDriver interface
   * 
   * @param webDriver
   */
  public Page(WebDriver driver) {
    this.driver = driver;
  }

  public String getTitle() {
    return driver.getTitle();
  }

}
