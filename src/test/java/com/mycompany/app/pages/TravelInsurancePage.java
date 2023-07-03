package com.mycompany.app.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class TravelInsurancePage {
    // Define locators for elements on the travel insurance page
    private final SelenideElement travelDestinationDropdown = $("#regionalSelectorRegion-open");
    private final SelenideElement selectCountriesElement = $("#regionalSelectorCountry-showListSearch");
    private final SelenideElement addCountryElement = $("#regionalSelectorCountry-addCountry");
    private final SelenideElement listElementIndia = $("[data-id=\"IND:IN:91:Indija:WORLDWIDE:Visa pasaule\"]");
    private final SelenideElement applyButton = $("#regionalSelectorCountry-applyButton");
    private final SelenideElement calculatePriceButton = $("[data-type=\"travelSubmit\"]");
    private final SelenideElement additionalInfoButton = $("[data-param='{\"id\":\"OPP\"}'].button-covered-popup");
    private final SelenideElement popupFormTitle = $("div > h2");
    private final SelenideElement popupCloseButton = $(".popup-close");
    private final SelenideElement continueButton = $("[datatype=\"selectPolicyPlanOPP\"]");
    private final SelenideElement firstNameInputField = $("#travelerFirstName0");
    private final SelenideElement lastNameInputField = $("#travelerLastName0");
    private final SelenideElement identityNumberInputField = $("#travelerIdentityNumber0");



    // Define methods for actions on the travel insurance page
    public void selectTravelDestinationDropdown() {
        travelDestinationDropdown.click();
    }

    public void clickSelectCountriesElement() {
        selectCountriesElement.click();
    }

    public void AddCountry() {
        addCountryElement.click();
    }

    public void selectIndia() {
        listElementIndia.click();
    }

    public void clickApplyButton() {
        applyButton.click();
    }

    public String getTravelDestination() {
        return travelDestinationDropdown.getText();
    }

    public void clickCalculatePrice() {
        calculatePriceButton.click();
    }

    public void clickAdditionalInfoButton() {
        additionalInfoButton.click();
    }

    public String getPopupFormTitleText() {
        return popupFormTitle.getText();
    }

    public void clickPopupCloseButton() {
        popupCloseButton.click();
    }

    public void clickContinueButton() {
        continueButton.click();
    }

    public void checkAttributeIsEmpty(SelenideElement element) {
        element.shouldHave(attribute("data-store-value", ""));
    }

    public void checkTravelerFirstNameAttributeIsEmpty() {
        checkAttributeIsEmpty(firstNameInputField);
    }

    public void checkTravelerLastNameAttributeIsEmpty() {
        checkAttributeIsEmpty(lastNameInputField);
    }

    public void checkTravelerIdentityNumberAttributeIsEmpty() {
        checkAttributeIsEmpty(identityNumberInputField);
    }

}



