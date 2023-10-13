package com.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class SearchingAndSelectingProduct {
    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"section1\"]/div/div/div[1]/div/div[3]/div/div[1]/div/a/div/img")
    WebElement product;
    @FindBy(xpath = "//*[@id=\"doc-0-english-listbox\"]/ul/li/a/div/span[2]")
    WebElement docLink;
    public SearchingAndSelectingProduct(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void searchingProduct() throws AWTException, InterruptedException {
        Robot robot=new Robot();
        robot.mouseMove(220,200);
        Thread.sleep(2000);
        robot.mouseMove(390,240);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        product.click();
        robot.mouseWheel(5);
        docLink.click();
        Thread.sleep(3000);
        robot.mouseMove(1168,150);
        Thread.sleep(2000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
}
