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

    public boolean isDropdownSelected(String expectedOption) {
        Select select = new Select(accountDropDown);
        String act = select.getFirstSelectedOption().getText();
    return act.equals(expectedOption);
    }
}
