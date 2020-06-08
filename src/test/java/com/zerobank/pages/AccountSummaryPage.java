package com.zerobank.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountSummaryPage extends BasePage {

    @FindBy(xpath = "//h2[@class='board-header']")
    public List<WebElement> accountTypes;

    @FindBy(xpath = "//th[@xpath='1']/parent::tr/th")
    public List<WebElement> columnsCreditAccount;


    public void goToAccount(String chooseAccount) {
        switch (chooseAccount) {
            case "Cash Accounts":
                accountTypes.get(0).click();
                break;
            case "Investment Accounts":
                accountTypes.get(1).click();
                break;
            case "Credit Accounts":
                accountTypes.get(2).click();
                break;
            case "Loan Accounts":
                accountTypes.get(3).click();
                break;

        }
    }
    public void controlAccounts(){
        for (int i = 0; i < accountTypes.size(); i++) {
            System.out.println(accountTypes.get(i).getText() + " is displayed = " + accountTypes.get(i).isDisplayed());
        }

    }

    public void goToCredAccColumns(String chooseCredAccColumn){
        switch (chooseCredAccColumn) {
            case "Account":
                columnsCreditAccount.get(0).click();
                break;
            case "Credit Card":
                columnsCreditAccount.get(1).click();
                break;
            case "Balance":
                columnsCreditAccount.get(2).click();
                break;
        }
    }

}
