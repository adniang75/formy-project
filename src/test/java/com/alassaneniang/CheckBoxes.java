package com.alassaneniang;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CheckBoxes {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get(FormyProject.BASE_URL + "/checkbox");

        WebElement checkBox1 = driver.findElement(By.id("checkbox-1"));
        WebElement checkBox2 = driver.findElement(By.id("checkbox-2"));
        WebElement checkBox3 = driver.findElement(By.id("checkbox-3"));

        checkBox1.click();
        driver
                .manage()
                .timeouts()
                .implicitlyWait(Duration.ofSeconds(2));

        checkBox2.click();
        driver
                .manage()
                .timeouts()
                .implicitlyWait(Duration.ofSeconds(2));

        checkBox3.click();
        driver
                .manage()
                .timeouts()
                .implicitlyWait(Duration.ofSeconds(2));

        driver.quit();
    }

}
