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
    }

    @Test
    public void getRegistrationForm(){
        driver.get(baseUrl);

        // TODO: 07.02.2019
        //It doesn't work. Browser is closing earlier every time.
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);


        driver.findElement(By.id("t1")).clear();
        driver.findElement(By.id("t1")).sendKeys("test@test.test");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.className("btn-primary")).click();
    }



    @AfterClass
    public void shutDown(){
        driver.close();
    }
}
