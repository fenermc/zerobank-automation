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

    public void goToAccountActivity(){
        Driver.get().findElement(By.linkText("Account Activity")).click();
    }
}
