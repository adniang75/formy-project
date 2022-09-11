package com.alassaneniang;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class RadioButtons {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get(FormyProject.BASE_URL + "/radiobutton");

        WebElement radioButton1 = driver.findElement(By.id("radio-button-1"));
        radioButton1.click();
        driver
                .manage()
                .timeouts()
                .implicitlyWait(Duration.ofSeconds(2));

        WebElement radioButton2 = driver.findElement(By.cssSelector("input[value='option2']"));
        radioButton2.click();
        driver
                .manage()
                .timeouts()
                .implicitlyWait(Duration.ofSeconds(2));

        WebElement radioButton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        radioButton3.click();
        driver
                .manage()
                .timeouts()
                .implicitlyWait(Duration.ofSeconds(2));

        driver.quit();
    }

}
