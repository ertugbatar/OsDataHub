package com.osdatahub.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BaseClass {
    public MainPage(){
        PageFactory.initElements(getDriver(), this); }

    @FindBy(id = "ccc-notify-accept")
    public WebElement acceptCookies;

    public WebElement APIDashboard;

    public WebElement Download;

    public WebElement Docs;

    public WebElement Support;

    public WebElement Pricing;

    public WebElement ngdTilesApi;
    public WebElement downloadsApi;

    public WebElement featuresApi;
    public WebElement linkedIdentifiersApi;
    public WebElement mapsApi;


    public WebElement matchApi;
    public WebElement namesApi;
    public WebElement placesApi;
    public WebElement vectorApi;
    public WebElement oauthApi;







}