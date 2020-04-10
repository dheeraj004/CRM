package com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.pages.LoginPage;

public class LoginPageTest extends BaseClass {
	
	@BeforeMethod
	public void launch()
	{
		BaseClass.init();
	}

	@Test
	public void detailsEnter()
	{
		LoginPage login=PageFactory.initElements(driver, LoginPage.class);
		login.enterDeatils("Admin", "admin");
	}
	@AfterMethod
	public void tearDown()
	{
		BaseClass.shut();
	}
}
