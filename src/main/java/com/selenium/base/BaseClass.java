package com.selenium.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseClass {
    public static WebDriver driver;
    public void setup(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://insinkerator.emerson.com/en-in");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }
}
