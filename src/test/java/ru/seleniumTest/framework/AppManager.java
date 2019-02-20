package ru.seleniumTest.framework;

public class AppManager {

    private static AppManager appManager;
    private WebDriverHandler webDriverHandler;
    private CartHandler cartHandler;
    private NavigationHandler navigationHandler;

    public static synchronized AppManager getInstance(){
        if(appManager == null){
            appManager = new AppManager();
        }
        return appManager;
    }

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
