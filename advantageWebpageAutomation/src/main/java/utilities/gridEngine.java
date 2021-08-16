package utilities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class gridEngine {
public static WebDriver driver ; 
	
	public static RemoteWebDriver browserSetup() throws MalformedURLException { 
		String hubURL ="http://192.168.56.1:4444/wd/hub";
		DesiredCapabilities cap = DesiredCapabilities.chrome(); 
		cap.setBrowserName("chrome"); 
		cap.setPlatform(Platform.WINDOWS); 
		RemoteWebDriver driver = new RemoteWebDriver(new URL(hubURL),cap);
		
		driver.manage().window().maximize(); 
		driver.manage().deleteAllCookies(); 
		return driver;
		}
	}



