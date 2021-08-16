package testCases;

import org.openqa.selenium.WebDriver;

import utilities.browserEngine;
import utilities.elementsLocator;
import utilities.testData;

public class HPPV_headphonePurchaseValidationKeywords {

	public static WebDriver driver;

	public static void openBrowser()

	{
		// loading the browser
		driver = browserEngine.browserConfig();
	}

	public static void signInAsUser() throws InterruptedException {
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

	public static void selHeadphoneSection() throws InterruptedException {
		driver.findElement(elementsLocator.SelHeadphoneSec).click();

		Thread.sleep(3000);
	}

	public static void selectH390() throws InterruptedException {
		driver.findElement(elementsLocator.selH390).click();

	}

	public static void yellowColorSelection()

	{
		driver.findElement(elementsLocator.selYellowH390).click();
	}

	public static void clickAdd2Cart() throws InterruptedException {
		driver.findElement(elementsLocator.Save2Cart).click();

	}

	public static void clickCheckout() throws InterruptedException {
		driver.findElement(elementsLocator.CheckOutPopUp).click();

	}

	public static void clickNextBtn() {
		driver.findElement(elementsLocator.NextBtn).click();
	}

	public static void selectSafePay() throws InterruptedException {

		// SafePAy
		driver.findElement(elementsLocator.SelSafePay).click();

	}

	public static void inputSafePayinfo() {
		driver.findElement(elementsLocator.SafePayUID).clear();
		driver.findElement(elementsLocator.SafePayUID).sendKeys("rhasan");
		driver.findElement(elementsLocator.SafePayPW).clear();
		driver.findElement(elementsLocator.SafePayPW).sendKeys("Qwerty1");
	}

	public static void clickPayNow() {
		driver.findElement(elementsLocator.SafePayNowBtn).click();

		// MasterCredit

		// driver.findElement(By.name("masterCredit")).click();
		// driver.findElement(By.id("pay_now_btn_MasterCredit")).click();
	}

	public static void signOutProcess() throws InterruptedException {
		driver.findElement(elementsLocator.UserAcc).click();
		Thread.sleep(1000);
		driver.findElement(elementsLocator.SignOutBtn).click();
		Thread.sleep(1000);
		
	}

	public static void tearDown()

	{
	   driver.close();
	}

}

