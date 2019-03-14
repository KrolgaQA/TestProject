package ru.seleniumTest.test;

import org.testng.annotations.Test;

public class ConfirmBillingData extends BaseDriverClass{

    @Test(timeOut = 100000)
    public void confirmItem() throws InterruptedException {
        BillingFormObject validDataBillingFormObject = new BillingFormObject(
                "Name",
                "Surname",
                "City",
                "State",
                "1111111111111111111",
                "Street",
                "123456");
        manager.getCartHandler().fillBillingFormFields(validDataBillingFormObject);
        Thread.sleep(2000);
    }
}
