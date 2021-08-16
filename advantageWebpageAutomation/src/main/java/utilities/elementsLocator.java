package utilities;

import org.openqa.selenium.By;

public class elementsLocator {

	// Sign in
	public static By UserAcc = By.id("menuUser");
	public static By UID = By.name("username");
	public static By PW = By.name("password");
	public static By SignInBtn = By.id("sign_in_btnundefined");

	// Select Tablet Section
	public static By SelTabletSec = By.id("tabletsImg");
	// Select Tablet Pro g1
	public static By selProG1 = By.partialLinkText("HP Pro Tablet 608 G1");

	public static By SelGreyProG1 = By.cssSelector("span[title='GRAY']");
	public static By QtyAddProG1 = By.className("plus");

	// Select Headphone Section
	public static By SelHeadphoneSec = By.id("headphonesImg");
	// Select HeadSet H390
	public static By selH390 = By.partialLinkText("Logitech USB Headset H390");
	// Select color yellow
	public static By selYellowH390 = By.xpath("//*[@title='YELLOW']");

	// Add to Popup checkout
	public static By Save2Cart = By.name("save_to_cart");
	public static By CheckOutPopUp = By.id("checkOutPopUp");

	// Payment
	public static By NextBtn = By.id("next_btn");
	public static By SelSafePay = By.name("safepay");
	public static By SafePayUID = By.name("safepay_username");
	public static By SafePayPW = By.name("safepay_password");
	public static By SafePayNowBtn = By.id("pay_now_btn_SAFEPAY");
	public static By SignOutBtn = By.xpath("/html/body/header/nav/ul/li[3]/a/div/label[3]");

	// Contact Us
	public static By ContactUsBtn = By.xpath("//*[@translate='CONTACT_US']");
	public static By categoryListbox = By.name("categoryListboxContactUs");
	public static By productListbox = By.name("productListboxContactUs");
	public static By ContactUsEmail = By.name("emailContactUs");
	public static By subjectText = By.name("subjectTextareaContactUs");
	public static By sendBtn = By.id("send_btnundefined");

	// search option

	public static By searchBtn = By.id("menuSearch");
	public static By searchInputArea = By.id("autoComplete");
	public static By searchTabletSec = By.xpath("//label[contains(text(),'tablets')]");
	public static By searchProG1 = By.xpath("//p[contains(text(),'HP PRO TABLET 608 G1')]");

	// Shopping Cart
	public static By ShoppingCartBtn = By.id("menuCart");
	public static By checkOutBtn = By.id("checkOutButton");
}
