package ru.seleniumTest.test;

import org.testng.annotations.Test;

public class AddSearchingBookToTheCart extends BaseDriverClass{
    @Test
    public void buyBook(){
        // TODO: 08.02.2019 Finish it when will know how to chaining tests and test's results 
        manager.getCartHandler().openBookPage();
        manager.getCartHandler().addBookToTheCart();
    }
}

