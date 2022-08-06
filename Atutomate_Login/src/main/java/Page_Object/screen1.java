package Page_Object;

import java.util.List;

import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class screen1 {

	protected static AndroidDriver driver;
	protected static List<WebElement> elementlist = null;
	protected static WebElement element = null;

	@SuppressWarnings("static-access")
	public screen1(AndroidDriver driver) {
		this.driver = driver;
		// PageFactory.initElements(driver, this.driver);
	}

	public WebElement nextButton() {
		element = driver.findElement(AppiumBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Next']]"));
		return element;
	}

	public List<WebElement> selectLanguages() {
		elementlist = driver.findElements(AppiumBy.className("android.widget.TextView"));
		return elementlist;
	}

	public WebElement nextButtonHindi() {
		element = driver.findElement(AppiumBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='आगे बढे']]"));
		return element;
	}
	public WebElement engText() {
		element = driver.findElement(AppiumBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Eng']]"));
		return element;
	}
}
