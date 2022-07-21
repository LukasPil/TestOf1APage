package pages.vienasA;

public class SearchField {

    public static void open() {
        pages.vienasA.Common.openUrl("https://www.1a.lt/");
    }

    public static void acceptCookies() {
        Common.waitForElementToBeVisible(Locators.vienasA.productPageCookies);
        Common.clickElement(Locators.vienasA.productPageButtonAcceptCookies);
    }

    public static void inputProductNameInSearchField(String productName) {
        pages.vienasA.Common.sendKeysToElement(Locators.vienasA.fieldSearch, productName);
    }

    public static void clickButtonSearch() {
        pages.vienasA.Common.clickElementByAction(Locators.vienasA.buttonSearch);
    }

    public static void clickOnProduct() {
        Common.waitForElementToBeVisible(Locators.vienasA.productImage);
        pages.vienasA.Common.clickElement(Locators.vienasA.buttonProduct);
    }

    public static String readNameOfProduct() {
        return pages.vienasA.Common.getElementText(Locators.vienasA.nameOfProduct);
    }
}
