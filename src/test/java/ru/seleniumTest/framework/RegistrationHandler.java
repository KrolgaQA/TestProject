package ru.seleniumTest.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.seleniumTest.test.RegistrationFieldsObject;

public class RegistrationHandler {

    private final AppManager manager;
    private WebDriver driver;

    public RegistrationHandler(AppManager manager){
        this.manager =  manager;
        driver = manager.getDriver();
    }

    public void fillRegistrationFields(RegistrationFieldsObject registrationFieldsObject) {
        manager.getNavigationHandler().openMainPage();
        fillRegistrationForm(registrationFieldsObject);
        submitRegistration();
    }

    private void submitRegistration() {
        driver.findElement(By.className("btn-primary")).click();
    }

    private void fillRegistrationForm(RegistrationFieldsObject registrationFieldsObject) {
        type("email", registrationFieldsObject.getLogin());
        type("password", registrationFieldsObject.getPassword());
    }

    private void type(String locator, String fieldName) {
        driver.findElement(By.name(locator)).clear();
        driver.findElement(By.name(locator)).sendKeys(fieldName);
    }
}
