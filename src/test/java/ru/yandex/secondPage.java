package ru.yandex;

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

    @FindBy(xpath = "//*[contains(text(), 'В корзину')]")
    private WebElement firstElement;

    @FindBy(xpath = "//*[contains(text(), 'Продолжить покупки')]")
    private WebElement carryOn;

    @FindBy(xpath = "//*[contains(text(), 'Корзина')]")
    private WebElement cart;

    public void Click()
    {
        firstElement.click();
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
