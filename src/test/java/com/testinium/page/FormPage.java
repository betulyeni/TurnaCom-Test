package com.testinium.page;
import com.testinium.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import static com.testinium.util.ConstantsPage.*;
import static com.testinium.util.ConstantsValues.*;

public class FormPage extends BasePage {
    public FormPage(WebDriver driver, WebDriverWait wait) {
        super(driver,wait);
    }

    public void fillForm()
    {
        clickBy(GONDER);
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,300)");
        setBy(FIRST_NAME_TEXT, FIRST_NAME);
        waitSeconds(2);
        setBy(LAST_NAME_TEXT, LAST_NAME);
        dogumgunu();
        selectOption(TC, "TR");
        setBy(TC_NUMBER_TEXT, TC_NUMBER);
        setBy(PASSPORT_NUMBER_TEXT, PASSPORT_NUMBER);
        clickBy(TIME);
        selectOption(By.id("phoneprefix"),"+90");
        setBy(PHONE_TEXT, PHONE);
        setBy(EMAIL_TEXT, EMAIL);
        clickBy(INSURANCE);
        clickBy(PAY_BTN);
    }

    public void dogumgunu()
    {
        selectOption(BIRTH_DAY, "24");
        selectOption(BIRTH_MONTH, "10");
        selectOption(BIRTH_YEAR, "1995");
    }
}
