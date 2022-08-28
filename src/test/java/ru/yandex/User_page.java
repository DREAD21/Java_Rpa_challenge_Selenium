package ru.yandex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class User_page
{
    public WebDriver driver;
    public User_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }
    @FindBy(xpath= "//*[contains(@class, 'personal-info-login')]")
    private WebElement userMenu;

    @FindBy(xpath = "//*[contains(@class, 'menu__item menu__item_type_link legouser__menu-item legouser__menu-item_action_mail')]")
    private WebElement Mail;

    @FindBy(xpath = "//*[contains(@class, 'user-account user-account_has-ticker_yes user-account_has-accent-letter_yes legouser__current-account i-bem')]")
    private WebElement user_account;

    public String userName()
    {
        return userMenu.getText();
    }
    public void goToEmail()
    {
        user_account.click();
        Mail.click();
    }
}
