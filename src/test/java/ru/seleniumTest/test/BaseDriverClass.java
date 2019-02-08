package ru.seleniumTest.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import ru.seleniumTest.framework.AppManager;

public class BaseDriverClass {
    protected static AppManager appManager;


    @BeforeTest
    public static void setUp() {
        appManager = new AppManager();
    }

    @AfterTest
    public void shutDown(){
        appManager.stop();
    }
}
