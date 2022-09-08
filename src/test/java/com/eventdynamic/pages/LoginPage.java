package com.eventdynamic.pages;

import com.eventdynamic.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.='App Login']")
    public WebElement appLoginButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div[1]/button/div")
    public WebElement log_inButton;

    @FindBy(css = "input[id='username']")
    public WebElement emailAdress;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[.='Continue']")
    public WebElement continueButton;


    @FindBy(xpath = "//*[@id='error-element-password']")
    public WebElement warningMessage;




    }





