package ru.seleniumTest.framework;

import org.openqa.selenium.By;
import ru.seleniumTest.test.BillingFormObject;
import ru.seleniumTest.test.SearchFieldObject;

public class CartHandler extends BaseHandlerWithWebDriver{

    public CartHandler(AppManager manager) {
        super(manager);
    }

    public void fillSearchFields(SearchFieldObject searchFieldObject) {
        manager.getNavigationHandler().openMainPage();
        fillSerchForm(searchFieldObject);
        submitSearch();
    }

    public void fillBillingFormFields(BillingFormObject billingFormObject){
        manager.getNavigationHandler().openMainPage();
        fillBillingForm(billingFormObject);
        submitItem();
    }

    private void submitItem() {
        click(By.className("btn-primary"));
    }

    private void submitSearch() {
        click(By.className("btn-default"));
    }

    private void fillSerchForm(SearchFieldObject searchFieldObject) {
        type("navbar-search", searchFieldObject.getSearchTextField());
    }

    protected void type(String locator, String fieldName) {
        driver.findElement(By.id(locator)).clear();
        driver.findElement(By.id(locator)).sendKeys(fieldName);
    }

    public void fillBillingForm(BillingFormObject billingFormObject) {
        type("billing-first-name", billingFormObject.getFirstNameField());
        type("billing-last-name", billingFormObject.getLastNameField());
        type("billing-city", billingFormObject.getCityField());
        type("billing-state", billingFormObject.getStateField());
        type("card-number", billingFormObject.getCreditCardField());
        type("billing-address1", billingFormObject.getAddressField());
        type("billing-zip", billingFormObject.getZipField());
    }
}
