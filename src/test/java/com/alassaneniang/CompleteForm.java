package com.alassaneniang;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompleteForm {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get(FormyProject.BASE_URL + "/form");

        driver
                .findElement(By.id("first-name"))
                .sendKeys("Alassane");

        driver
                .findElement(By.id("last-name"))
                .sendKeys("Niang");

        driver
                .findElement(By.id("job-title"))
                .sendKeys("QA Engineer");

        driver
                .findElement(By.id("radio-button-1"))
                .click();

        driver
                .findElement(By.id("checkbox-1"))
                .click();

        driver
                .findElement(By.cssSelector("option[value='4']"))
                .click();

        driver
                .findElement(By.id("datepicker"))
                .sendKeys("09/30/1975");
        driver
                .findElement(By.id("datepicker"))
                .sendKeys(Keys.RETURN);

        driver
                .findElement(By.cssSelector(".btn.btn-lg.btn-primary"))
                .click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement alert = wait.until(
                ExpectedConditions
                        .visibilityOfElementLocated(By.className("alert")));
        String alertText = alert.getText();
        assertEquals("The form was successfully submitted!", alertText);

        driver.quit();
    }

}
