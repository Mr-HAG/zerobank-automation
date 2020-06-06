package com.zerobank.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyMoneyTab extends BasePage {

    @FindBy(id = "money_map_tab")
    public WebElement myMoneyTab;
}
