package com.saucedemo.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    @BeforeEach
    void setUp() {
        Configuration.browserSize = "1920x1080";
        open("https://www.saucedemo.com/");
    }

    @AfterEach
    void tearDown() {
        closeWebDriver();
    }
}
