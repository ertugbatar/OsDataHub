package com.osdatahub.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

// her class a base class i extend yapiyoruz ki base classtaki herseyi kullanabilelim
public class DocsPage extends BaseClass {

    public DocsPage() {
        PageFactory.initElements(getDriver(),this);


    }


    // 11 tane side menu elemenleri eklle id sini al

//    public static List<String> setSideMenu() {
//        List<WebElement> elements = getDriver().findElements(By.xpath("//li[contains(@id, 'Menu')]"));
//
//        List<String> sideMenuItems = new ArrayList<>();
//        for (WebElement eachElement : elements) {
//            sideMenuItems.add(eachElement.getText());
//        }
//        return sideMenuItems;
//    }


    public static List<String> setSideMenu(){
        List<WebElement> elements = getDriver().findElements(By.xpath("//li[contains(@id, 'Menu')]"));

        List<String> sideMenuItems = new ArrayList<>();
        for (WebElement eachElement : elements) {
            sideMenuItems.add(eachElement.getText());
        }

        return sideMenuItems;

    }


}