package ru.seleniumTest;

import org.testng.annotations.Test;

public class Registration extends BaseDriverClass {

    @Test
    public void getRegistrationFormWithValidValues(){
        RegistrationFieldsObject validRegistrationFieldsObject = new RegistrationFieldsObject("test@test.test", "123456");
        fillRegistrationFields(validRegistrationFieldsObject);
    }

    @Test
    public void getRegistrationFormWithEmptyValues(){
        RegistrationFieldsObject emptyRegistrationFieldsObject = new RegistrationFieldsObject("", "");
        fillRegistrationFields(emptyRegistrationFieldsObject);
    }


}
