package com.alassaneniang;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get(FormyProject.BASE_URL + "/scroll");

        Actions actions = new Actions(driver);

        WebElement name = driver.findElement(By.id("name"));
        actions.moveToElement(name);
        name.sendKeys("Alassane Niang");

        WebElement date = driver.findElement(By.id("date"));
        name.sendKeys("09/11/2022");

        driver.quit();
    }

}
