package com.cbt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cbt.utilities.Driver;

public class UserInformationPage {
  
	public UserInformationPage() {
		PageFactory.initElements(Driver.getDriver() , this);
	}
	@FindBy(xpath="//p[.='name']/preceding-sibling::p")
	public WebElement name;
	@FindBy(xpath="//p[.='role']/preceding-sibling::p")
	public WebElement role;
	@FindBy(xpath="//p[.='team']/preceding-sibling::p")
	public WebElement team;
	@FindBy(xpath="//p[.='batch']/preceding-sibling::p")
	public WebElement batch;
	@FindBy(xpath="//p[.='campus']/preceding-sibling::p")
	public WebElement campus;
}
