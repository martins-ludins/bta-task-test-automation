package com.mycompany.app.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class HomePage {
    // Define locators for elements on the home page
    private static final String HOME_PAGE_URL = "https://www.bta.lv/";
    private final SelenideElement acceptCookiesButton = $(".focus-button");
    private final SelenideElement travelLink = $(".list > a[href*=\"celojuma\"]");

    public void openHomePage() {
        open(HOME_PAGE_URL);
    }

    public void acceptCookies() {
        acceptCookiesButton.click();
    }

    public void clickTravelLink() {
        travelLink.click();
    }
}
