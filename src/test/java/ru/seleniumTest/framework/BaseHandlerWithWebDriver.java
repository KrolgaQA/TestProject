package ru.seleniumTest.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseHandlerWithWebDriver {
    protected final AppManager manager;
    protected WebDriver driver;

    public BaseHandlerWithWebDriver(AppManager manager){
        this.manager =  manager;
        driver = manager.getWebDriverHandler().getDriver();
    }

    protected void click(By className) {
        findElement(className).click();
    }

    protected void type(String locator, String fieldName) {
        findElement(By.name(locator)).clear();
        findElement(By.name(locator)).sendKeys(fieldName);
    }

    protected WebElement findElement(By name) {
        return driver.findElement(name);
    }

    protected void openURL(String baseURL) {
        driver.get(baseURL);
    }

    // TODO: 08.02.2019 Finish it when will know how to chaining tests and test's results
    public void openBookPage() {

    }

    // TODO: 08.02.2019 Finish it when will know how to chaining tests and test's results
    public void addBookToTheCart() {

    }
}
