package com.alassaneniang;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DropDown {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get(FormyProject.BASE_URL + "/dropdown");

        WebElement dropDown = driver.findElement(By.id("dropdownMenuButton"));
        dropDown.click();
        driver
                .manage()
                .timeouts()
                .implicitlyWait(Duration.ofSeconds(2));

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.click();
        driver
                .manage()
                .timeouts()
                .implicitlyWait(Duration.ofSeconds(2));

        driver.quit();
    }

}
