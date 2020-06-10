package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public abstract class  BasePage {

    @FindBy(xpath = "//ul[@class=\"nav nav-tabs\"]/li")
    public List<WebElement> menuOptions;

    @FindBy(id = "searchTerm")
    public WebElement searchBox;

    @FindBy(xpath = ("(//a[@class='dropdown-toggle'])[1]"))
    public WebElement settingsBtn;

    @FindBy(xpath = ("(//a[@class='dropdown-toggle'])[2]"))
    public WebElement userMenu;

    @FindBy(xpath = "//a[contains(text(),'My Profile')]")
    public WebElement myProfile;

    @FindBy(id="logout_link")
    public  WebElement logOutBtn;


    public BasePage() {

        PageFactory.initElements(Driver.get(), this);
    }

    public void goToTab(String tabName){

        switch (tabName){
            case "Account Summary":
                menuOptions.get(0).click();
                break;
            case "Account Activity":
                menuOptions.get(1).click();
                break;

            case "Transfer Funds":
                menuOptions.get(2).click();
                break;

            case "Pay Bills":
                menuOptions.get(3).click();
                break;

            case "My Money Map":
                menuOptions.get(4).click();
                break;

            case "Online Statements":
                menuOptions.get(5).click();
                break;
        }
    }

    public String getUserName(){
        BrowserUtils.waitForVisibility(userMenu, 5);
        return userMenu.getText();
    }


    public void logOut(){
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(userMenu);
        BrowserUtils.clickWithJS(logOutBtn);
    }
    public void goToMyUser(){

        BrowserUtils.waitForClickablility(userMenu, 5).click();
        BrowserUtils.waitForClickablility(myProfile, 5).click();

    }

}
