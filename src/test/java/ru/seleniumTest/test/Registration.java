package ru.seleniumTest.test;

import org.testng.annotations.Test;

public class Registration extends BaseDriverClass {

    @Test
    public void getRegistrationFormWithValidValues(){
        RegistrationFieldsObject validRegistrationFieldsObject = new RegistrationFieldsObject("test@test.test", "123456");
        appManager.getRegistrationHandler().fillRegistrationFields(validRegistrationFieldsObject);
    }

    @Test
    public void getRegistrationFormWithEmptyValues(){
        RegistrationFieldsObject emptyRegistrationFieldsObject = new RegistrationFieldsObject("", "");
        appManager.getRegistrationHandler().fillRegistrationFields(emptyRegistrationFieldsObject);
    }


}
