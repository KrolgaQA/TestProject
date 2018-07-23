package ru.uchi.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {


    private final WebDriver driver;

    @FindBy(id = "login")
    private WebElement loginField;

    @FindBy(id = "password")
    private WebElement passwordFied;

    @FindBy(xpath = "//*[@id=\"intro\"]/form/input[2]")
    private WebElement buttonField;



    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;

    }

    public void typeUsername(String username) {
        loginField.sendKeys(username);
    }

    public void typePassword(String password) {
        passwordFied.sendKeys(password);
    }

    public void submitLogin() {
        buttonField.click();
    }



}

