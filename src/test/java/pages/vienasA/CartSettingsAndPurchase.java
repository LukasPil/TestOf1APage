package pages.vienasA;

public class CartSettingsAndPurchase {

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

    public static void clickButtonToAddToMoreSameItems() {
        pages.vienasA.Common.doubleClickByAction(Locators.vienasA.buttonPlusInCart);
    }

    public static void clickButtonTesti() {
        pages.vienasA.Common.clickElement(Locators.vienasA.buttonTestiInCart);
    }

    public static void clickButtonTestiInRegistrationField() {
        pages.vienasA.Common.clickElement(Locators.vienasA.buttonTestiInRegistration);
    }

    public static String readMessage() {
        return pages.vienasA.Common.getElementText(Locators.vienasA.fieldNegativeMessageInRegistration);
    }
}
