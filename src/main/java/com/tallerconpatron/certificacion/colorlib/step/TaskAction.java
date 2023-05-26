package com.tallerconpatron.certificacion.colorlib.step;

import com.tallerconpatron.certificacion.colorlib.common.BasePage;
import com.tallerconpatron.certificacion.colorlib.pageobject.PaginaLogin;
import com.tallerconpatron.certificacion.colorlib.pageobject.paginaFormValidation;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import com.tallerconpatron.certificacion.colorlib.pageobject.paginaMain;
public class TaskAction extends BasePage {

    private PaginaLogin paginaLogin;
    private paginaMain paginaMain;
    private paginaFormValidation paginaFormValidation;

    @Step
    public void openPage(){
        openApp();
    }

    @Step
    public void signIn(String strUser, String strPassword){
        sendKeysUser(strUser);
        sendKeysPassword(strPassword);
        paginaLogin.btnSingIn.waitUntilClickable().click();
    }

    public void sendKeysUser(String strUser){
        paginaLogin.user.click();
        paginaLogin.user.clear();
        paginaLogin.user.sendKeys(strUser);
    }

    public void sendKeysPassword(String strPassword){
        paginaLogin.password.click();
        paginaLogin.password.clear();
        paginaLogin.password.sendKeys(strPassword);
    }

    public void validateTitle(String title){
        assert(paginaMain.pageTitle.getText().equals(title));
    }

    public void pressFormButton(){
        paginaMain.formsButton.waitUntilClickable().click();
    }

    public void pressFormValidationButton(){
        paginaMain.formsValidationButton.waitUntilClickable().click();
    }

    public void checkValidationPageTitle(String title){
        assert(paginaFormValidation.checkPageTitle.getText().equals(title));
    }

    public void sendKeysRequiredInput(String input){
        paginaFormValidation.inputRequired.click();
        paginaFormValidation.inputRequired.clear();
        paginaFormValidation.inputRequired.sendKeys(input);
    }

    public void pressSelectBtn(){
        paginaFormValidation.selectSportsButton.waitUntilClickable().click();
    }

    public void choseSportBtn(){
        paginaFormValidation.chosenSport.waitUntilClickable().click();
    }

    public void multipleChoiceButton(){
        paginaFormValidation.multipleSelectButton.waitUntilClickable().click();
    }

    public void sendKeysUrlInput(String inputUrl){
        paginaFormValidation.urlInput.click();
        paginaFormValidation.urlInput.clear();
        paginaFormValidation.urlInput.sendKeys(inputUrl);
    }

    public void sendKeysEmailInput(String inputEmail){
        paginaFormValidation.emailInput.click();
        paginaFormValidation.emailInput.clear();
        paginaFormValidation.emailInput.sendKeys(inputEmail);
    }

    public void sendKeysPasswordInput(String inputPassword){
        paginaFormValidation.passwordInputVFP.click();
        paginaFormValidation.passwordInputVFP.clear();
        paginaFormValidation.passwordInputVFP.sendKeys(inputPassword);
    }

    public void sendKeysConfirmPWInput(String inputConfirmPW){
        paginaFormValidation.confirmPasswordInputVFP.click();
        paginaFormValidation.confirmPasswordInputVFP.clear();
        paginaFormValidation.confirmPasswordInputVFP.sendKeys(inputConfirmPW);
    }

    public void sendKeysMinInput(String inputMin){
        paginaFormValidation.minInput.click();
        paginaFormValidation.minInput.clear();
        paginaFormValidation.minInput.sendKeys(inputMin);
    }

    public void sendKeysMaxInput(String inputMax){
        paginaFormValidation.maxInput.click();
        paginaFormValidation.maxInput.clear();
        paginaFormValidation.maxInput.sendKeys(inputMax);
    }

    public void sendKeysNumberInput(String inputNum){
        paginaFormValidation.numberInput.click();
        paginaFormValidation.numberInput.clear();
        paginaFormValidation.numberInput.sendKeys(inputNum);
    }

    public void sendKeysIPInput(String inputIP){
        paginaFormValidation.ipIntput.click();
        paginaFormValidation.ipIntput.clear();
        paginaFormValidation.ipIntput.sendKeys(inputIP);
    }

    public void sendKeysDateInput(String inputDate){
        paginaFormValidation.dateInput.click();
        paginaFormValidation.dateInput.clear();
        paginaFormValidation.dateInput.sendKeys(inputDate);
    }

    public void sendKeysDateEarlierInput(String inputDtEarlier){
        paginaFormValidation.dateEarlierInput.click();
        paginaFormValidation.dateEarlierInput.clear();
        paginaFormValidation.dateEarlierInput.sendKeys(inputDtEarlier);
    }

    public void pressValidateBtn(){
        paginaFormValidation.validateButton.waitUntilClickable().click();
    }

    public void emptyFieldValidation(){
        assert(paginaFormValidation.inputRequired.getText().equals(""));

    }

}
