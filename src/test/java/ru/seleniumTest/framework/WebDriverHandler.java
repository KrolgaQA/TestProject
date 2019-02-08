package ru.seleniumTest.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverHandler {
    private static WebDriver driver;

    public WebDriverHandler(){
        System.setProperty("webdriver.chrome.driver", "F:\\Project\\TestProject\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
    }

    public void stop(){
        driver.close();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
