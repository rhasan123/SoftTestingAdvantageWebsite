package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import utilities.browserEngine;
import utilities.elementsLocator;
import utilities.testData;
public class SSV_searchNShoppingCartValidationKeywords {

	public static WebDriver driver;
	
	
	public static void openBrowser()

	{
		// loading the browser
		driver = browserEngine.browserConfig();
	}

	public static void signInAsUser() throws InterruptedException 
	{
		driver.get(testData.homepageURL);
		Thread.sleep(3000);

		driver.findElement(elementsLocator.UserAcc).click();

		Thread.sleep(1000);

		driver.findElement(elementsLocator.UID).sendKeys(testData.loginUID);
		driver.findElement(elementsLocator.PW).sendKeys(testData.loginPW);
		Thread.sleep(1000);

		driver.findElement(elementsLocator.SignInBtn).click();

		Thread.sleep(3000);
	}
		public static void ClickSearchOption()
		{
		driver.findElement(elementsLocator.searchBtn).click();
		}
		public static void typeHP()
		{
		driver.findElement(elementsLocator.searchInputArea).sendKeys("HP");
		}
		
		//driver.findElement(By.id("mobileSearch")).sendKeys("HP");
		public static void mouseHover2Tablets()
		{
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(elementsLocator.searchTabletSec)).perform();
		}
		
		public static void proG1Selection()
		{
		driver.findElement(elementsLocator.searchProG1).click();
		}
		
	
		public static void clickAdd2Cart() throws InterruptedException
		{
			driver.findElement(elementsLocator.Save2Cart).click();
		}
			public static void	Nav2ShoppingCartPage()
			{
		driver.findElement(elementsLocator.ShoppingCartBtn).click();
			}
			public static void checkoutSelection()
			{
		driver.findElement(elementsLocator.checkOutBtn).click();
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

		public static void clickPayNow()
		{
			driver.findElement(elementsLocator.SafePayNowBtn).click();

			// MasterCredit

			// driver.findElement(By.name("masterCredit")).click();
			// driver.findElement(By.id("pay_now_btn_MasterCredit")).click();
		}

		public static void signOutProcess() throws InterruptedException 
		{
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