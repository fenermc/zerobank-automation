package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountSummaryPage extends BasePage {

    @FindBy(xpath = "//h2[@class='board-header']")
    public List<WebElement> accountTypes;

    @FindBy(xpath = "//div[3]//div[1]//table[1]//thead[1]//tr[1]/th")
    public List<WebElement> columnsCreditAccount;




    public void goToAccountType (String accName){

        Driver.get().findElement(By.linkText(accName)).click();
    }

    public void controlAccounts(){
        for (int i = 0; i < accountTypes.size(); i++) {
            System.out.println(accountTypes.get(i).getText() + " is displayed = " + accountTypes.get(i).isDisplayed());
        }

    }

}
