package ru.yandex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class music_Home
{
    public WebDriver driver;

    public music_Home(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[contains(@class, 'd-input__field deco-input d-input__field_size-S deco-input_suggest')]")
    private WebElement search_bar;

    @FindBy(xpath = "//*[contains(@class, 'd-button deco-button deco-button-flat d-button_type_flat d-button_w-icon d-button_w-icon-centered d-search__button')]")
    private WebElement search;

    @FindBy(xpath = "//*[contains(@class, 'd-button deco-button deco-button-flat d-button_type_flat d-button_w-icon d-button_w-icon-centered suggest-button suggest-button_left')]")
    private WebElement search_for;

    @FindBy(xpath = "//*[contains(@class, 'pay-promo-close-btn js-close')]")
    private WebElement close;

    public void Close()
    {
        close.click();
    }
    public void Click()
    {
        search.click();
    }
    public void search_Bar()
    {
        search_bar.sendKeys("Light the night");
    }
    public void search_Click()
    {
        search_for.click();
    }
}
