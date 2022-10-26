package com.juaracoding.appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class Calculator {
    public AndroidDriver<MobileElement> driver;

    public Calculator(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
    }

    By btnSatu = By.id("com.google.android.calculator:id/digit_1");
    By btnDua = By.id("com.google.android.calculator:id/digit_2");
    By btnTiga = By.id("com.google.android.calculator:id/digit_3");
    By btnEmpat = By.id("com.google.android.calculator:id/digit_4");

    By btnTambah = By.id("com.google.android.calculator:id/op_add");
    By btnKali = By.id("com.google.android.calculator:id/op_mul");
    By btnSamaDengan = By.id("com.google.android.calculator:id/eq");
    By hasil = By.id("com.google.android.calculator:id/result_final");

    public void penjumlahan(){
        driver.findElement(btnSatu).click();
        driver.findElement(btnTambah).click();
        driver.findElement(btnDua).click();
        driver.findElement(btnSamaDengan).click();
    }

    public void perkalian(){
        driver.findElement(btnTiga).click();
        driver.findElement(btnKali).click();
        driver.findElement(btnEmpat).click();
        driver.findElement(btnSamaDengan).click();
    }

    public String getTxtPenjumlahan(){
        return driver.findElement(hasil).getText();
    }

    public String getTxtPerkalian(){
        return driver.findElement(hasil).getText();
    }
}