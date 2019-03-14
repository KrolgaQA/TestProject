package ru.seleniumTest.test;

import org.testng.annotations.Test;

public class Search extends BaseDriverClass {

    @Test(timeOut = 10000)
    public void getRegistrationFormWithValidValues() throws InterruptedException {
        SearchFieldObject validSearchSelection = new SearchFieldObject("book");
        Thread.sleep(2000);
        manager.getCartHandler().fillSearchFields(validSearchSelection);
        Thread.sleep(2000);
    }

    @Test (timeOut = 10000)
    public void getRegistrationFormWithEmptyValues() throws InterruptedException {
        SearchFieldObject wrongSearchSelection = new SearchFieldObject("cook");
        Thread.sleep(2000);
        manager.getCartHandler().fillSearchFields(wrongSearchSelection);
        Thread.sleep(2000);
    }


}
