package ru.seleniumTest.test;

import org.testng.annotations.Test;

public class Search extends BaseDriverClass {

    @Test
    public void getRegistrationFormWithValidValues(){
        SearchFieldObject validSearchSelection = new SearchFieldObject("book");
        manager.getCartHandler().fillSearchFields(validSearchSelection);
    }

    @Test
    public void getRegistrationFormWithEmptyValues(){
        SearchFieldObject wrongSearchSelection = new SearchFieldObject("cook");
        manager.getCartHandler().fillSearchFields(wrongSearchSelection);
    }


}
