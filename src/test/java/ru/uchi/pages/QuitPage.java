package ru.uchi.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuitPage {

    private final WebDriver driver;

    @FindBy(xpath = "/html/body/section[1]/div/div/div/div[3]/div[2]/div")
    private WebElement profileMenuField;

    @FindBy(xpath = "/html/body/section[1]/div/div/div/div[3]/div[3]")
    private WebElement selectField;

    @FindBy(xpath = "/html/body/section[1]/div/div/div/div[3]/div[3]/div[4]/a")
    private WebElement quitField;

    public QuitPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;

    }

    public void quitPage() {
        if (profileMenuField.isDisplayed()) {
            profileMenuField.click();

            if (selectField.isDisplayed()) {
                quitField.click();
            }
        }    }

}
