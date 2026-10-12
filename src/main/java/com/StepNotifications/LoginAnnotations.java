package com.StepNotifications;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginAnnotations extends dAtaSteps {

	public LoginAnnotations() {
		super();
	}

	@FindBy(css = "#_r_0_-form-item")
	WebElement usermailTextbox;

	@FindBy(xpath = "//input[@type='password']")
	WebElement userPasswordTextbox;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement clikElement;

	public void mailTextbox(String text) {

		waitForElement(usermailTextbox);
		
		type(usermailTextbox, text);
	}

	public void passwordBox(String text) {

		waitForElement(userPasswordTextbox);
		
		type(userPasswordTextbox, text);
	}

	public void clicking() {
		ClickedButton(clikElement);
		
		waitForElement(clikElement);
		
		
	}

}
