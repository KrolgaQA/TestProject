package ru.seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Registration {

    private static WebDriver driver;
    private String baseUrl = "http://localhost:8080/registration-form.html";

    @BeforeClass
    public static void setUp() {

        System.setProperty("webdriver.chrome.driver", "F:\\Project\\TestProject\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

    }

    @Test
    public void getRegistrationFormWithValidValues(){
        RegistrationFieldsObject validRegistrationFieldsObject = new RegistrationFieldsObject("test@test.test", "123456");
        fillRegistrationFields(validRegistrationFieldsObject);
    }

    @Test
    public void getRegistrationFormWithEmptyValues(){
        RegistrationFieldsObject emptyRegistrationFieldsObject = new RegistrationFieldsObject("", "");
        fillRegistrationFields(emptyRegistrationFieldsObject);
    }

    private void fillRegistrationFields(RegistrationFieldsObject registrationFieldsObject) {
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


    @AfterClass
    public void shutDown(){
        driver.close();
    }
}
