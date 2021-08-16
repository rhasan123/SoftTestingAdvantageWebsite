package testCases;

import org.openqa.selenium.WebDriver;
import utilities.browserEngine;
import utilities.elementsLocator;
import utilities.testData;

public class TPV_tabletPurchaseValidationKeywords {

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

	public static void selTabletSection() throws InterruptedException {
		driver.findElement(elementsLocator.SelTabletSec).click();

		Thread.sleep(3000);
	}

	public static void selectHPPro608G1() throws InterruptedException {
		driver.findElement(elementsLocator.selProG1).click();

	}

	public static void greyColorSelection()

	{
		driver.findElement(elementsLocator.SelGreyProG1).click();
	}

	public static void makeQty2()

	{
		driver.findElement(elementsLocator.QtyAddProG1).click();
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
