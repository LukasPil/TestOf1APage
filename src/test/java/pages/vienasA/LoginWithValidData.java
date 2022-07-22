package pages.vienasA;

import pages.Common;
import pages.Locators;

public class LoginWithValidData {

    public static void open() {
        Common.openUrl("https://www.1a.lt/");
    }

    public static void clickPrisijungtiFuction() {
        Common.clickElement(Locators.LoginWithValidData.functionPrisijungti);
    }

    public static void acceptCookies() {
        Common.waitForElementToBeVisible(Locators.LoginWithValidData.formCookies);
        Common.waitForElementToBeVisible(Locators.LoginWithValidData.buttonAcceptCookies);
        Common.clickElement(Locators.LoginWithValidData.buttonAcceptCookies);
    }

    public static void enterEmailAdress(String email) {
        Common.sendKeysToElement(Locators.LoginWithValidData.fieldEmail, email);
    }

    public static void enterPassword(String password) {
        Common.sendKeysToElement(Locators.LoginWithValidData.fieldPassword, password);
    }

    public static void clickPrisijungtiButton() {
        Common.clickElement(Locators.LoginWithValidData.buttonPrisijungti);
    }

    public static void clickOnMyProfile() {
        Common.clickElement(Locators.LoginWithValidData.buttonMyProfile);
    }

    public static String readMessage() {
        return Common.getElementText(Locators.LoginWithValidData.messageMyProfile);
    }
}
