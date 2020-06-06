package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageBill extends BasePage{

    @FindBy(id = "pay_bills_tab")
    public WebElement payBills;
}
