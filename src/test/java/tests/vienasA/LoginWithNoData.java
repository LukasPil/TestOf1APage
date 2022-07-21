package tests.vienasA;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginWithNoData extends BaseTests {

    @BeforeMethod
    public void initialise() {
        pages.vienasA.LoginWithNoData.open();
    }

    @Test
    public void testLoginWithNoData() {
        String expectedMessage = "Neteisingas el. pašto adresas arba slaptažodis";

        pages.vienasA.LoginWithNoData.acceptCookies();
        pages.vienasA.LoginWithNoData.clickPrisijungtiFuction();
        pages.vienasA.LoginWithNoData.clickPrisijungtiButton();
        String actualMessage = pages.vienasA.LoginWithNoData.readMessage();

        Assert.assertEquals(actualMessage, expectedMessage);

    }
}
