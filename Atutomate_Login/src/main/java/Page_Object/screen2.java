package Page_Object;

import java.util.List;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class screen2 {
	protected static AndroidDriver driver;
	protected static List<WebElement> elementlist = null;
	protected static WebElement element = null;

	@SuppressWarnings("static-access")
	public screen2(AndroidDriver driver) {
		this.driver = driver;
		// PageFactory.initElements(driver, this.driver);
	}

	public WebElement nextButtonScreen2() {
		element = driver.findElement(AppiumBy.xpath(
				"//*[@class='android.view.ViewGroup' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.ImageView'] and ./*[./*[@text='Next']]]"));
		return element;
	}

}
