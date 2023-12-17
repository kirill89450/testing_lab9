package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MainClass {

    @Test
    public void Test(){

        WebDriver driver = new ChromeDriver();

        driver.get("https://mail.ru/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        AuthObject authObject = new AuthObject(driver);


        authObject.wait_Exit("//*[@class='resplash-btn resplash-btn_primary resplash-btn_mailbox-big ihfknge-de8k2m']");
        authObject.switch_frame("//*[@class='ag-popup__frame__layout__iframe']");
        authObject.copy_login("//*[@name='username']");
        authObject.wait_past_password("//*[@class='base-0-2-79 primary-0-2-93']");
        authObject.past_password("//*[@name='password']");
        authObject.logIn("//*[@class='base-0-2-79 primary-0-2-93']");
        ProfileObject profileObject = new ProfileObject(driver);
        profileObject.wait_logo("//*[@class='ph-avatar-img svelte-dfhuqc']");
        profileObject.check_name("//*[@class='ph-name svelte-1popff4']");
        profileObject.wait_unLogin("//*[@class='ph-item ph-item__social svelte-1popff4' and @tabindex='0']");
        profileObject.check_createMail("//*[@class='resplash-btn resplash-btn_outlined-themed resplash-btn_mailbox-big ihfknge-de8k2m']");
    }
}