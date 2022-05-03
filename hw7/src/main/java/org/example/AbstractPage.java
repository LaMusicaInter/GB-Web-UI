package ru.iq_soft;
/**
 * Класс AbstractPage
 *      абстрактная страница сайта
 * @author : Хильченко А.Н
 * @project : HW_6
 * @date : 28.02.2022
 */

import java.util.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {
    private WebDriver driver;

    public AbstractPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    protected WebDriver getDriver(){
        return this.driver;
    }
}
