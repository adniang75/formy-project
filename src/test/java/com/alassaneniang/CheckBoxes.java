package com.alassaneniang;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get(FormyProject.BASE_URL + "/checkbox");

        WebElement checkBox1 = driver.findElement(By.id("checkbox-1"));
        WebElement checkBox2 = driver.findElement(By.id("checkbox-2"));
        WebElement checkBox3 = driver.findElement(By.id("checkbox-3"));

        checkBox1.click();
        Thread.sleep(2000);
        checkBox2.click();
        Thread.sleep(2000);
        checkBox3.click();
        Thread.sleep(2000);

        driver.quit();
    }

}
