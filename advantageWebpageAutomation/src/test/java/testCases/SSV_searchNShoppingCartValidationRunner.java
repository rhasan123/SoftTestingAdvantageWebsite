package testCases;

import org.testng.annotations.Test;

import utilities.readData;
import utilities.testData;

public class SSV_searchNShoppingCartValidationRunner {
	@Test
	public static void runnerSSCV() throws Exception {
		// public static void main(String[] args) throws Exception {
		// Declaring the path of the Excel file with the name of the Excel file
		String sPath = testData.externalData;
		// Here we are passing the Excel path and SheetName as arguments to connect with
		// Excel file

		int[] data=readData.readExcelData(sPath, "Search & shopingCart Validation");

			for (int j = 10; j <= data[1]; j++) {

				String Keywords = readData.readCellData(j, data[0]);
				// Comparing the value of Excel cell with all the keywords in the "Actions"
				// class
				if (Keywords.equals("OpenBrowser")) 
				{
					SSV_searchNShoppingCartValidationKeywords.openBrowser();
					 System.out.println("Browser is opened");
					 Thread.sleep(1000);
				} 
				
				else if (Keywords.equals("SignIn")) 
				{
				SSV_searchNShoppingCartValidationKeywords.signInAsUser();
					Thread.sleep(1000);
				}
				else if (Keywords.equals("ClickSearch")) 
				{
					SSV_searchNShoppingCartValidationKeywords.ClickSearchOption();
					System.out.println("Search section selected");
					Thread.sleep(1000);
				}
				else if (Keywords.equals("InputHP")) 
				{
					SSV_searchNShoppingCartValidationKeywords.typeHP();
					System.out.println("searched Hp");
					Thread.sleep(1000);
					
				}
				else if (Keywords.equals("CatTablet")) 
				{
					SSV_searchNShoppingCartValidationKeywords.mouseHover2Tablets();
					System.out.println("tablet catagory selected");
				}
				else if (Keywords.equals("SelectProG1")) 
				{
					SSV_searchNShoppingCartValidationKeywords.proG1Selection();
					System.out.println("Pro G1 selected");
					Thread.sleep(2000);
				}
				else if (Keywords.equals("Add2Cart")) 
				{
					SSV_searchNShoppingCartValidationKeywords.clickAdd2Cart();
					System.out.println("Added to cart");
					Thread.sleep(1000);
				}	
				else if (Keywords.equals("ShoppingCartPage")) 
				{
					SSV_searchNShoppingCartValidationKeywords.Nav2ShoppingCartPage();
					System.out.println("Shopping Cart page opened");
					Thread.sleep(1000);
				}
				else if (Keywords.equals("ClickCheckout")) 
				{
					SSV_searchNShoppingCartValidationKeywords.checkoutSelection();
					System.out.println("Checkout selected");
					Thread.sleep(2000);
					
				}	
				else if (Keywords.equals("ClickNext")) 
				{
					SSV_searchNShoppingCartValidationKeywords.clickNextBtn();
					System.out.println("Next selected");
				}	
				else if (Keywords.equals("SelSafePay")) 
				{
				SSV_searchNShoppingCartValidationKeywords.selectSafePay();
					System.out.println("Safepay selected");
				}	
				else if (Keywords.equals("SafePayInitials")) 
				{
					SSV_searchNShoppingCartValidationKeywords.inputSafePayinfo();
					System.out.println("Safe Pay Initials");
				}	
				else if (Keywords.equals("PayNow")) 
				{
					SSV_searchNShoppingCartValidationKeywords.clickPayNow();
					System.out.println("Pay now selected");
					Thread.sleep(1000);
				}
				else if (Keywords.equals("SignOut")) 
				{
					SSV_searchNShoppingCartValidationKeywords.signOutProcess();
					System.out.println("Sign out");
					Thread.sleep(1000);
				}
				else if (Keywords.equals("TearDown")) 
				{
					SSV_searchNShoppingCartValidationKeywords.tearDown();
					System.out.println("Browser closed");
				}

			}
		}
	}

