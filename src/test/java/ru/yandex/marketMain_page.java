package ru.yandex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class marketMain_page
{
    public WebDriver driver;
    public marketMain_page(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"header-search\"]")
    private WebElement search_bar;

    @FindBy(xpath = "//*[contains(text(), 'Найти')]/..")
    private WebElement search;

    public void Search()
    {
        search_bar.sendKeys("amd ryzen 5 1600");
    }
    public void Click()
    {
        search.click();
    }

}
