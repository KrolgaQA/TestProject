package ru.seleniumTest.framework;

import org.openqa.selenium.By;
import ru.seleniumTest.test.RegistrationFieldsObject;

public class AppManager {

    private WebDriverHandler webDriverHandler;

    public AppManager(){
        webDriverHandler = new WebDriverHandler();
    }

    public void stop(){
        webDriverHandler.stop();
    }
    
    
    public void fillRegistrationFields(RegistrationFieldsObject registrationFieldsObject) {
        openMainPage();
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

    private void openMainPage() {
        driver.get(baseUrl);
    }
}
