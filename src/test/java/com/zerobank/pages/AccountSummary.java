package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSummary extends BasePage{

    @FindBy(css = "#account_summary_tab > a")
    public WebElement accountSummary;

}
