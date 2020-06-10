package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.SimpleFormatter;

public class AccountActivityPage extends BasePage {

    @FindBy (id = "aa_accountId")
    public WebElement accountDropDown;

    @FindBy (xpath = "//body//option")
    public List<WebElement> accDDoptions;

    @FindBy (xpath = "//a[@href='#ui-tabs-1']")
    public WebElement showTransactions;

    @FindBy (xpath = "//a[@href='#ui-tabs-2']")
    public WebElement findTransactions;

    @FindBy (id = "aa_fromDate")
    public WebElement startDate;

    @FindBy (id = "aa_toDate")
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


    public void goToTransaction(String linkName){
        Driver.get().findElement(By.linkText(linkName)).click();
    }


    public void setSearchDate(String startD, String endD) {
        BrowserUtils.waitFor(1);
        startDate.sendKeys(startD);

        endDate.sendKeys(endD);

        System.out.println("Find records between " + startD + " and " + endD);
    }

    public void clickSearch() {
        findBtn.click();
    }

    public void isResultCorrect(String startD, String endD) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");

       // Date date = simpleDateFormat.format(new Date());

    }
}
