package com.guru99bank.testCases;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.guru99bank.pageObjetcs.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	@Test
	public void loginTest() throws IOException
	{
		driver.get(baseurl);
		logger.info("url is entered");
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("user name is entered");
		lp.seetPassword(password);
		logger.info("password is entered");
		lp.clickSubmit();
		logger.info("login button is clicked");
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
		}
	}

}
