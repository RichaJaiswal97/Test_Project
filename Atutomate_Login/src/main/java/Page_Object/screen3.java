package Page_Object;

import java.util.List;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class screen3 {
	protected static AndroidDriver driver;
	protected static List<WebElement> elementlist = null;
	protected static WebElement element = null;

	@SuppressWarnings("static-access")
	public screen3(AndroidDriver driver) {
		this.driver = driver;
		// PageFactory.initElements(driver, this.driver);
	}

	public WebElement fullName() {
		element = driver.findElement(AppiumBy.xpath("//*[@class='android.widget.EditText']"));
		return element;
	}

	public WebElement nextMove() {
		element = driver.findElement(AppiumBy.xpath("//*[@class='android.widget.SeekBar']"));
		return element;
	}
}
