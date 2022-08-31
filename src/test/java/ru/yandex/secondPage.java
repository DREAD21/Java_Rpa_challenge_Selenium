package ru.yandex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class secondPage
{
    public WebDriver driver;
    public secondPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[contains(@class, '_3EJ5Q _2CMdB _2eh9H _1WMyB _2Sz75 _1Xumh _2VlTH')]")
    private WebElement firstElement;

    @FindBy(xpath = "//*[contains(text(), 'Продолжить покупки')]")
    private WebElement carryOn;

    @FindBy(xpath = "//*[contains(text(), 'Корзина')]")
    private WebElement cart;

    public void Click()
    {
        driver.findElement(By.cssSelector("div._21pk1:nth-child(2) > div:nth-child(1) > button:nth-child(1)")).click();
    }

    public void continueShopping()
    {
        carryOn.click();
    }

    public void go_toCart()
    {
        cart.click();
    }
}
