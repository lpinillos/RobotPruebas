package com.tallerconpatron.certificacion.colorlib.pageobject;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;
@DefaultUrl("https://colorlib.com/polygon/metis/form-validation.html")
public class paginaFormValidation extends PageObject {

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div[1]/div/div/header/h5")
    public WebElementFacade checkPageTitle;

    @FindBy(xpath = "//*[@id=\"req\"]")
    public WebElementFacade inputRequired;

    @FindBy(xpath = "//*[@id=\"sport\"]")
    public WebElementFacade selectSportsButton;

    @FindBy(xpath = "//*[@id=\"sport\"]/option[3]")
    public WebElementFacade chosenSport;

    @FindBy(xpath = "//*[@id=\"sport2\"]/option[4]")
    public WebElementFacade multipleSelectButton;

    @FindBy(xpath = "//*[@id=\"url1\"]")
    public WebElementFacade urlInput;

    @FindBy(xpath = "//*[@id=\"email1\"]")
    public WebElementFacade emailInput;

    @FindBy(xpath = "//*[@id=\"pass1\"]")
    public WebElementFacade passwordInputVFP;

    @FindBy(xpath = "//*[@id=\"pass2\"]")
    public WebElementFacade confirmPasswordInputVFP;

    @FindBy(xpath = "//*[@id=\"minsize1\"]")
    public WebElementFacade minInput;

    @FindBy(xpath = "//*[@id=\"maxsize1\"]")
    public WebElementFacade maxInput;

    @FindBy(xpath = "//*[@id=\"number2\"]")
    public WebElementFacade numberInput;

    @FindBy(xpath = "//*[@id=\"ip\"]")
    public WebElementFacade ipIntput;

    @FindBy(xpath = "//*[@id=\"date3\"]")
    public WebElementFacade dateInput;

    @FindBy(xpath = "//*[@id=\"past\"]")
    public WebElementFacade dateEarlierInput;

    @FindBy(xpath = "//*[@id=\"popup-validation\"]/div[14]/input")
    public WebElementFacade validateButton;

}
