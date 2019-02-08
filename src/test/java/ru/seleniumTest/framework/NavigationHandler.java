package ru.seleniumTest.framework;

import org.openqa.selenium.WebDriver;

public class NavigationHandler {

    AppManager manager;
    WebDriver driver;

    public NavigationHandler(AppManager manager){
        this.manager =  manager;
        driver = manager.getDriver();
    }

    public void openMainPage() {
        driver.get("http://localhost:8080/registration-form.html");
    }
}
