package Assistment_Exam.Loging_Page;

import java.net.URL;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import Page_Object.screen1;
import Page_Object.screen2;
import Page_Object.screen3;
import Page_Object.screen4;
import io.appium.java_client.android.AndroidDriver;

public class initializate_BaseClass {
	public static AndroidDriver driver;

	protected static DesiredCapabilities capabilities;
	protected static screen1 sc1;
	protected static screen2 sc2;
	protected static screen3 sc3;
	protected static screen4 sc4;
	protected static Logger log = LogManager.getLogger(initializate_BaseClass.class);

	@BeforeTest
	public void base_Setup() throws Exception {

		capabilities = new DesiredCapabilities();

		capabilities.setCapability("deviceName", "ebb42342");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "com.avegen.together");
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("appActivity", "com.avegen.together.MainActivity");
		String path = System.getProperty("user.home");
		capabilities.setCapability("app",
				path + "\\eclipse-workspace\\Atutomate_Login\\src\\main\\java\\Resources\\base.apk");
		capabilities.setCapability("autoGrantPermissions", "true");
		capabilities.setCapability("noRest", true);

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		log.info("App is Lunched....");
	}
}
