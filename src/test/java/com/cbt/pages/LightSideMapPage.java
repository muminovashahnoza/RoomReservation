package com.cbt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cbt.utilities.Driver;

public class LightSideMapPage {
    
	public LightSideMapPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath="//a[.='my']")
	public WebElement my;
	@FindBy(linkText="/me")
	public WebElement self;
	@FindBy(linkText="/team")
	public WebElement team;
	@FindBy(linkText="/sign-out")
	public WebElement signOut;
	
}
