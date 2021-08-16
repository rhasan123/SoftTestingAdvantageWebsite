package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utilities.browserEngine;
import utilities.testData;

public class HPV_homepageValidationKeywords {

	public static WebDriver driver;

	
	public static void openBrowser()

	{
		// loading the browser
		driver = browserEngine.browserConfig();
	}

	public static void loadHomepage() {
		// loading application under test
		driver.get(testData.homepageURL);
	
	}

	public static void homepageValidation()

	{

		// validation the home page

		String homepageActualTitle = driver.getTitle();

		Assert.assertEquals(homepageActualTitle, testData.homepageExpectedTitle);

	}

	public static void tearDown()

	{
		driver.close();
	}

}

