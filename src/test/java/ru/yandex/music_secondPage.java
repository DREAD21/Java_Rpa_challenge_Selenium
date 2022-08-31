package ru.yandex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class music_secondPage
{
    public WebDriver driver;

    public music_secondPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[contains(@class, 'd-icon deco-icon d-icon_heart  d-like__icon deco-buttonish-like-icon-pale')]")
    private WebElement like;

    public void Like()
    {
        like.click();
    }

}
