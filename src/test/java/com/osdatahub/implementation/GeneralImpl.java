package com.osdatahub.implementation;


import com.osdatahub.pageObjects.BaseClass;
import com.osdatahub.pageObjects.DocsPage;
import com.osdatahub.pageObjects.MainPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class GeneralImpl extends BaseClass {
    MainPage mainPage = new MainPage();

    DocsPage docsPage = new DocsPage();
    public void clickByName(String name){
        returnElement(name).click();
    }

    public WebElement returnElement(String element){
        WebElement finalElement = null;
        switch (element.toLowerCase()){
            case "acceptcookies":
                finalElement = mainPage.acceptCookies;
                break;
            case "apidashboard":
                finalElement = mainPage.APIDashboard;
                break;
            case "docs":
                finalElement = mainPage.Download;
                break;
        }
        return finalElement;
    }

    public void verifyPage(String page){
        List<WebElement> pageList = new ArrayList<>();
        switch (page.toLowerCase()) {
            case "main_page":
                pageList.add(mainPage.APIDashboard);
                pageList.add(mainPage.Docs);
                pageList.add(mainPage.Download);
                pageList.add(mainPage.Pricing);
                pageList.add(mainPage.Support);
                break;
        }
        for (WebElement element:pageList) {
            Assert.assertTrue(element.isDisplayed());
        }
    }

    public void verifyMenu(String page){
        List<WebElement> pageList = new ArrayList<>();
        switch (page.toLowerCase()) {
            case "docs_page_side_menu":
                //  pageList.add();
                //  add 11 elements
                pageList.add(mainPage.featuresApi);
                pageList.add(mainPage.ngdTilesApi);
                pageList.add(mainPage.downloadsApi);
                pageList.add(mainPage.linkedIdentifiersApi);
                pageList.add(mainPage.mapsApi);
                pageList.add(mainPage.matchApi);
                pageList.add(mainPage.namesApi);
                pageList.add(mainPage.placesApi);
                pageList.add(mainPage.vectorApi);
                pageList.add(mainPage.oauthApi);

                break;
        }

        for (WebElement element:pageList) {
            Assert.assertTrue(element.isDisplayed());
            Assert.assertTrue(element.isDisplayed());
            Assert.assertTrue(element.isDisplayed());
    }
        }
    }
