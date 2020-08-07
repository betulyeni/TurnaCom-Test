package com.testinium.util;
import org.openqa.selenium.By;

public class ConstantsPage {
    public static final By ROUND_TRIP = By.id("lb-one-way");
    public static final By TICKET_1 = By.id("flight-from");
    public static final By TICKET_2 = By.id("flight-to");
    public static final By GOING_CALENDER = By.xpath("//div[contains(@class,'dtp-wrap-from')]");
    public static final By SELECT_GOING_DATE = By.xpath("(//a[@class=\"ui-state-default\"])[10]");
    public static final By RETURN_CALENDER = By.xpath("//div[contains(@class,'dtp-wrap-to')]");
    public static final By SELECT_RETURN_DATE = By.xpath("(//a[@class=\"ui-state-default\"])[5]");
    public static final By SEARCH_BTN = By.id("btnSearch");
    public static final By TICKET_SELECT = By.className("bt-choose");
    public static final By GONDER = By.id("lb-female");
    public static final By FIRST_NAME_TEXT = By.xpath("//input[contains(@class,'firstname')]");
    public static final By LAST_NAME_TEXT = By.xpath("//input[contains(@class,'lastname')]");
    public static final By BIRTH_DAY = By.xpath("//select[contains(@class,'day-of-birth')]");
    public static final By BIRTH_MONTH = By.xpath("//select[contains(@class,'month-of-birth')]");
    public static final By BIRTH_YEAR = By.xpath("//select[contains(@class,'year-of-birth')]");
    public static final By TC = By.id("passenger-nationality");
    public static final By TC_NUMBER_TEXT = By.xpath("//input[contains(@class,'citizenno')]");
    public static final By PASSPORT_NUMBER_TEXT = By.xpath("//input[contains(@class,'passportNumber')]");
    public static final By TIME = By.xpath("//input[contains(@class,'is-passport-indefinite')]");
    public static final By PHONE_TEXT = By.id("txtPhone");
    public static final By EMAIL_TEXT = By.id("txtEmail");
    public static final By INSURANCE = By.xpath("//label[contains(@class,'lb-do-not-want-insurance')]");
    public static final By PAY_BTN = By.className("to-booking");




}
