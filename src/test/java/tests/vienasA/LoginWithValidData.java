package tests.vienasA;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class LoginWithValidData extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
    }

    @Test
    public void testLoginWithValidData() {
        String email = "lukas.testavimas@gmail.com";
        String password = "Testavimas1";
        String expectedMessage = "Mano profilis";

        pages.vienasA.LoginWithValidData.open();
        pages.vienasA.LoginWithValidData.acceptCookies();
        pages.vienasA.LoginWithValidData.clickPrisijungtiFuction();
        pages.vienasA.LoginWithValidData.enterEmailAdress(email);
        pages.vienasA.LoginWithValidData.enterPassword(password);
        pages.vienasA.LoginWithValidData.clickPrisijungtiButton();
        pages.vienasA.LoginWithValidData.clickOnMyProfile();
        String actualMessage = pages.vienasA.LoginWithValidData.readMessage();

        Assert.assertTrue(actualMessage.contains(expectedMessage),
                String.format(
                        "Actual message: %s, Expected message: %s",
                        actualMessage,
                        expectedMessage
                ));
    }
}
