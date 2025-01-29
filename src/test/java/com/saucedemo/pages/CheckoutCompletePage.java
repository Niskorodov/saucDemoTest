package com.saucedemo.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.text;

public class CheckoutCompletePage {
    private final SelenideElement confirmationMessage = $(".complete-header");

    public void verifyOrderSuccess() {
        confirmationMessage.shouldHave(text("Thank you for your order!"));
    }
}
