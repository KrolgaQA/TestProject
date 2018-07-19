package ru.uchi.tests;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.uchi.Pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    public static LoginPage loginPage;
    public static WebDriver driver;

    @BeforeClass
    public static void setUp() {

        System.setProperty("webdriver.chrome.driver", "C:/Users/group/IdeaProjects/TestProject/chromedriver.exe");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://uchi.ru/");
    }

    @Test
    public static void loginTest(){
        loginPage.typeUsername("pech@pech.pech");
        loginPage.typePassword("123456");
        loginPage.submitLogin();
    }


    @AfterClass
    public static void driverQuit(){

        driver.close();
    }
}
