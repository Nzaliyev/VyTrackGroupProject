package com.cydeo.library.pages;

import com.cydeo.library.util.ConfigurationReader;
import com.cydeo.library.util.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='prependedInput']")
    public WebElement username_input;

    @FindBy(xpath = "//input[@id='prependedInput2']")
    public WebElement password_input;

    @FindBy(xpath = "//button[@id='_submit']")
    public WebElement logInBtn;

    public void logInTruckDriver(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        username_input.sendKeys(ConfigurationReader.getProperty("driver_username"));
        password_input.sendKeys(ConfigurationReader.getProperty("driver_password"));
        logInBtn.click();
    }

}
