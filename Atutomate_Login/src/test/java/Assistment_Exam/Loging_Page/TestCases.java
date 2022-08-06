package Assistment_Exam.Loging_Page;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import DataProvider.data_Provider;
import Utility.TT;

public class TestCases extends TT {

	@Test(enabled = true ,dataProvider = "Login", dataProviderClass = data_Provider.class)
	public void loginTC1(String Language, String FullName, String PregMonth, String EmailID, String Pasword)
			throws Exception {
		TT.tt1(driver);
		String desiredLanguage = Language;
		String EnterFullName = FullName;
		String desiredMonth = PregMonth;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		delay.until(ExpectedConditions.visibilityOf(sc1.engText()));
		/*------------------Select Language-------------------*/

		List<WebElement> Elements = sc1.selectLanguages();
		for (int i = 0; i < Elements.size(); i++) {
			System.out.println(Elements.get(i).getText());
			if (Elements.get(i).getText().contains(desiredLanguage)) {
				Elements.get(i).click();
				System.out.println(Elements.get(i).isSelected());
				break;
			}
		}
		log.info("Desired Language is Selected....");
		/*--------------------------Move to Next Screen---------*/

		if (desiredLanguage.contains("Eng")) {
			sc1.nextButton().click();
			log.info("Successfully Navigated to Next Screen....");
		} else {
			sc1.nextButtonHindi();
			log.info("Successfully Navigated to Next Screen....");
		}

		/*---------------------------Move to Screen 3--------------------*/

		sc2.nextButtonScreen2().click();
		log.info("Successfully Navigated to Next Screen....");

		/*---------------------Proceed to Enter Details------------*/

		sc3.fullName().sendKeys(EnterFullName);
		log.info("Succesfully Entered Name....");
		sc3.nextMove().click();
		log.info("Successfully Navigated to Next Screen....");

		/*--------------------Select month of pregnancy -------------*/

		int notFoundCount = 0;
		int totalPregnancyMonth = 9;
		for (int i = 0; i < totalPregnancyMonth; i++) {
			if (i == Integer.parseInt(desiredMonth)) {
				sc4.pregMonth(i).click();
				log.info("Selected Desired Month....");
				break;

			} else {
				notFoundCount++;
			}
		}
		if (notFoundCount == totalPregnancyMonth) {
			log.info("Selected Month is invaild");
		}

		/*---------------Click on Next--------------------------------*/

		sc4.nexttoscreen5().click();
		log.info("Successfully Navigated to Next Screen....");

		/*----------------------------------Screen 5-------------------------*/

		boolean noSuggestion = sc4.mbSuggestion().isDisplayed();
		System.out.println(noSuggestion);
		if (noSuggestion == true) {
			sc4.skiipNoSuggestion().click();
			log.info("Mobile Number Suggestion Popup is skiped....");
		}

		/*------------------------------Proceed to skip-------------------*/

		sc4.skippLogin().click();
		log.info("Successfully Navigated to Next Screen....");

		/*---------------------------------Select and accept all permision popup------*/

		boolean locationpopup = sc4.locationPopup().isDisplayed();
		if (locationpopup == true) {
			sc4.allowLocationPopup().click();
			log.info("Permission is Accepted....");
		}
		sc4.okdetailPopup().isDisplayed();
		if (locationpopup == true) {
			sc4.acceptOkPopup().click();
			log.info("Permission is Accepted....");
		}
		log.info("Welcome To Home Screen...");
	}

