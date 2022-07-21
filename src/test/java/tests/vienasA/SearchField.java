package tests.vienasA;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchField extends BaseTests {

    @BeforeMethod
    public void initialise() {
        pages.vienasA.SearchField.open();
    }

    @Test
    public void testSearchForBag() {
        String productName = "Kelioninis krepšys Ferrino Traveller PS 72133FCC, juoda";

        pages.vienasA.SearchField.acceptCookies();
        pages.vienasA.SearchField.inputProductNameInSearchField(productName);
        pages.vienasA.SearchField.clickButtonSearch();
        pages.vienasA.SearchField.clickOnProduct();
        String actualMessage = pages.vienasA.SearchField.readNameOfProduct();

        Assert.assertEquals(actualMessage, productName);

    }
}
