package Page_Object;

import java.util.List;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class screen4 {
	protected static AndroidDriver driver;
	protected static List<WebElement> elementlist = null;
	protected static WebElement element = null;

	@SuppressWarnings("static-access")
	public screen4(AndroidDriver driver) {
		this.driver = driver;

	}

	public WebElement pregMonth(int i) {
		element = driver.findElement(AppiumBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='" + i + "']]"));
		return element;
	}

	public WebElement nexttoscreen5() {
		element = driver.findElement(AppiumBy.xpath(
				"//*[@class='android.view.ViewGroup' and ./*[@class='android.view.ViewGroup' and ./*[@text='NEXT']]]"));
		return element;
	}

	public WebElement mbSuggestion() {
		element = driver.findElement(AppiumBy.xpath("//*[@text='Continue with']"));
		return element;
	}

	public WebElement skiipNoSuggestion() {
		element = driver.findElement(AppiumBy.xpath("//*[@text='NONE OF THE ABOVE']"));
		return element;
	}

	public WebElement skippLogin() {
		element = driver.findElement(AppiumBy.xpath("//*[@text='Skip']"));
		return element;
	}

	public WebElement locationPopup() {
		element = driver.findElement(
				AppiumBy.xpath("//*[@text='Allow us to access your location while you are using the app?']"));
		return element;
	}

	public WebElement allowLocationPopup() {
		element = driver.findElement(AppiumBy.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Allow']]"));
		return element;
	}

	public WebElement okdetailPopup() {
		element = driver.findElement(AppiumBy
				.xpath("//*[@text='You can now check out the hospitals from your locality in the menu section.']"));
		return element;
	}

	public WebElement acceptOkPopup() {
		element = driver.findElement(AppiumBy.xpath("//*[@text='OKAY']"));
		return element;
	}

	public WebElement singupGoogle() {
		element = driver.findElement(AppiumBy.xpath(
				"//*[@class='android.view.ViewGroup' and ./*[@class='android.widget.ImageView'] and ./*[@text='Sign in with Google']]"));
		return element;
	}

	public WebElement chooseAccount() {
		element = driver.findElement(AppiumBy.xpath("//*[@text='Choose an account']"));
		return element;
	}

	public WebElement addAccount() {
		element = driver.findElement(AppiumBy.xpath("//*[@text='Add another account']"));
		return element;
	}

	public WebElement enterEmail() {
		element = driver.findElement(AppiumBy.xpath(
				"(((//*[@id='view_container']/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[1]/*[@class='android.view.View'])[1]/*[@class='android.widget.TextView'])[2]"));
		return element;
	}
	public WebElement nextPass() {
		element = driver.findElement(AppiumBy.xpath(
				"//*[@text='Next']"));
		return element;
	}
	public WebElement enterPass() {
		element = driver.findElement(AppiumBy.xpath(
				"//*[@class='android.widget.EditText']"));
		return element;
	}
	
	public WebElement passOption() {
		element = driver.findElement(AppiumBy.xpath(
				"//*[@id='password']"));
		return element;
	}
	public WebElement tANDc() {
		element = driver.findElement(AppiumBy.xpath(
				"//*[@class='android.view.View' and ./*[@text='We publish the ']]"));
		return element;
	}
	
	public WebElement acceptTandC() {
		element = driver.findElement(AppiumBy.xpath(
				"//*[@text='I agree']"));
		return element;
	}
}