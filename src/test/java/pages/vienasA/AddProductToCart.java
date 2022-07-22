package pages.vienasA;

import pages.Common;
import pages.Locators;

public class AddProductToCart {

    public static void open() {
        Common.openUrl("https://www.1a.lt/");
    }

    public static void acceptCookies() {
        Common.waitForElementToBeVisible(Locators.AddProductToCart.formCookies);
        Common.waitForElementToBeVisible(Locators.AddProductToCart.buttonAcceptCookies);
        Common.clickElement(Locators.AddProductToCart.buttonAcceptCookies);
    }

    public static void inputProductNameInSearchField(String productName) {
        Common.sendKeysToElement(Locators.AddProductToCart.fieldSearch, productName);
    }

    public static void clickButtonSearch() {
        Common.clickElementByAction(Locators.AddProductToCart.buttonSearch);
    }

    public static void clickOnProduct() {
        Common.waitForElementToBeVisible(Locators.AddProductToCart.productImage);
        Common.clickElement(Locators.AddProductToCart.buttonProduct);
    }

    public static void clickButtonAddToCart() {
        Common.clickElement(Locators.AddProductToCart.buttonAddToCart);
    }

    public static void clickButtonXToClosePopUp() {
        Common.waitForElementToBeVisible(Locators.AddProductToCart.popUpWindow);
        Common.clickElement(Locators.AddProductToCart.buttonXInPopUpWindow);
    }

    public static void clickButtonCart() {
        Common.clickElement(Locators.AddProductToCart.buttoonCart);
    }

    public static String readProductNameInTheCart() {
        return Common.getElementText(Locators.AddProductToCart.productNameInTheCart);
    }
}
