package pages.vienasA;

public class SearchField {

    public static void open() {
        pages.vienasA.Common.openUrl("https://www.1a.lt/");
    }

    public static void acceptCookies() {
        pages.vienasA.Common.waitForElementToBeVisible(Locators.vienasA.formCookies);
        pages.vienasA.Common.waitForElementToBeVisible(Locators.vienasA.buttonAcceptCookies);
        pages.vienasA.Common.clickElement(Locators.vienasA.buttonAcceptCookies);
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
