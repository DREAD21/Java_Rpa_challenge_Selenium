package ru.yandex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Payments
{
    public WebDriver driver;
    public Payments(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    public String get_title()
    {
        return driver.getTitle();
    }
}