	@Test(enabled = false, dataProvider = "Login", dataProviderClass = data_Provider.class)
	public void loginTC2(String Language, String FullName, String PregMonth, String EmailID, String Pasword)
			throws Exception {
		TT.tt1(driver);
		String desiredLanguage = Language;
		String EnterFullName = FullName;
		String desiredMonth = PregMonth;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		delay.until(ExpectedConditions.visibilityOf(sc1.engText()));

		/*------------------Select Language-------------------*/

		List<WebElement> Elements = sc1.selectLanguages();
		for (int i = 0; i < Elements.size(); i++) {
			System.out.println(Elements.get(i).getText());
			if (Elements.get(i).getText().contains(desiredLanguage)) {
				Elements.get(i).click();
				System.out.println(Elements.get(i).isSelected());
				break;
			}
		}
		log.info("Desired Language is Selected....");
		/*--------------------------Move to Next Screen---------*/

		if (desiredLanguage.contains("Eng")) {
			sc1.nextButton().click();
			log.info("Successfully Navigated to Next Screen....");
		} else {
			sc1.nextButtonHindi();
			log.info("Successfully Navigated to Next Screen....");
		}

		/*---------------------------Move to Screen 3--------------------*/

		sc2.nextButtonScreen2().click();
		log.info("Successfully Navigated to Next Screen....");

		/*---------------------Proceed to Enter Details------------*/

		sc3.fullName().sendKeys(EnterFullName);
		log.info("Succesfully Entered Name....");
		sc3.nextMove().click();
		log.info("Successfully Navigated to Next Screen....");

		/*--------------------Select month of pregnancy -------------*/

		int notFoundCount = 0;
		int totalPregnancyMonth = 9;
		for (int i = 0; i < totalPregnancyMonth; i++) {
			if (i == Integer.parseInt(desiredMonth)) {
				sc4.pregMonth(i).click();
				log.info("Selected Desired Month....");
				break;

			} else {
				notFoundCount++;
			}
		}
		if (notFoundCount == totalPregnancyMonth) {
			log.info("Selected Month is invaild");
		}

		/*---------------Click on Next--------------------------------*/

		sc4.nexttoscreen5().click();
		log.info("Successfully Navigated to Next Screen....");

		/*----------------------------------Screen 5-------------------------*/

		boolean noSuggestion = sc4.mbSuggestion().isDisplayed();
		System.out.println(noSuggestion);
		if (noSuggestion == true) {
			sc4.skiipNoSuggestion().click();
			log.info("Mobile Number Suggestion Popup is skiped....");
		}

		/*------------------------------Proceed to skip-------------------*/

		sc4.singupGoogle().click();
		log.info("Successfully Clicked on Singup using Google ID....");
	/*	WebView.setWebContentsDebuggingEnabled(true);
	Set<String> handels = driver.getContextHandles();
		for(String allhandels : handels) {
			driver.switchTo().window(allhandels);
			System.out.println(driver.getTitle());
		}*/
		
		
		boolean IdSugession = sc4.chooseAccount().isDisplayed();
		boolean addAcc = sc4.addAccount().isDisplayed();
		if (IdSugession == true) {
			
			if (addAcc == true) {
				sc4.addAccount().click();
				log.info("Successfully clicked on Add Account....");

				delay.until(ExpectedConditions.visibilityOf(sc4.enterEmail()));
				if (sc4.enterEmail().isDisplayed()) {
					sc4.enterEmail().sendKeys(EmailID);
					sc4.nextPass().click();

					delay.until(ExpectedConditions.visibilityOf(sc4.passOption()));
					if (sc4.passOption().isDisplayed()) {
						sc4.enterPass().sendKeys(Pasword);
						sc4.nextPass().click();

						delay.until(ExpectedConditions.visibilityOf(sc4.tANDc()));
						sc4.acceptTandC().click();
						delay.until(ExpectedConditions.visibilityOf(sc4.skippLogin()));
					}
				}

			}
		}

		sc4.skippLogin().click();
		log.info("Successfully Navigated to Next Screen....");

		/*---------------------------------Select and accept all permision popup------*/

		boolean locationpopup = sc4.locationPopup().isDisplayed();
		if (locationpopup == true) {
			sc4.allowLocationPopup().click();
			log.info("Permission is Accepted....");
		}
		sc4.okdetailPopup().isDisplayed();
		if (locationpopup == true) {
			sc4.acceptOkPopup().click();
			log.info("Permission is Accepted....");
		}
		log.info("Welcome To Home Screen...");
	}
}
