/**
 * Класс Test2
 * @comments : Негативный сценарий 
 */

package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Test2 {
    public static void main(String[] args) {
        
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        options.addArguments("disable-popup-blocking");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        
        driver.get("https://www.laredoute.ru/");

        
        driver.get("https://www.laredoute.ru/login/login.aspx");
        driver.findElement(By.xpath("//input[@name='textBox_loginPage_alreadyCustomer_loginMail']")).sendKeys("closer.time@yandex.ru");
        driver.findElement(By.xpath("//input[@name='textBox_loginPage_alreadyCustomer_password']")).sendKeys("password"); // невалидный пароль
        driver.findElement(By.xpath("//button[@name='Login']")).click();
        String s = driver.findElement(By.xpath("//font[@class='errortext']")).getText();
        assert (s.equals("Неверный пароль: он должен состоять из 8 - 16 знаков без пробелов и содержать хотя бы 1 букву и 1 цифру."));

        
        System.out.println

        
        driver.quit();

    }
}
