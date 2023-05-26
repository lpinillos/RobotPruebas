package com.tallerconpatron.certificacion.colorlib.pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
public class PaginaLogin extends PageObject{
    @FindBy(xpath = "//*[@id=\"login\"]/form/input[1]")
    public WebElementFacade user;

    @FindBy(xpath = "//*[@id=\"login\"]/form/input[2]")
    public WebElementFacade password;

    @FindBy(xpath = "//*[@id=\"login\"]/form/button")
    public WebElementFacade btnSingIn;

}
