package testCases;

import org.testng.annotations.Test;

import utilities.readData;
import utilities.testData;

public class CUPV_contactUsPageValidationRunner {

	
	@Test
	public static void runnerSSCV() throws Exception {
		// public static void main(String[] args) throws Exception {
		// Declaring the path of the Excel file with the name of the Excel file
		String sPath = testData.externalData;
		// Here we are passing the Excel path and SheetName as arguments to connect with
		// Excel file

		int[] data=readData.readExcelData(sPath, "Contact US page validation");

			for (int j = 11; j <= data[1]; j++) {

				String Keywords = readData.readCellData(j, data[0]);
				// Comparing the value of Excel cell with all the keywords 
				if (Keywords.equals("OpenBrowser")) 
				{
					CUPV_contactUsPageValidationKeywords.openBrowser();
					 System.out.println("Browser is opened");
					 Thread.sleep(1000);
				} 
				
				else if (Keywords.equals("SignIn")) 
				{
				CUPV_contactUsPageValidationKeywords.signInAsUser();
					Thread.sleep(1000);
				}
				else if (Keywords.equals("ContactUs")) 
				{
					CUPV_contactUsPageValidationKeywords.ClickContactUsOption();
					System.out.println("Contact Us section selected");
					Thread.sleep(1000);
				}
				else if (Keywords.equals("SelTablets")) 
				{
					CUPV_contactUsPageValidationKeywords.selectTabletfromDrpdown();
					System.out.println("TAblets selected");
					Thread.sleep(1000);
					
				}
				
				else if (Keywords.equals("SelProG1")) 
				{
					CUPV_contactUsPageValidationKeywords.selectProG1();
					System.out.println("Pro G1 selected");
					Thread.sleep(3000);
				}
				else if (Keywords.equals("EmailId")) 
				{
					CUPV_contactUsPageValidationKeywords.inputEmailId();
					System.out.println("EmailId given");
					Thread.sleep(1000);
				}	
				else if (Keywords.equals("InputSub")) 
				{
					CUPV_contactUsPageValidationKeywords.inputSubject();
					System.out.println("Subject given");
					Thread.sleep(1000);
				}
				
				else if (Keywords.equals("ClickSend")) 
				{
					CUPV_contactUsPageValidationKeywords.clickSendBtn();
					
					System.out.println("Send selected");
				}	
				
				else if (Keywords.equals("SignOut")) 
				{
					CUPV_contactUsPageValidationKeywords.signOutProcess();
					System.out.println("Sign out");
					Thread.sleep(1000);
				}
				else if (Keywords.equals("TearDown")) 
				{
					CUPV_contactUsPageValidationKeywords.tearDown();
					System.out.println("Browser closed");
				}

			}
		}
	}

