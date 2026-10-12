package com.Regressionpage;

import org.testng.annotations.Test;
import com.BrowserPage.bASepage;
import com.StepNotifications.LoginAnnotations;

public class lOginPage extends bASepage {

	@SuppressWarnings("static-access")
	@Test
	public static void Regeression() throws Exception {

		LoginAnnotations login = new LoginAnnotations();

		login.mailTextbox("maheshkolluboina114@gmail.com");
		Thread.sleep(3000);
		login.passwordBox("Mahe@123");
		Thread.sleep(3000);
		login.clicking();
		Thread.sleep(3000);
		login.verifyTitle("Asyncotel — Hotel Operating System | PMS, POS, CRM & Accounts");
		Thread.sleep(3000);
		login.ScrollBy("scrollBy(0,1500)");
		 

	}

}
