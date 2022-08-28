package ru.yandex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginuser
{
    public WebDriver driver;
    public Loginuser(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }
    private final String login = login;
    private final String pass = password;

    @FindBy(xpath = "//*[@id=\"passp-field-login\"]")
    private WebElement loginField;

    @FindBy(xpath = "//*[@id=\"passp-field-passwd\"]")
    private WebElement passField;
//
    @FindBy(xpath = "//*[contains(text(), 'Войти')]/..")
    private WebElement button;

    @FindBy(xpath = "//*[contains(text(), 'Почта')]/..")
    private WebElement Emailbutton;

    public void emailButton()
    {
        Emailbutton.click();
    }
    public void inputLogin()
    {
        loginField.sendKeys(login);
    }
    public void inputPass()
    {
        passField.sendKeys(pass);
    }
    public void Click()
    {
        button.click();
    }
    public void EmailClick()
    {
        Emailbutton.click();
    }

}
