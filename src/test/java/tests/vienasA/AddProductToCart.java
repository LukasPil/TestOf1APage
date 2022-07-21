package tests.vienasA;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddProductToCart extends BaseTests {

    @BeforeMethod
    public void initialise() {
        pages.vienasA.AddProductToCart.open();
    }

    @Test

    public void testAddProductToCart() {
        String productName = "Kelioninis krepšys Ferrino Traveller PS 72133FCC, juoda";

        pages.vienasA.AddProductToCart.acceptCookies();
        pages.vienasA.AddProductToCart.inputProductNameInSearchField(productName);
        pages.vienasA.AddProductToCart.clickButtonSearch();
        pages.vienasA.AddProductToCart.clickOnProduct();
        pages.vienasA.AddProductToCart.clickButtonAddToCart();
        pages.vienasA.AddProductToCart.clickButtonXToClosePopUp();
        pages.vienasA.AddProductToCart.clickButtonCart();
        String actualMessage = pages.vienasA.AddProductToCart.readProductNameInTheCart();

        Assert.assertEquals(actualMessage, productName);

    }
}
