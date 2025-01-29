package com.saucedemo.tests;

import com.saucedemo.pages.*;
import org.junit.jupiter.api.Test;

public class PurchaseTest extends BaseTest {

    @Test
    void testPurchaseFlow() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("standard_user", "secret_sauce");

        ProductsPage productsPage = new ProductsPage();
        productsPage.addFirstProductToCart();
        productsPage.openCart();

        CartPage cartPage = new CartPage();
        cartPage.proceedToCheckout();

        CheckoutPage checkoutPage = new CheckoutPage();
        checkoutPage.fillCheckoutForm("John", "Doe", "12345");
        checkoutPage.finishCheckout();

        CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage();
        checkoutCompletePage.verifyOrderSuccess();
    }
}
