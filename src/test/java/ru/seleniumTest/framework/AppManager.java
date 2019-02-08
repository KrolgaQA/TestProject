package ru.seleniumTest.framework;

import org.openqa.selenium.WebDriver;

public class AppManager {

    private WebDriverHandler webDriverHandler;
    private RegistrationHandler registrationHandler;
    private NavigationHandler navigationHandler;
    private WebDriver driver;

    public AppManager(){
        webDriverHandler = new WebDriverHandler();
        driver = webDriverHandler.getDriver();
    }

    public void stop(){
        webDriverHandler.stop();
    }


    public WebDriver getDriver() {
        return driver;
    }

    public RegistrationHandler getRegistrationHandler() {
        return registrationHandler;
    }

    public NavigationHandler getNavigationHandler() {
        return navigationHandler;
    }
}
