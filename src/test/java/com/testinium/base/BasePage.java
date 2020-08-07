package com.testinium.base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public WebDriver webDriver;
    public  Actions builder;
    public  WebDriverWait wait;

    public BasePage(WebDriver webDriver, WebDriverWait wait){
        this.webDriver = webDriver;
        this.wait =wait;
        this.builder = new Actions(webDriver);
    }
    public void waitSeconds(int second){
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void setBy(By by, String text){
        WebElement element = new WebDriverWait(webDriver, 30).until(ExpectedConditions.visibilityOfElementLocated((by)));
        element.clear();
        element.sendKeys(text);
    }
    public void clickBy(By by){
        WebElement element = new WebDriverWait(webDriver, 30).until(ExpectedConditions.elementToBeClickable((by)));
        element.click();
    }
    public void selectOption(By by,String value){
        Select select=new Select(webDriver.findElement(by));
        select.selectByValue(value);
    }
    public void tabClick(By by){
        webDriver.findElement(by).sendKeys(Keys.TAB);
    }

}
