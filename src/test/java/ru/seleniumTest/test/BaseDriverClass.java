package ru.seleniumTest.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import ru.seleniumTest.framework.AppManager;

public class BaseDriverClass {
    protected static AppManager manager;


    @BeforeTest
    public void setUp() {
        manager = AppManager.getInstance();
    }

    @AfterTest
    public void shutDown(){
        manager.stop();
    }
}
