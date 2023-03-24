package docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class FirefoxTest {

	@Test
	public void test() throws MalformedURLException {
		DesiredCapabilities dc = DesiredCapabilities.firefox();
		URL url = new URL("http://localhost:4444");
		RemoteWebDriver driver = new RemoteWebDriver(url, dc);
		driver.get("https://facebook.com");
		System.out.println("Title of the page: " + driver.getTitle());
		driver.quit();
	}
}
