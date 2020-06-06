package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public abstract class  BasePage {

    @FindBy(css = "#pc_currency")
    public List<WebElement> foreignMenu;

    @FindBy(xpath = "*[@id=\"settingsBox\"]/ul/li[3]/a/text()")
    public WebElement userNameIcon;

    @FindBy(id = "logout_link")
    public WebElement logOutLink;

    public BasePage() { PageFactory.initElements(Driver.get(), this); }



}

