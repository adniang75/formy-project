package com.alassaneniang;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardAndMouseInput {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get(FormyProject.BASE_URL + "/keypress");

        WebElement name = driver.findElement(By.id("name"));
        name.click();
        name.sendKeys("Alassane Niang");

        WebElement button = driver.findElement(By.id("button"));
        button.click();

        driver.quit();
    }

}
