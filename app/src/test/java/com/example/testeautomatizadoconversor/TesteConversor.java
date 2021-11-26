package com.example.testeautomatizadoconversor;

import com.example.testeautomatizadoconversor.util.DSL;
import com.example.testeautomatizadoconversor.util.DriverFactory;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TesteConversor {

        private AndroidDriver driver;
        private final DSL dsl = new DSL();

        @Before
        public void setUp() {
            driver = DriverFactory.getDriver();

        }

        @Test
        public void sampleTest() {
            dsl.escrever(By.id("com.example.conversordemoedas:id/et_ValorReais"), "60");
            dsl.clicar(By.id("com.example.conversordemoedas:id/bt_Converter"));
            Assert.assertEquals("$10.714285714285715",dsl.obterTexto(By.id("com.example.conversordemoedas:id/tv_Resultado")));
        }

        @After
        public void tearDown() {
            DriverFactory.finalizarDriver();
        }


}
