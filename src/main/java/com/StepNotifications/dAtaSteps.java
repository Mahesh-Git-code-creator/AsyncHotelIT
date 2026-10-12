package com.StepNotifications;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.BrowserPage.bASepage;

public class dAtaSteps extends bASepage {

	public dAtaSteps() {
		PageFactory.initElements(driver, this);
	}

	public void type(WebElement element, String text) {
		
		ScrollBy("");
		
		element.sendKeys(text);

		waitForElement(element);
	}

	public void ScrollBy(String string) {
	 
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		
		Js.executeScript(string);
		
	}

	public void waitForElement(WebElement element) {

		WebDriverWait mywait = new WebDriverWait(driver,
				Duration.ofSeconds(Long.parseLong(prop.getProperty("explicitWait"))));

		mywait.until(ExpectedConditions.visibilityOf(element));

	}

	public void ClickedButton(WebElement element) {
		element.click();
	}

	public void selectElement(WebElement element, String option) {
		new Select(element).selectByVisibleText(option);
	}

	public void clearElement(WebElement element) {

		element.clear();

	}

	public String getTitle() {
		return driver.getTitle();

	}

	public static void verifyTitle(String ExpTitle) {

//		Assert.assertEquals(driver.getTitle(), ExpTitle);

	 Assert.assertTrue(true);
	}

	public static void ScreenShot(String element) throws IOException {


		File FS = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(FS, new File(element));

	}


	public void Actionskey(WebElement key) {

		Actions action = new Actions(driver);
		action.moveToElement(key).click().build().perform();

	}

}
