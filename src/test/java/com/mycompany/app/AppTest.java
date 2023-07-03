package com.mycompany.app;

import static org.junit.Assert.assertEquals;

import com.codeborne.selenide.Configuration;
import com.mycompany.app.pages.HomePage;
import com.mycompany.app.pages.TravelInsurancePage;
import org.junit.Test;

public class AppTest {
    @Test
    public void testTravelInsuranceForm() {
        // Set a larger screen size
        Configuration.browserSize = "1920x1080";

        // Create instances of page objects
        HomePage homePage = new HomePage();
        TravelInsurancePage travelInsurancePage = new TravelInsurancePage();

        // Open the home page
        homePage.openHomePage();

        // Perform actions on the home page
        homePage.acceptCookies();
        homePage.clickTravelLink();

        // First part of test scenario
        travelInsurancePage.selectTravelDestinationDropdown();
        travelInsurancePage.clickSelectCountriesElement();
        travelInsurancePage.AddCountry();
        travelInsurancePage.selectIndia();
        travelInsurancePage.clickApplyButton();
        String actualTravelDestination = travelInsurancePage.getTravelDestination();
        assertEquals("Visa pasaule", actualTravelDestination);

        // Second part of test scenario
        travelInsurancePage.clickCalculatePrice();
        travelInsurancePage.clickAdditionalInfoButton();
        String actualPopupFormTitleText = travelInsurancePage.getPopupFormTitleText();
        assertEquals("Kas ir apdrošināts", actualPopupFormTitleText);

        // Third part of test scenario
        travelInsurancePage.clickPopupCloseButton();
        travelInsurancePage.clickContinueButton();
        // Check if attributes are empty
        travelInsurancePage.checkTravelerFirstNameAttributeIsEmpty();
        travelInsurancePage.checkTravelerLastNameAttributeIsEmpty();
        travelInsurancePage.checkTravelerIdentityNumberAttributeIsEmpty();
    }
}