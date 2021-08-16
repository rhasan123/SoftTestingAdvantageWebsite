package testCases;

import org.testng.annotations.Test;

import utilities.readData;
import utilities.testData;

@Test
public class TPV_tabletPurchaseValidationRunner {
@Test
	public static void runnerTPV() throws Exception {
		// public static void main(String[] args) throws Exception {
		// Declaring the path of the Excel file with the name of the Excel file
		String sPath = testData.externalData;
		// Here we are passing the Excel path and SheetName as arguments to connect with
		// Excel file

		int[] data=readData.readExcelData(sPath, "Tablet Purchase Validation");

			for (int j = 11; j <= data[1]; j++) {

				String Keywords = readData.readCellData(j, data[0]);
				// Comparing the value of Excel cell with all the keywords
				if (Keywords.equals("OpenBrowser")) 
				{
					TPV_tabletPurchaseValidationKeywords.openBrowser();
					 System.out.println("Browser is opened");
					 Thread.sleep(1000);
				} 
				
				else if (Keywords.equals("SignIn")) 
				{
					TPV_tabletPurchaseValidationKeywords.signInAsUser();
					Thread.sleep(1000);
				}
				else if (Keywords.equals("SelTablets")) 
				{
					TPV_tabletPurchaseValidationKeywords.selTabletSection();
					System.out.println("Tablet section selected");
					Thread.sleep(1000);
				}
				else if (Keywords.equals("SelProG1")) 
				{
					TPV_tabletPurchaseValidationKeywords.selectHPPro608G1();
					System.out.println("Pro G1 selected");
					Thread.sleep(1000);
					
				}
				else if (Keywords.equals("SelGrey")) 
				{
					TPV_tabletPurchaseValidationKeywords.greyColorSelection();
					System.out.println("Grey color selected");
				}
				else if (Keywords.equals("Qty2")) 
				{
					TPV_tabletPurchaseValidationKeywords.makeQty2();
					System.out.println("quantity 2 selected");
				}
				else if (Keywords.equals("Add2Cart")) 
				{
					TPV_tabletPurchaseValidationKeywords.clickAdd2Cart();
					System.out.println("Added to cart");
					Thread.sleep(1000);
				}	
				else if (Keywords.equals("ClickCheckout")) 
				{
					TPV_tabletPurchaseValidationKeywords.clickCheckout();
					System.out.println("Checkout selected");
					Thread.sleep(2000);
					
				}	
				else if (Keywords.equals("ClickNext")) 
				{
					TPV_tabletPurchaseValidationKeywords.clickNextBtn();
					System.out.println("Next selected");
				}	
				else if (Keywords.equals("SelSafePay")) 
				{
					TPV_tabletPurchaseValidationKeywords.selectSafePay();
					System.out.println("Safepay selected");
				}	
				else if (Keywords.equals("SafePayInitials")) 
				{
					TPV_tabletPurchaseValidationKeywords.inputSafePayinfo();
					System.out.println("Safe Pay Initials");
				}	
				else if (Keywords.equals("PayNow")) 
				{
					TPV_tabletPurchaseValidationKeywords.clickPayNow();
					System.out.println("Pay now selected");
					Thread.sleep(1000);
				}
				else if (Keywords.equals("SignOut")) 
				{
					TPV_tabletPurchaseValidationKeywords.signOutProcess();
					System.out.println("Sign out");
					Thread.sleep(1000);
				}
				else if (Keywords.equals("TearDown")) 
				{
					TPV_tabletPurchaseValidationKeywords.tearDown();
					System.out.println("Browser closed");
				}

			}
		}
	}

