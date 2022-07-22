package pages.vienasA;

import pages.Common;
import pages.Locators;

public class SearchField {

    public static void open() {
        Common.openUrl("https://www.1a.lt/");
    }

    public static void acceptCookies() {
        Common.waitForElementToBeVisible(Locators.SearchField.formCookies);
        Common.waitForElementToBeVisible(Locators.SearchField.buttonAcceptCookies);
        Common.clickElement(Locators.SearchField.buttonAcceptCookies);
    }

    public static void inputProductNameInSearchField(String productName) {
        Common.sendKeysToElement(Locators.SearchField.fieldSearch, productName);
    }

    public static void clickButtonSearch() {
        Common.clickElementByAction(Locators.SearchField.buttonSearch);
    }

    public static void clickOnProduct() {
        Common.waitForElementToBeVisible(Locators.SearchField.productImage);
        Common.clickElement(Locators.SearchField.buttonProduct);
    }

    public static String readNameOfProduct() {
        return Common.getElementText(Locators.SearchField.nameOfProduct);
    }
}
