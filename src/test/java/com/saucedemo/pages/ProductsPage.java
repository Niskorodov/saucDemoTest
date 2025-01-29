package com.saucedemo.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class ProductsPage {
    private final SelenideElement addToCartButton = $x("//button[contains(@id,'add-to-cart')]");
    private final SelenideElement cartIcon = $(".shopping_cart_link");

    public void addFirstProductToCart() {
        addToCartButton.click();
    }

    public void openCart() {
        cartIcon.click();
    }
}
