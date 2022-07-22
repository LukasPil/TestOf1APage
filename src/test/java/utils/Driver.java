package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Driver {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void setDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--force-device-scale-factor=0.8");

        driver.set(new ChromeDriver(options));
        driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static void closeDriver() {
        driver.get().quit();
        driver.remove();
    }

}
