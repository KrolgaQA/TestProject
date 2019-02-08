package ru.seleniumTest.test;

public class BillingFormObject {
    private final String firstNameField;
    private final String lastNameField;
    private final String cityField;
    private final String stateField;
    private final String creditCardField;
    private final String streetField;
    private final String zipField;

    public BillingFormObject(String firstNameField, String lastNameField, String cityField, String stateField, String creditCardField, String streetField, String zipField) {
        this.firstNameField = firstNameField;
        this.lastNameField = lastNameField;
        this.cityField = cityField;
        this.stateField = stateField;
        this.creditCardField = creditCardField;
        this.streetField = streetField;
        this.zipField = zipField;
    }


    public String getFirstNameField() { return firstNameField; }

    public String getLastNameField() {
        return lastNameField;
    }

    public String getCityField() {
        return cityField;
    }

    public String getStateField() {
        return stateField;
    }

    public String getCreditCardField() {
        return creditCardField;
    }

    public String getAddressField() {
        return streetField;
    }

    public String getZipField() {
        return zipField;
    }
}
