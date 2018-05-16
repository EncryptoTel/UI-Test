package encry.pages;

import encry.Expectations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@SuppressWarnings("ALL")
public class TempMail extends Page {

    @FindBy(css = "span.email")
    private WebElement tempEmail;

    public String tempEmail() {
        Expectations.wTempMail();
        return tempEmail.getText().toString();
    }

    public TempMail(WebDriver driver) {
        super(driver);
    }
}
