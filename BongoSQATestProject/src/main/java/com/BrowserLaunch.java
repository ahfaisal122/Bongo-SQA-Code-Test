package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BrowserLaunch extends TestBase{
    public static void main(String[] args) throws InterruptedException {
        firefoxLaunch();
        System.out.println("Browser opened");
        driver.manage().window().maximize();
        openURL("https://youtube.com");
        System.out.println("Youtube opened");
        inBrowser();
        Thread.sleep(7000);
        tryCatch();
        Thread.sleep(9000);
        closeBrowser();
        System.out.println("Browser closed");


    }

    public static void type(String elementXpath, String Value){
        driver.findElement(By.xpath(elementXpath)).sendKeys(Value);
    }

    public static void click(String elementXpath){
        driver.findElement(By.xpath(elementXpath)).click();
    }

    public static void inBrowser() throws InterruptedException {
        WebElement videoClick = driver.findElement(By.xpath("//*[@id=\"video-title\"]"));
        videoClick.click();

    }


    public static void tryCatch() throws InterruptedException {

        try {
            driver.findElement(By.cssSelector(".ytp-ad-skip-button")).isDisplayed();
            WebElement skipAd = driver.findElement(By.cssSelector(".ytp-ad-skip-button"));
            skipAd.click();
            System.out.println("test 1 - skipped Ad");
            Thread.sleep(9000);
            System.out.println("video is paused");
            WebElement pauseButton = driver.findElement(By.xpath("/html/body/ytd-app/div/ytd-page-manager/ytd-watch-flexy/div[5]/div[1]/div/div[1]/div/div/div/ytd-player/div/div/div[1]/video"));
            pauseButton.click();
            System.out.println("video is paused for 6 seconds");
            Thread.sleep(6000); // video will be paused for 6 seconds
            pauseButton.click();  // video will be again played
            System.out.println("video is again played");

        } catch (Exception e){
            System.out.println("test 2 - no need to skip ad");
            Thread.sleep(9000);
            System.out.println("video is paused");
            WebElement pauseButton = driver.findElement(By.xpath("/html/body/ytd-app/div/ytd-page-manager/ytd-watch-flexy/div[5]/div[1]/div/div[1]/div/div/div/ytd-player/div/div/div[1]/video"));
            pauseButton.click();
            System.out.println("video is paused for 6 seconds");
            Thread.sleep(6000); // video will be paused for 6 seconds
            pauseButton.click();  // video will be again played
            System.out.println("video is again played");

        }
    }


    /*public static void skipAdFunction() throws InterruptedException {
        //WebElement skipAd= driver.findElement(By.cssSelector(".ytp-ad-skip-button"));
        Boolean flag;
        if (driver.findElement(By.cssSelector(".ytp-ad-skip-button")).isDisplayed()){
            flag = true;
            WebElement skipAd= driver.findElement(By.cssSelector(".ytp-ad-skip-button"));
            skipAd.click();
            System.out.println("test 1");
        }
        else {
            flag = false;
            System.out.println("test 2");

            }

        Thread.sleep(6000);
        //closeBrowser();
        System.out.println("test 3");

    }*/


}
