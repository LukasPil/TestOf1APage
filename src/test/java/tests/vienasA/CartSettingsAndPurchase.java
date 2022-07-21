package tests.vienasA;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartSettingsAndPurchase extends BaseTests {

    @BeforeMethod
    public void initialise() {
        pages.vienasA.CartSettingsAndPurchase.open();

    }

    @Test

    public void testOfCartSettingsAndPurchasePossibilietesWithoutAccount() {
        String productName = "Kelioninis krepšys Ferrino Traveller PS 72133FCC, juoda";
        String expectedMessage = "Neteisingas el. pašto adresas.";

        pages.vienasA.CartSettingsAndPurchase.acceptCookies();
        pages.vienasA.CartSettingsAndPurchase.inputProductNameInSearchField(productName);
        pages.vienasA.CartSettingsAndPurchase.clickButtonSearch();
        pages.vienasA.CartSettingsAndPurchase.clickOnProduct();
        pages.vienasA.CartSettingsAndPurchase.clickButtonAddToCart();
        pages.vienasA.CartSettingsAndPurchase.clickButtonXToClosePopUp();
        pages.vienasA.CartSettingsAndPurchase.clickButtonCart();
        pages.vienasA.CartSettingsAndPurchase.clickButtonToAddToMoreSameItems();
        pages.vienasA.CartSettingsAndPurchase.clickButtonTesti();
        pages.vienasA.CartSettingsAndPurchase.clickButtonTestiInRegistrationField();
        String actualMessage = pages.vienasA.CartSettingsAndPurchase.readMessage();

        Assert.assertEquals(actualMessage, expectedMessage);

    }
}
