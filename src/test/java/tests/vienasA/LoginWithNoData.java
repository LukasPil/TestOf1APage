package tests.vienasA;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class LoginWithNoData extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
    }

    @Test
    public void testLoginWithNoData() {
        String expectedMessage = "Neteisingas el. pašto adresas arba slaptažodis";

        pages.vienasA.LoginWithNoData.open();
        pages.vienasA.LoginWithNoData.acceptCookies();
        pages.vienasA.LoginWithNoData.clickPrisijungtiFuction();
        pages.vienasA.LoginWithNoData.clickPrisijungtiButton();
        String actualMessage = pages.vienasA.LoginWithNoData.readMessage();

        Assert.assertEquals(actualMessage, expectedMessage);

    }
}
