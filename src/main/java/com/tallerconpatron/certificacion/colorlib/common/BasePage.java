package com.tallerconpatron.certificacion.colorlib.common;

import com.tallerconpatron.certificacion.colorlib.pageobject.PaginaLogin;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://colorlib.com/polygon/metis/index.html?")
public class BasePage {
    public static WebDriver driver;

    private PaginaLogin paginaLogin;

    public void openApp(){
        paginaLogin.open();
    }

    public WebDriver getDriver(){
        return driver;
    }
}
