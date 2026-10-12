package com.BrowserPage;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import com.ExceptionPage.ErrorPage;

public class bASepage {

	public static WebDriver driver;

	public static FileInputStream fis;

	public static Properties prop;

	@BeforeTest

	public static void Browserpage() throws IOException {

		fis = new FileInputStream("src\\test\\resources\\propertiesFile\\config.properties");

		prop = new Properties();

		prop.load(fis);

	}

	@BeforeMethod
	public static void LaunchApplication() {
		String browser = prop.getProperty("browserName");

		switch (browser.toLowerCase()) {
		case "chrome":

			driver = new ChromeDriver();

			break;

		case "firefox":

			driver = new FirefoxDriver();

			break;

		case "edge":

			driver = new EdgeDriver();

			break;

		default:

			try {

				throw new ErrorPage();

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			break;
		}

		driver.get(prop.getProperty("url"));

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(prop.getProperty("implicitwait"))));

	}

	@AfterMethod
	public static void tearsDown() throws Exception {

		Thread.sleep(3000);
		driver.quit();

	}

}
