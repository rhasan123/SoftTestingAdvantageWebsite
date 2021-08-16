package testCases;


import org.testng.annotations.Test;

import utilities.logCollection;
import utilities.readData;
import utilities.testData;

public class HPV_homepageValidationRunner {

	@Test
	public static void runnerHPV() throws Exception {
		// public static void main(String[] args) throws Exception {
		// Declaring the path of the Excel file with the name of the Excel file
		String sPath = testData.externalData;
		// Here we are passing the Excel path and SheetName as arguments to connect with
		// Excel file

		int[] data=readData.readExcelData(sPath, "Homepage Validation");

			for (int j = 9; j <= data[1]; j++) {

				String Keywords = readData.readCellData(j, data[0]);
				// Comparing the value of Excel cell with all the keywords in the "Actions"
				// class
				if (Keywords.equals("OpenBrowser")) {
					HPV_homepageValidationKeywords.openBrowser();
					System.out.println("Browser is opened");
					
				} else if (Keywords.equals("LoadPage")) {
					HPV_homepageValidationKeywords.loadHomepage();
					logCollection.info("webpage opened");
					System.out.println("webpage opened");
					 
				} else if (Keywords.equals("PageValidation")) {
					HPV_homepageValidationKeywords.homepageValidation();
					
					logCollection.info("Validate the homepage title");
					System.out.println("Validate the homepage title");
				}

				else if (Keywords.equals("TearDown")) {
					HPV_homepageValidationKeywords.tearDown();
					
					logCollection.log("BRowser CLOSSEd");
					System.out.println("Browser closed");
				}

			}
		}
	}

