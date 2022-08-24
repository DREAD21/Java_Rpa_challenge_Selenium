package ru.DeliveryClub;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program {

    public static void  main(String[] args) {

        String[] F_name = { "John", "Jane", "Albert", "Michael", "Doug", "Jessie", "Stan", "Michelle", "Stacy", "Lara"};
        String[] L_name = { "Smith", "Dorsey", "Kipling", "Robertson", "Derrick", "Marlowe", "Hamm", "Norton", "Shelby", "Palmer" };
        String[] C_name = { "IT Solutions", "MediCare", "Waterfront", "MediCare", "Timepath Inc.", "Aperture Inc.", "Sugarwell", "Aperture Inc.", "TechDev", "Timepath Inc." };
        String[] Role =  {"Analyst", "Medical Engineer", "Accountant", "IT Specialist", "Analyst", "Scientist", "Advisor", "Scientist", "HR Manager", "Programmer" };
        String[] Address ={"98 North Road", "11 Crown Street", "22 Guild Street", "17 Farburn Terrace", "99 Shire Oak Road", "27 Cheshire Street", "10 Dam Road", "13 White Rabbit Street", "19 Pineapple Boulevard", "87 Orange Street"};
        String[] Email = { "jsmith@itsolutions.co.uk",  "jdorsey@mc.com", "kipling@waterfront.com", "mrobertson@mc.com", "dderrick@timepath.co.uk", "jmarlowe@aperture.us", "shamm@sugarwell.org", "mnorton@aperture.us", "sshelby@techdev.com", "lpalmer@timepath.co.uk" };
        String[] Phone = { "40716543298", "40791345621", "40735416854", "40733652145", "40799885412", "40733154268", "40712462257", "40731254562", "40741785214", "40731653845"};
        WebDriver driver = new FirefoxDriver();
        driver.get("https://rpachallenge.com/");
        WebElement Start_Button = driver.findElement(By.xpath("/html/body/app-root/div[2]/app-rpa1/div/div[1]/div[6]/button"));
        Start_Button.click();
        for(int i =0;i<10;i++)
        {
            driver.findElement(By.xpath(".//input [@ng-reflect-name='labelFirstName']")).sendKeys(F_name[i]);
            driver.findElement(By.xpath(".//input [@ng-reflect-name='labelCompanyName']")).sendKeys(C_name[i]);
            driver.findElement(By.xpath(".//input [@ng-reflect-name='labelEmail']")).sendKeys(Email[i]);
            driver.findElement(By.xpath(".//input [@ng-reflect-name='labelPhone']")).sendKeys(Phone[i]);
            driver.findElement(By.xpath(".//input [@ng-reflect-name='labelAddress']")).sendKeys(Address[i]);
            driver.findElement(By.xpath(".//input [@ng-reflect-name='labelLastName']")).sendKeys(L_name[i]);
            driver.findElement(By.xpath(".//input [@ng-reflect-name='labelRole']")).sendKeys(Role[i]);
            driver.findElement(By.xpath("/html/body/app-root/div[2]/app-rpa1/div/div[2]/form/input")).click();
        }
        WebElement searchField = driver.findElement(By.id("name1"));
        searchField.sendKeys("topbicycle.ru");
    }

}