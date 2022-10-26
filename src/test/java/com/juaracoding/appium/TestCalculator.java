package com.juaracoding.appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestCalculator {
    private static AndroidDriver<MobileElement> driver;
    private Calculator calculator;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Galaxy A30");
        capabilities.setCapability("udid", "RR8M5031RSA");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "9.0");
        capabilities.setCapability("appPackage", "com.google.android.calculator");
        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");

        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @BeforeMethod
    public void pageObject(){
        calculator = new Calculator(driver);
    }

    @Test
    public void testPenjumlahan(){
        calculator.penjumlahan();
        System.out.println("Hasil = "+ calculator.getTxtPenjumlahan());
        Assert.assertEquals(calculator.getTxtPenjumlahan(),"3");

    }

    @Test
    public void testPerkalian(){
        calculator.perkalian();
        System.out.println("Hasil = "+ calculator.getTxtPerkalian());
        Assert.assertEquals(calculator.getTxtPerkalian(),"12");
    }

    @AfterClass
    public void closeApp(){
        driver.quit();
    }

}
