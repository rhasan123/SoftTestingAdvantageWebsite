package testCases;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utilities.browserEngine;
import utilities.elementsLocator;
import utilities.testData;

public class CUPV_contactUsPageValidationKeywords {

	public static WebDriver driver;
	
	
	// loading the browser
	public static void openBrowser()
	{
		
		driver = browserEngine.browserConfig();
	}

	//Sign in as a user
	public static void signInAsUser() throws InterruptedException {
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(testData.homepageURL);
		Thread.sleep(3000);
		driver.findElement(elementsLocator.UserAcc).click();
		Thread.sleep(1000);

		driver.findElement(elementsLocator.UID).sendKeys("rhasan");
		driver.findElement(elementsLocator.PW).sendKeys("Qwerty1");
		Thread.sleep(1000);

		driver.findElement(elementsLocator.SignInBtn).click();
		Thread.sleep(3000);
	}

	//Navigate to contact us page
	public static void ClickContactUsOption() throws InterruptedException {
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(elementsLocator.ContactUsBtn).click();
		Thread.sleep(1000);
	}

	public static void selectTabletfromDrpdown() throws InterruptedException {

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement sDropDown = driver.findElement(elementsLocator.categoryListbox);

		Select dropDown = new Select(sDropDown);
		// sDropDown.click();
	    Thread.sleep(2000);
		dropDown.selectByVisibleText("Tablets");
	}

	public static void selectProG1() throws InterruptedException {
		WebElement sDropDown1 = driver.findElement(elementsLocator.productListbox);

		Select dropDown1 = new Select(sDropDown1);
		// sDropDown1.click();
		Thread.sleep(2000);
		dropDown1.selectByVisibleText("HP Pro Tablet 608 G1");
	}

	public static void inputEmailId() {
		driver.findElement(elementsLocator.ContactUsEmail).sendKeys(testData.emailID);
		// driver.findElement(By.xpath("//*[@id='supportCover']/div[2]/sec-form/div[1]/div/sec-view[3]/div/input")).sendKeys("rhasan@lakeheadu.ca");
	}

	public static void inputSubject() {
		driver.findElement(elementsLocator.subjectText).sendKeys("Good Product");
	}

	public static void clickSendBtn() {
		driver.findElement(elementsLocator.sendBtn).click();
	}

	public static void signOutProcess() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(elementsLocator.UserAcc).click();
		//Thread.sleep(1000);
		driver.findElement(elementsLocator.SignOutBtn).click();
		//Thread.sleep(1000);

	}

	public static void tearDown()

	{
		driver.close();
	}

}
