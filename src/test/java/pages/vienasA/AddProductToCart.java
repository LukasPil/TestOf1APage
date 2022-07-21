package pages.vienasA;

public class AddProductToCart {

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

    public static void clickButtonAddToCart() {
        pages.vienasA.Common.clickElement(Locators.vienasA.buttonAddToCart);
    }

    public static void clickButtonXToClosePopUp() {
        pages.vienasA.Common.waitForElementToBeVisible(Locators.vienasA.popUpWindow);
        pages.vienasA.Common.clickElement(Locators.vienasA.buttonXInPopUpWindow);
    }

    public static void clickButtonCart() {
        pages.vienasA.Common.clickElement(Locators.vienasA.buttoonCart);
    }

    public static String readProductNameInTheCart() {
        return pages.vienasA.Common.getElementText(Locators.vienasA.productNameInTheCart);
    }
}
