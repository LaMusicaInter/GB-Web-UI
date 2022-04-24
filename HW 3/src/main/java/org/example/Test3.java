package org.example; 


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Test3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        options.addArguments("disable-popup-blocking");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        
        driver.get("https://www.laredoute.ru/login/login.aspx");

        
        driver.get("https://www.laredoute.ru/");
        String s = driver.findElement(By.xpath("//div[@class='footer-phone-info")).getText();
        assert (s.equals("8 (800) 350-32-12"));     // проверка значения по тесткейсу

        //результат теста
        System.out.println("Тест №3 пройден");      // выведется только если тест не упадет и условия удовлетворят
        // assert

        // выход из браузера
        driver.quit();
    }
}
