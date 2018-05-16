package encry.pages;

import org.openqa.selenium.JavascriptExecutor;
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

  protected static WebDriver driver;

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
    String placeholder = element.getAttribute("placeholder").toString();
    return placeholder;
  }

  String getInnerText(WebElement element) {
    return element.getAttribute("innerText").toString();
  }

  String getRouterLink(WebElement element) {
    String placeholder = element.getAttribute("routerlink").toString();
    return placeholder;
  }

  String getHref(WebElement element) {
    String placeholder = element.getAttribute("href").toString();
    return placeholder;
  }

  public Page(WebDriver driver) {
    this.driver = driver;
  }

  public String getTitle() {
    return driver.getTitle();
  }

}
