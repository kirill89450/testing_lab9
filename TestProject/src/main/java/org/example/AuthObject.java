package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class AuthObject {

    protected WebDriver driver;

    String password = "jahNAhfajkhjkdaASh",
            login = "pochta.muri";

    public AuthObject(WebDriver driver){
        this.driver = driver;
    }

    private void clickOnElement(String string){
        driver.findElement(
                By.xpath(string)).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    private void insertData(String string, String name){
        driver.findElement
                (By.xpath(name)).clear();

        driver.findElement
                (By.xpath(name)).sendKeys(string);
    }

    public void wait_Exit(String string){
        clickOnElement(string);
    }

    public void switch_frame(String string){
        WebElement frame = driver.findElement(
                By.xpath(string));

        driver.switchTo().frame(frame);
    }

    public void copy_login(String string){
        insertData(login, string);
    }

    public void wait_past_password(String string){
        clickOnElement(string);
    }

    public void past_password(String string){
        insertData(password, string);
    }

    public void logIn(String string){
        clickOnElement(string);
    }
}