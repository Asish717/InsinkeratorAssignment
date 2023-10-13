package com.selenium;

import com.selenium.base.BaseClass;
import com.selenium.pages.SearchingAndSelectingProduct;
import com.selenium.pages.SendingEmail;
import org.apache.commons.mail.EmailException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;

public class InsinkeratorTest extends BaseClass {
    SearchingAndSelectingProduct searchingAndSelectingProduct;
    SendingEmail sendingEmail;
    @BeforeTest
    public void start(){
        setup();
        searchingAndSelectingProduct=new SearchingAndSelectingProduct(driver);
        sendingEmail=new SendingEmail();
    }
    @Test(priority = 0)
    public void searchingTheProduct() throws AWTException, InterruptedException {
        searchingAndSelectingProduct.searchingProduct();
    }
    @Test(priority = 1)
    public void sendingEmail() throws EmailException {
        sendingEmail.emailFormat();
    }
    @AfterTest
    public void end(){
        driver.close();
    }
}
