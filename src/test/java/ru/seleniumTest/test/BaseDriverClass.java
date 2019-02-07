package ru.seleniumTest.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import ru.seleniumTest.framework.AppManager;

import java.util.concurrent.TimeUnit;

public class BaseDriverClass {
    private static AppManager appManager;


    @BeforeTest
    public static void setUp() {
        appManager = new AppManager();
    }

    protected void fillRegistrationFields(RegistrationFieldsObject registrationFieldsObject) {
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

    @AfterTest
    public void shutDown(){
        appManager.stop();
    }
}
