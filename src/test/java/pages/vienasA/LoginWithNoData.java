package pages.vienasA;

import pages.Common;
import pages.Locators;

public class LoginWithNoData {

    public static void open() {
        Common.openUrl("https://www.1a.lt/");
    }

    public static void clickPrisijungtiFuction() {
        Common.clickElement(Locators.LoginWithNoData.functionPrisijungti);
    }

    public static void acceptCookies() {
        Common.waitForElementToBeVisible(Locators.LoginWithNoData.formCookies);
        Common.waitForElementToBeVisible(Locators.LoginWithNoData.buttonAcceptCookies);
        Common.clickElement(Locators.LoginWithNoData.buttonAcceptCookies);
    }

    public static void clickPrisijungtiButton() {
        Common.clickElement(Locators.LoginWithNoData.buttonPrisijungti);
    }

    public static String readMessage() {
        return Common.getElementText(Locators.LoginWithNoData.fieldNegativeMessage);
    }
}
