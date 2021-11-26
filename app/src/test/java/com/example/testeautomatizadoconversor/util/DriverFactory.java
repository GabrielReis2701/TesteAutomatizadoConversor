package com.example.testeautomatizadoconversor.util;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DriverFactory {
    private static AndroidDriver<MobileElement> driver;

    public static  AndroidDriver<MobileElement> getDriver(){
        if(driver == null){
            criarDriver();
        }

        return driver;
    }

    private static void criarDriver() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "98f10111");
        desiredCapabilities.setCapability("automationName", "uiautomator2");
        desiredCapabilities.setCapability("appPackage", "com.example.conversordemoedas");
        desiredCapabilities.setCapability("appActivity", "com.example.conversordemoedas.MainActivity");

        URL remoteUrl = null;
        try {
            remoteUrl = new URL("http://localhost:4723/wd/hub");
            driver = new AndroidDriver(remoteUrl, desiredCapabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
    public static void finalizarDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }

}
