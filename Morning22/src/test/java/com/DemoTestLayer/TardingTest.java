package com.DemoTestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.DemoTestBase.TestBase;

public class TardingTest extends TestBase{
	
	@Test
	public void verifyBuyShareAxis() throws InterruptedException
	{
		dash.enterCompanyName("AXIS");
		dash.clickOnCompanyOption();
		Thread.sleep(4000);
		//-------------------------------------
		exchange.clickOnBuyButton1();
		exchange.enterQuantityOfShare("2");
		exchange.clickOnBuyButton2();
		Thread.sleep(2000);
		//-------------------------------------
		String actual_status = exchange.getStatus();
		String expected_status = "Order Created successfully";
		
		Assert.assertEquals(actual_status, expected_status);	
	}
	
	@Test
	public void verifyBuyShareWipro() throws InterruptedException
	{
		dash.enterCompanyName("Wipro");
		dash.clickOnCompanyOption();
		Thread.sleep(4000);
		//-------------------------------------
		exchange.clickOnBuyButton1();
		exchange.enterQuantityOfShare("2");
		exchange.clickOnBuyButton2();
		Thread.sleep(2000);
		//-------------------------------------
		String actual_status = exchange.getStatus();
		String expected_status = "Order Created successfully";
		
		Assert.assertEquals(actual_status, expected_status);	
	}
}
