package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
    public static WebDriver driver; //WebDriver=Interface , driver=reference

    public static void firefoxLaunch(){

        //set driver path: dynamic
        System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//src//main//resources//geckodriver.exe");

        driver=new FirefoxDriver();  // Constructor of FirefoxDriver class

    }

    public static void openURL(String Url){
        driver.get(Url);
    }

    public static void closeBrowser() {
        driver.close();
    }


}


