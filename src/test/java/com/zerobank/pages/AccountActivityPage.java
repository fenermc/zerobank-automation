package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivityPage extends BasePage {

    @FindBy (id = "aa_accountId")
    public WebElement accountDropDown;

    @FindBy (xpath = "//body//option")
    public List<WebElement> accDDoptions;

    @FindBy (xpath = "//a[@href='#ui-tabs-1']")
    public WebElement showTransactions;

    @FindBy (xpath = "//a[@href='#ui-tabs-2']")
    public WebElement findTransactions;

    @FindBy (id = "id='aa_fromDate'")
    public WebElement startDate;

    @FindBy (id = "id='aa_toDate'")
    public WebElement endDate;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement findBtn;

    @FindBy(id = "filtered_transactions_for_account")
    public WebElement transactionTable;

    @FindBy(xpath = "//div[@id='filtered_transactions_for_account']//tbody/tr//td[1]")
    public List<WebElement> datesFound;

    @FindBy(xpath = "//div[@id='filtered_transactions_for_account']//tbody/tr//td[2]")
    public List<WebElement> descriptionFound;

    @FindBy(xpath = "//div[@id='filtered_transactions_for_account']//tbody/tr//td[3]")
    public List<WebElement> depositFound;

    @FindBy(xpath = "//div[@id='filtered_transactions_for_account']//tbody/tr//td[4]")
    public List<WebElement> withdrawalFound;


    @FindBy(id = "aa_description")
    public WebElement descrptInBox;

    @FindBy(id="aa_type")
    public WebElement transactionTypeDD;


    public boolean isDropdownSelected(String expectedOption) {
        Select select = new Select(accountDropDown);
        String act = select.getFirstSelectedOption().getText();
    return act.equals(expectedOption);
    }
}
