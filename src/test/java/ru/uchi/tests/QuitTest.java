package ru.uchi.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.uchi.pages.LoginPage;
import ru.uchi.pages.QuitPage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class QuitTest {
    private static WebDriver driver;
    private static LoginPage loginPage;
    private static QuitPage quitPage;

    @BeforeClass
    public static void setUp() {

        System.setProperty("webdriver.chrome.driver", "C:/Users/group/IdeaProjects/TestProject/chromedriver.exe");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        quitPage = new QuitPage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://uchi.ru/");
    }

    @Test
    public void loginTest() throws IOException {
        FileInputStream fis = new FileInputStream("C:/Users/group/IdeaProjects/TestProject/login.properties");

        Properties property = new Properties();
        try {
            property.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        loginPage.typeUsername(property.getProperty("username"));
        loginPage.typePassword(property.getProperty("password"));
        loginPage.submitLogin();
    }


    @Test
    public void quitTest() {
        quitPage.quitPage();
    }

    @AfterClass
    public static void tearDown(){
        driver.close();
    }
}
