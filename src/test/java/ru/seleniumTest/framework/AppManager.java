package ru.seleniumTest.framework;

public class AppManager {

    private WebDriverHandler webDriverHandler;
    private CartHandler cartHandler;
    private NavigationHandler navigationHandler;

    public void stop(){
        if(webDriverHandler != null){
            webDriverHandler.stop();
        }
    }

    protected WebDriverHandler getWebDriverHandler() {
        if (webDriverHandler == null){
            webDriverHandler = new WebDriverHandler(this);
        }
        return webDriverHandler;
    }

    public CartHandler getCartHandler() {
        if(cartHandler == null){
            cartHandler = new CartHandler(this);
        }
        return cartHandler;
    }

    public NavigationHandler getNavigationHandler() {
        if(navigationHandler == null){
            navigationHandler = new NavigationHandler(this);
        }

        return navigationHandler;
    }
}
