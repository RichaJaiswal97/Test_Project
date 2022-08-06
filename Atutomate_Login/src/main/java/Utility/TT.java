package Utility;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;

import Assistment_Exam.Loging_Page.initializate_BaseClass;
import Page_Object.screen1;
import Page_Object.screen2;
import Page_Object.screen3;
import Page_Object.screen4;
import io.appium.java_client.android.AndroidDriver;

public class TT  extends initializate_BaseClass{
	protected static WebDriverWait delay;
	public static void tt1(AndroidDriver driver) {
		sc1 = new screen1(driver);
		sc2 = new screen2(driver);
		sc3 = new screen3(driver);
		sc4 = new screen4(driver);
		delay = new WebDriverWait(driver, Duration.ofSeconds(60));
		System.out.println("Initialization is done");
	}

}
