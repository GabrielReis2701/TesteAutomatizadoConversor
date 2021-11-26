package com.example.testeautomatizadoconversor.util;

import static com.example.testeautomatizadoconversor.util.DriverFactory.*;

import org.openqa.selenium.By;

public class DSL {
    public void escrever(By by, String texto){
        getDriver().findElement(by).sendKeys((texto));
    }

    public void clicar(By by){
        getDriver().findElement(by).click();
    }

    public String obterTexto(By by){
        return getDriver().findElement(by).getText();
    }
}
