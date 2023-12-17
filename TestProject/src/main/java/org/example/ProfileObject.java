package org.example;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class ProfileObject {

    protected WebDriver driver;

    public ProfileObject(WebDriver driver){
        this.driver = driver;
    }

    private void clickOnElement(String string){
        driver.findElement(
                By.xpath(string)).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void wait_logo(String string){
        clickOnElement(string);
    }

    public void check_name(String string){
        String text = driver.findElement(By.xpath(string)).getText();
        Assert.assertEquals(text, "Кирилл Шевелев");
    }

    public void wait_unLogin(String string){
        clickOnElement(string);
    }

    public void check_createMail(String string){
        driver.findElement(By.xpath(string)).isDisplayed();
    }

}