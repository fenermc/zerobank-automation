package com.zerobank.step_definitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.DashboardPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AccountSummaryStepDefs {

    @When("the user navigates to {string}")
    public void the_user_navigates_to(String tab) {

        DashboardPage dashboardPage = new DashboardPage();
       // dashboardPage.goToTab(tab);
    }

    @Then("page should have the title {string}")
    public void page_should_have_the_title(String title) {

        System.out.println("Current Page Title = " + Driver.get().getTitle());

        Assert.assertTrue("Verify that page has the title " + title , Driver.get().getTitle().equalsIgnoreCase(title));
    }


    @Then("page should have to following account types:")
    public void page_should_have_to_following_account_types(List<String> accountsFromFeature) {
        BrowserUtils.waitFor(2);
        //AccountSummaryPage accountSummaryPage = new AccountSummaryPage();
        //List<String>actualAccounts = BrowserUtils.getElementsText(accountSummaryPage.accountTypes);
        List<String>actualAccounts = BrowserUtils.getElementsText(new AccountSummaryPage().accountTypes);

        Assert.assertEquals(accountsFromFeature, actualAccounts);
        System.out.println("actualAccounts = " + actualAccounts);
        System.out.println("accountTypes = " + accountsFromFeature);
        System.out.println("accountSummaryPage.accountTypes = " + new AccountSummaryPage().accountTypes.size());

    }

    @Then("Credit Accounts table must have columns")
    public void table_must_have_columns(List<String> columnsCreditAccount) {
        BrowserUtils.waitFor(2);
        AccountSummaryPage accountSummaryPage = new AccountSummaryPage();

        BrowserUtils.waitFor(2);
        List<String> actualCredAccColumns = BrowserUtils.getElementsText(accountSummaryPage.columnsCreditAccount);
        BrowserUtils.waitFor(4);
        System.out.println("actualCredAccColumns = " + actualCredAccColumns);
        System.out.println("columnsCreditAccount = " + columnsCreditAccount);
        System.out.println("columnsCreditAccount.toString() = " + columnsCreditAccount.toString());
        System.out.println("accountSummaryPage.columnsCreditAccount.size() = " + actualCredAccColumns.size());

        Assert.assertEquals(columnsCreditAccount, actualCredAccColumns);

    }
}
