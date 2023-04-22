package com.osdatahub.pageObjects;

import org.example.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BaseClass {
    public MainPage(){
        PageFactory.initElements(getDriver(), this); }

    @FindBy(id = "ccc-notify-accept")
    public WebElement acceptCookies;

    @FindBy(xpath = "//span[contains(text(),'API Dashboard')]")
    public WebElement APIDashboard;

    @FindBy(xpath = "//span[contains(text(),'Download')]")
    public WebElement Download;


    @FindBy(xpath = "//span[contains(text(),'Docs')]")
    public WebElement Docs;

    @FindBy(xpath = "//span[contains(text(),'Support')]")
    public WebElement Support;

    @FindBy(xpath = "//span[contains(text(),'Pricing')]")
    public WebElement Pricing;








}