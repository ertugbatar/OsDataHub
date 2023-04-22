package com.osdatahub.implementation;

import org.example.BaseClass;
import com.osdatahub.pageObjects.DocsPage;
import com.osdatahub.pageObjects.MainPage;
import com.osdatahub.pojo.DownloadsApi;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

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
                finalElement = mainPage.Docs;
                break;
        }
        return finalElement;
    }
/*
The clickByName method takes a String parameter and clicks on a WebElement object based on the specified parameter.
 This method determines the element to be clicked using the returnElement method and
 clicks on it by calling the click() method.
 */

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
                pageList.add(docsPage.featuresApi);
                pageList.add(docsPage.ngdTilesApi);
                pageList.add(docsPage.downloadsApi);
                pageList.add(docsPage.linkedIdentifiersApi);
                pageList.add(docsPage.mapsApi);
                pageList.add(docsPage.matchApi);
                pageList.add(docsPage.namesApi);
                pageList.add(docsPage.placesApi);
                pageList.add(docsPage.vectorApi);
                pageList.add(docsPage.oauthApi);

                break;
        }

        for (WebElement element:pageList) {
            element.click();
            Assert.assertTrue(docsPage.overview.isDisplayed());
            Assert.assertTrue(docsPage.gettingStarted.isDisplayed());
            Assert.assertTrue(docsPage.techSpecification.isDisplayed());
        }
    }
    public Response callAPI(String endpoint){
        Response response = given().accept(ContentType.JSON)
                .when().get(endpoint);
        return response;
    }

    public DownloadsApi callAPIAndConvertPojo(Response response){
        response = given().accept(ContentType.JSON)
                .when().get("https://api.os.uk/downloads/v1");

        DownloadsApi downloadsApi =response.body().as(DownloadsApi.class);
        return downloadsApi;
    }

    public void verifyResponse(Response response ,String verify, String expectedResult){
        switch (verify.toLowerCase()){
            case "response_status_code":
                Assert.assertEquals(expectedResult, String.valueOf(response.getStatusCode()));
                break;
            case "title":
                Assert.assertEquals(expectedResult,callAPIAndConvertPojo(response).getTitle());
                break;
            case "description":
                Assert.assertEquals(expectedResult,callAPIAndConvertPojo(response).getDescription());
                break;
        }
    }
}
