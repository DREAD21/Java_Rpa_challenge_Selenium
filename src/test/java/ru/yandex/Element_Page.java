package ru.yandex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Element_Page
{
    public WebDriver driver;
    public Element_Page(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[contains(@class, '_2AMPZ _1tgZz _3rgh4')]")
    private WebElement carryOn;

    public void continueShopping()
    {
        carryOn.click();
    }



}
