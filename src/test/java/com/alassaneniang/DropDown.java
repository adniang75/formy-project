package com.alassaneniang;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get(FormyProject.BASE_URL + "/dropdown");

        WebElement dropDown = driver.findElement(By.id("dropdownMenuButton"));
        dropDown.click();
        Thread.sleep(2000);

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.click();
        Thread.sleep(2000);

        driver.quit();
    }

}
