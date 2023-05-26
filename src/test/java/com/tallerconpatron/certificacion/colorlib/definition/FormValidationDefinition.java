package com.tallerconpatron.certificacion.colorlib.definition;

import com.tallerconpatron.certificacion.colorlib.common.BasePage;
import com.tallerconpatron.certificacion.colorlib.step.TaskAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class FormValidationDefinition extends BasePage {

    private String user;
    private String password;

    @Steps
    TaskAction taskAction;

    @Given("I enter with my credentials")
    public void iEnterWithMyCredentials(io.cucumber.datatable.DataTable dataTable) {
        this.user = dataTable.cell(1,0);
        this.password = dataTable.cell(1,1);
    }

    @When("I proceed with the authentication")
    public void iProceedWithTheAuthentication() {
        try {
            taskAction.openPage();
            taskAction.signIn(user, password);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @And("go to the main view of the page")
    public void goToTheMainViewOfThePage() {
        taskAction.validateTitle("Bootstrap-Admin-Template");
    }

    @And("enter submenu form validation")
    public void enterSubmenuFormValidation() {
        taskAction.pressFormButton();
        taskAction.pressFormValidationButton();
    }

    @And("check the tittle of the form on the screen")
    public void checkTheTittleOfTheFormOnTheScreen() {
        taskAction.checkValidationPageTitle("Popup Validation");
    }

    @And("fill all the fields")
    public void fillAllTheFields(io.cucumber.datatable.DataTable dataTable) {

        String requiredText = dataTable.cell(1,0);
        String url = dataTable.cell(1,3);
        String email = dataTable.cell(1,4);
        String passwordVFP = dataTable.cell(1,5);
        String confirmPasswordVFP = dataTable.cell(1,6);
        String minField = dataTable.cell(1,7);
        String maxField = dataTable.cell(1,8);
        String num = dataTable.cell(1,9);
        String ip = dataTable.cell(1,10);
        String date = dataTable.cell(1,11);
        String dateEarlier = dataTable.cell(1,12);

        try {
            taskAction.sendKeysRequiredInput(requiredText);
            taskAction.pressSelectBtn();
            taskAction.choseSportBtn();
            taskAction.multipleChoiceButton();
            taskAction.sendKeysUrlInput(url);
            taskAction.sendKeysEmailInput(email);
            taskAction.sendKeysPasswordInput(passwordVFP.trim());
            taskAction.sendKeysConfirmPWInput(confirmPasswordVFP.trim());
            taskAction.sendKeysMinInput(minField);
            taskAction.sendKeysMaxInput(maxField);
            taskAction.sendKeysNumberInput(num);
            taskAction.sendKeysIPInput(ip);
            taskAction.sendKeysDateInput(date);
            taskAction.sendKeysDateEarlierInput(dateEarlier);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @And("click button validate")
    public void clickButtonValidate() {
        taskAction.pressValidateBtn();
    }

    @Then("fields required will be empty")
    public void fieldsRequiredWillBeEmpty() {
        taskAction.emptyFieldValidation();
    }

}
