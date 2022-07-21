package pages.vienasA;

public class LoginWithValidData {

    public static void open() {
        pages.vienasA.Common.openUrl("https://www.1a.lt/");
    }

    public static void clickPrisijungtiFuction() {
        pages.vienasA.Common.clickElement(Locators.vienasA.functionPrisijungti);
    }

    public static void acceptCookies() {
        pages.vienasA.Common.waitForElementToBeVisible(Locators.vienasA.formCookies);
        pages.vienasA.Common.waitForElementToBeVisible(Locators.vienasA.buttonAcceptCookies);
        pages.vienasA.Common.clickElement(Locators.vienasA.buttonAcceptCookies);
    }

    public static void enterEmailAdress(String email) {
        pages.vienasA.Common.sendKeysToElement(Locators.vienasA.fieldEmail, email);
    }

    public static void enterPassword(String password) {
        pages.vienasA.Common.sendKeysToElement(Locators.vienasA.fieldPassword, password);
    }

    public static void clickPrisijungtiButton() {
        pages.vienasA.Common.clickElement(Locators.vienasA.buttonPrisijungti);
    }

    public static void clickOnMyProfile() {
        pages.vienasA.Common.clickElement(Locators.vienasA.buttonMyProfile);
    }

    public static String readMessage() {
        return pages.vienasA.Common.getElementText(Locators.vienasA.messageMyProfile);
    }
}
