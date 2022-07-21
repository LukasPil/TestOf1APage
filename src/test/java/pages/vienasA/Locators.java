package pages.vienasA;

import org.openqa.selenium.By;

public class Locators {
    public static class vienasA {

        public static By formCookies = By.xpath("//div[@id='cookiebanner']");
        public static By buttonAcceptCookies = By.xpath("//a[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']");
        public static By functionPrisijungti = By.xpath("//*[@class='user-block__title--strong']");
        public static By buttonPrisijungti = By.xpath("//input[@value='Prisijungti']");
        public static By fieldNegativeMessage = By.xpath("//*[@id=\"new_user\"]/div[2]/p");
        public static By fieldEmail = By.xpath("//input[@id='user_email']");
        public static By fieldPassword = By.xpath("//input[@id='user_password']");
        public static By buttonMyProfile = By.xpath("//div[@class='user-block__title']");
        public static By messageMyProfile = By.xpath("//h2[@class='profile-content__title']");
        public static By fieldSearch = By.xpath("//input[@id='q']");
        public static By buttonSearch = By.xpath("//div[@class='main-search__submit']");
        public static By productImage = By.xpath("//div[@class='sn-product-inner ks-gtm-categories']");
        public static By buttonProduct = By.xpath("//div[@class='sn-product-inner ks-gtm-categories']");
        public static By nameOfProduct = By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div[2]/h1");
        public static By buttonAddToCart = By.xpath("//button[@id='add_to_cart_btn']");
        public static By popUpWindow = By.xpath("//div[@id='cart-popup-container']");
        public static By buttonXInPopUpWindow = By.xpath("//button[@type='button']");
        public static By buttoonCart = By.xpath("//*[@id=\"cart-box\"]/div");
        public static By productNameInTheCart = By.xpath("//a[@class='detailed-cart-item__name-link']");
        public static By buttonPlusInCart = By.xpath("//a[@class='detailed-cart-item__inc-quantity']");
        public static By buttonTestiInCart = By.xpath("//input[@value='Tęsti']");
        public static By buttonTestiInRegistration = By.xpath("//input[@value='Tęsti']");
        public static By fieldNegativeMessageInRegistration = By.xpath("//p[@class='users-session-form__error-message']");

    }
}
