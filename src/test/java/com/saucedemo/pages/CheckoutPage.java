package com.saucedemo.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CheckoutPage {
    private final SelenideElement firstNameInput = $("#first-name");
    private final SelenideElement lastNameInput = $("#last-name");
    private final SelenideElement postalCodeInput = $("#postal-code");
    private final SelenideElement continueButton = $("#continue");
    private final SelenideElement finishButton = $("#finish");

    public void fillCheckoutForm(String firstName, String lastName, String postalCode) {
        firstNameInput.setValue(firstName);
        lastNameInput.setValue(lastName);
        postalCodeInput.setValue(postalCode);
        continueButton.click();
    }

    public void finishCheckout() {
        finishButton.click();
    }
}
