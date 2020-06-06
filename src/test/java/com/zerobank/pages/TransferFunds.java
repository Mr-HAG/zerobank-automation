package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TransferFunds extends BasePage {

    @FindBy(id = "transfer_funds_tab")
    public WebElement transferFunds;
}
