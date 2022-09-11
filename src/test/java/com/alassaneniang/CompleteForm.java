package com.alassaneniang;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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

        driver.quit();
    }

}