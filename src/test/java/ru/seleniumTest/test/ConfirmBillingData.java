package ru.seleniumTest.test;

import org.testng.annotations.Test;

public class ConfirmBillingData extends BaseDriverClass{

    @Test
    public void confirmItem(){
        BillingFormObject validDataBillingFormObject = new BillingFormObject(
                "Name",
                "Surname",
                "City",
                "State",
                "1111111111111111111",
                "Street",
                "123456");
        manager.getCartHandler().fillBillingFormFields(validDataBillingFormObject);
    }
}
