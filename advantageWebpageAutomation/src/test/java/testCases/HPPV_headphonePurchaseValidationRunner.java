package testCases;

import org.testng.annotations.Test;

import utilities.readData;
import utilities.testData;

public class HPPV_headphonePurchaseValidationRunner {
	@Test
	public static void runnerHPPV() throws Exception {
	
		// public static void main(String[] args) throws Exception {
		// Declaring the path of the Excel file with the name of the Excel file
		String sPath = testData.externalData;
		// Here we are passing the Excel path and SheetName as arguments to connect with
		// Excel file

		int[] data=readData.readExcelData(sPath, "Headphone Purchase Validation");

			for (int j = 10; j <= data[1]; j++) {

				String Keywords = readData.readCellData(j, data[0]);
				// Comparing the value of Excel cell with all the keywords 
				if (Keywords.equals("OpenBrowser")) 
				{
					HPPV_headphonePurchaseValidationKeywords.openBrowser();
					 System.out.println("Browser is opened");
					 Thread.sleep(1000);
				} 
				
				else if (Keywords.equals("SignIn")) 
				{
					HPPV_headphonePurchaseValidationKeywords.signInAsUser();
					Thread.sleep(1000);
				}
				else if (Keywords.equals("SelHeadphones")) 
				{
					HPPV_headphonePurchaseValidationKeywords.selHeadphoneSection();
					System.out.println("Headphone section selected");
					Thread.sleep(1000);
				}
				else if (Keywords.equals("SelH390")) 
				{
					HPPV_headphonePurchaseValidationKeywords.selectH390();
					System.out.println("H390 selected");
					Thread.sleep(1000);
					
				}
				else if (Keywords.equals("SelYellow")) 
				{
					HPPV_headphonePurchaseValidationKeywords.yellowColorSelection();
					System.out.println("Yellow color selected");
				}
				
				else if (Keywords.equals("Add2Cart")) 
				{
					HPPV_headphonePurchaseValidationKeywords.clickAdd2Cart();
					System.out.println("Added to cart");
					Thread.sleep(1000);
				}	
				else if (Keywords.equals("ClickCheckout")) 
				{
					HPPV_headphonePurchaseValidationKeywords.clickCheckout();
					System.out.println("Checkout selected");
					Thread.sleep(2000);
					
				}	
				else if (Keywords.equals("ClickNext")) 
				{
					HPPV_headphonePurchaseValidationKeywords.clickNextBtn();
					System.out.println("Next selected");
				}	
				else if (Keywords.equals("SelSafePay")) 
				{
					HPPV_headphonePurchaseValidationKeywords.selectSafePay();
					System.out.println("Safepay selected");
				}	
				else if (Keywords.equals("SafePayInitials")) 
				{
					HPPV_headphonePurchaseValidationKeywords.inputSafePayinfo();
					System.out.println("Safe Pay Initials");
				}	
				else if (Keywords.equals("PayNow")) 
				{
					HPPV_headphonePurchaseValidationKeywords.clickPayNow();
					System.out.println("Pay now selected");
					Thread.sleep(1000);
				}
				else if (Keywords.equals("SignOut")) 
				{
					HPPV_headphonePurchaseValidationKeywords.signOutProcess();
					System.out.println("Sign out");
					Thread.sleep(1000);
				}
				else if (Keywords.equals("TearDown")) 
				{
					HPPV_headphonePurchaseValidationKeywords.tearDown();
					System.out.println("Browser closed");
				}

			}
		}
	}
