package ru.yandex;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Program
{
    public static WebDriver driver;
    public static User_page userpage;
    public static Loginuser loginuser;
    public static Payments email;
    public static marketMain_page marketMain;
    public static secondPage second;
    public static Element_Page elementPage;
    public static cartFunc cart;
    public static music_Home m_Home;
    public static music_secondPage m_Second;

    @BeforeClass
    public static void Setup()
    {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Никита\\Documents\\webdrivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        loginuser = new Loginuser(driver);
        userpage = new User_page(driver);
        email = new Payments(driver);
        marketMain = new marketMain_page(driver);
        second = new secondPage(driver);
        elementPage = new Element_Page(driver);
        cart = new cartFunc(driver);
        m_Home = new music_Home(driver);
        m_Second = new music_secondPage(driver);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        //задержка на выполнение теста = 10 сек.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void Test1()
    {
        driver.get("https://passport.yandex.ru/auth");
        loginuser.emailButton();
        loginuser.inputLogin();
        loginuser.Click();
        loginuser.inputPass();
        loginuser.Click();
        String name = userpage.userName();
        Assert.assertEquals(name, "krasnov.nikit2015");
//        userpage.goToEmail();
//        Assert.assertEquals(email.get_title(), "Яндекс Почта");

    }
    @Test
    public void Test2()
    {
        driver.get("https://market.yandex.ru/");
        marketMain.Search();
        marketMain.Click();
        second.Click();
        //elementPage.continueShopping();
        //second.continueShopping();
        second.go_toCart();
        cart.deleteClick();
        cart.DeleteConfirm();
        Assert.assertEquals(cart.Str(), "Сложите в корзину нужные товары");
    }
    @Test
    public void Test3()
    {
        driver.get("https://music.yandex.ru/home");
        m_Home.Close();
        m_Home.Click();
        m_Home.search_Bar();
        m_Home.search_Click();
        m_Home.search_Click();
        m_Second.Like();
        driver.get("https://music.yandex.ru/users/krasnov.nikit2015/playlists");


    }
}