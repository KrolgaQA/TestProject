package ru.seleniumTest.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import ru.seleniumTest.framework.AppManager;

public class BaseDriverClass {
    protected static AppManager manager;


    @BeforeTest
    public static void setUp() {
        manager = new AppManager();
    }

    @AfterTest
    public void shutDown(){
        manager.stop();
    }
}
