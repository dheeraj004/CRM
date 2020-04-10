package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class LoginPage  {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(xpath = "//input[@id='txtuId']")
	WebElement username;
	
	@FindBy(xpath = "//input[@id='txtPword']")
	WebElement password;
	
	@FindBy(xpath = "//input[@id='login']")
	WebElement loginbutton;
	
	public void enterDeatils(String user,String pass)
	{
		username.sendKeys(user);
		password.sendKeys(pass);
		loginbutton.click();
	}
	
	

}
