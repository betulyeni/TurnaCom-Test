package com.testinium.page;
import com.testinium.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import static com.testinium.util.ConstantsPage.*;
import static com.testinium.util.ConstantsValues.*;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver,WebDriverWait wait) {
        super(driver,wait);
    }

    public TicketPage ticketSearch() {

        setBy(TICKET_1, SEARCH_FROM);
        waitSeconds(3);
        tabClick(TICKET_1);
        setBy(TICKET_2, SEARCH_TO);
        waitSeconds(2);
        tabClick(TICKET_2);
        clickBy(GOING_CALENDER);
        waitSeconds(2);
        clickBy(SELECT_GOING_DATE);
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,400)");
        waitSeconds(2);
        clickBy(By.className("popup-close"));
        clickBy(SEARCH_BTN);
        return new TicketPage(webDriver, wait);
         }

}
