package com.alassaneniang;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FileUpload {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get(FormyProject.BASE_URL + "/fileupload");

        WebElement fileUploadField = driver.findElement(By.id("file-upload-field"));
        fileUploadField.sendKeys("file-to-upload.png");
        driver
                .manage()
                .timeouts()
                .implicitlyWait(Duration.ofSeconds(2));

        WebElement resetButton = driver.findElement(By.cssSelector("button[class='btn btn-warning btn-reset']"));
        resetButton.click();
        driver
                .manage()
                .timeouts()
                .implicitlyWait(Duration.ofSeconds(2));

        driver.quit();
    }

}
