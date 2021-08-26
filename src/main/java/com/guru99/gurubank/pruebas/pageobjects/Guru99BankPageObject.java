package com.guru99.gurubank.pruebas.pageobjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("http://demo.guru99.com/V4/index.php")

public class Guru99BankPageObject extends PageObject {

    public By userIDInput = By.xpath("//input[@name='uid']");
    public By passwordUserInput = By.xpath("//input[@name='password']");
    public By loginBtn = By.xpath("//input[@name='btnLogin']");
    public By customerNameInput = By.xpath("//input[@name='name']");
    public By dateOfBirthInput = By.id("dob");
    public By addressInput = By.xpath("//textarea[@name='addr']");
    public By cityInput = By.xpath("//input[@name='city']");
    public By stateInput = By.xpath("//input[@name='state']");
    public By pinInput = By.xpath("//input[@name='pinno']");
    public By mobileNumberInput = By.xpath("//input[@name='telephoneno']");
    public By emailInput = By.xpath("//input[@name='emailid']");
    public By passwordInput = By.xpath("//input[@name='password']");
    public By submitbtn = By.xpath("//input[@type='submit']");
    public By selectNewCustomer = By.xpath("//a[@href='addcustomerpage.php']");
    public By customerRegisteredValidation = By.xpath("//p[@class='heading3']");
    public By customerID = By.xpath("//table[@id='customer']/tbody/tr[4]/td[2]");
    public By customerIdInput = By.xpath("//input[@name='cusid']");
    public By initialDepositInput = By.xpath("//input[@name='inideposit']");
    public By selectNewAccount = By.xpath("//a[@href='addAccount.php']");
    public By accountGeneratedValidation = By.xpath("//p[@class='heading3']");
    public By customerIdValidation= By.xpath("//table[@id='account']/tbody/tr[4]/td[2]");
    public By submitBtnAccount = By.xpath("//input[@name='button2']");

}


