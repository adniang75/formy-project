package com.alassaneniang;

import com.alassaneniang.pages.ConfirmationPage;
import com.alassaneniang.pages.FormPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompleteForm {

    public static void main(String[] args) throws MalformedURLException {

        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new RemoteWebDriver(new URL(FormyProject.REMOTE_HUB_URL), options);
        driver.get(FormyProject.BASE_URL + "/form");

        FormPage formPage = new FormPage();
        ConfirmationPage confirmationPage = new ConfirmationPage();

        formPage.submitForm(driver);
        confirmationPage.waitForAlertBanner(driver);

        assertEquals(
                "The form was successfully submitted!",
                confirmationPage.getAlertBannerText(driver));

        driver.quit();
    }

}
