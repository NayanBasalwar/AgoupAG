package com.DemoTestLayer;


import org.testng.annotations.Test;

import com.DemoTestBase.TestBase;

public class TransactionsTest extends TestBase {

	@Test
	public void getTransactionDetailsOnConsole() throws InterruptedException
	{
		dash.clickOnTransactionsLink();
		Thread.sleep(2000);
		transaction.getTransactionDetails();
	}
}
