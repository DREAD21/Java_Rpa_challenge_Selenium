package ru.yandex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartFunc {
    public WebDriver driver;

    public cartFunc(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[contains(@class, '_1KpjX Wbmen _26fQM')]")
    private WebElement deleteButton;

    @FindBy(xpath = "//*[contains(@class, '_2AMPZ _1tgZz _3_b2k _390_8 lc2R9')]")
    private WebElement deleteConfirm;

    @FindBy(xpath = "//*[contains(@class, '_2Inww _36SPc _2UmYQ')]")
    private WebElement str;

    public void deleteClick()
    {
        deleteButton.click();
    }

    public void DeleteConfirm()
    {
        deleteConfirm.click();
    }

    public String Str()
    {
        return str.getText();
    }


}

