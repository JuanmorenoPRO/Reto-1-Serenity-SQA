package com.guru99.gurubank.pruebas.steps;

import com.guru99.gurubank.pruebas.models.DataInjection;
import com.guru99.gurubank.pruebas.pageobjects.Guru99BankPageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import static com.guru99.gurubank.pruebas.utils.SpecialMethods.*;

public class Guru99BankSteps {

    Guru99BankPageObject guru99BankPageObject = new Guru99BankPageObject();
    DataInjection dataInjection = new DataInjection();


    @Step
    public void openBrowser(){
        guru99BankPageObject.open();
    }

    @Step
    public void loginUser(){
         write(guru99BankPageObject.getDriver() , guru99BankPageObject.userIDInput , dataInjection.getUserID());
         write(guru99BankPageObject.getDriver(), guru99BankPageObject.passwordUserInput , dataInjection.getPasswordUser());
         clickJS(guru99BankPageObject.getDriver(), guru99BankPageObject.loginBtn);
    }

    @Step
    public void newCustomer(){
        clickJS(guru99BankPageObject.getDriver(), guru99BankPageObject.selectNewCustomer);
    }

    @Step
    public void createNewCustomer(){
        write(guru99BankPageObject.getDriver(), guru99BankPageObject.customerNameInput, dataInjection.getCustomerName());
        write(guru99BankPageObject.getDriver(), guru99BankPageObject.dateOfBirthInput , dataInjection.getDateOfBirth());
        write(guru99BankPageObject.getDriver(), guru99BankPageObject.addressInput, dataInjection.getAddress());
        write(guru99BankPageObject.getDriver(), guru99BankPageObject.cityInput , dataInjection.getCity());
        write(guru99BankPageObject.getDriver(), guru99BankPageObject.stateInput , dataInjection.getState());
        write(guru99BankPageObject.getDriver(), guru99BankPageObject.pinInput , dataInjection.getPin());
        write(guru99BankPageObject.getDriver(), guru99BankPageObject.mobileNumberInput , dataInjection.getMobileNumber());
        write(guru99BankPageObject.getDriver(), guru99BankPageObject.emailInput , dataInjection.getEmail());
        write(guru99BankPageObject.getDriver(), guru99BankPageObject.passwordInput , dataInjection.getPassword());
        clickJS(guru99BankPageObject.getDriver(),guru99BankPageObject.submitbtn);
    }

    @Step
    public void successfullyCreation()  {
        validateText(guru99BankPageObject.getDriver(), guru99BankPageObject.customerRegisteredValidation , dataInjection.getRegisteredSuccessfullyText());
    }

    @Step
    public void createNewAccount() {
        String saveCustomerID = guru99BankPageObject.getDriver().findElement(guru99BankPageObject.customerID).getText();
        clickJS(guru99BankPageObject.getDriver(), guru99BankPageObject.selectNewAccount);
        write(guru99BankPageObject.getDriver(), guru99BankPageObject.customerIdInput, saveCustomerID);
        write(guru99BankPageObject.getDriver(), guru99BankPageObject.initialDepositInput, dataInjection.getInitialDeposit());
        clickJS(guru99BankPageObject.getDriver(), guru99BankPageObject.submitBtnAccount);

    }

    @Step
    public void validateNewAccount(){
        validateText(guru99BankPageObject.getDriver(), guru99BankPageObject.accountGeneratedValidation,dataInjection.getAccountGeneratedSuccessfullyText());
    }







}
