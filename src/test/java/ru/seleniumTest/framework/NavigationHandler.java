package ru.seleniumTest.framework;

public class NavigationHandler extends BaseHandlerWithWebDriver{

    public NavigationHandler(AppManager manager) {
        super(manager);
    }

    public void openMainPage() {
        // TODO: 08.02.2019 Add a check of current page
        openURL("http://localhost:8080/bookstore/cart");
    }
}
