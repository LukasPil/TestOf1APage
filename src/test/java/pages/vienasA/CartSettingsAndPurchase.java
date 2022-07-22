package pages.vienasA;

import pages.Common;
import pages.Locators;

public class CartSettingsAndPurchase {

    public static void open() {
        Common.openUrl("https://www.1a.lt/");
    }

    public static void acceptCookies() {
        Common.waitForElementToBeVisible(Locators.CartSettingAndPurchase.formCookies);
        Common.waitForElementToBeVisible(Locators.CartSettingAndPurchase.buttonAcceptCookies);
        Common.clickElement(Locators.CartSettingAndPurchase.buttonAcceptCookies);
    }

    public static void inputProductNameInSearchField(String productName) {
        Common.sendKeysToElement(Locators.CartSettingAndPurchase.fieldSearch, productName);
    }

    public static void clickButtonSearch() {
        Common.clickElementByAction(Locators.CartSettingAndPurchase.buttonSearch);
    }

    public static void clickOnProduct() {
        Common.waitForElementToBeVisible(Locators.CartSettingAndPurchase.productImage);
        Common.clickElement(Locators.CartSettingAndPurchase.buttonProduct);
    }

    public static void clickButtonAddToCart() {
        Common.clickElement(Locators.CartSettingAndPurchase.buttonAddToCart);
    }

    public static void clickButtonXToClosePopUp() {
        Common.waitForElementToBeVisible(Locators.CartSettingAndPurchase.popUpWindow);
        Common.clickElement(Locators.CartSettingAndPurchase.buttonXInPopUpWindow);
    }

    public static void clickButtonCart() {
        Common.clickElement(Locators.CartSettingAndPurchase.buttoonCart);
    }

    public static void clickButtonToAddToMoreSameItems() {
        Common.doubleClickByAction(Locators.CartSettingAndPurchase.buttonPlusInCart);
    }

    public static void clickButtonTesti() {
        Common.clickElement(Locators.CartSettingAndPurchase.buttonTestiInCart);
    }

    public static void clickButtonTestiInRegistrationField() {
        Common.clickElement(Locators.CartSettingAndPurchase.buttonTestiInRegistration);
    }

    public static String readMessage() {
        return Common.getElementText(Locators.CartSettingAndPurchase.fieldNegativeMessageInRegistration);
    }
}
