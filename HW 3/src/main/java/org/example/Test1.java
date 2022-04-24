/**
 * Класс Test1
 * @comments: Тест позитивный сценарий входа на сайт
 */

package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Test1 {
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
        driver.findElement(By.xpath("//input[@name='USER_LOGIN']")).sendKeys("closer.time@YANDEX.RU");
        driver.findElement(By.xpath("//input[@name='USER_PASSWORD']")).sendKeys("DoctorWho925");
        driver.findElement(By.xpath("//button[@name='Login']")).click();
        String s = driver.findElement(By.xpath("//a[@class='nav-link text-truncate pt-0']")).getText();
        assert (s.equals("ЕЛИЗАВТЕА"));

        
        System.out.println
            
        
        driver.quit();
    }
}
