package step_definitions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverHook {

    public static AndroidDriver driver;

    @Before
    public void initiateDriver() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setUdid("emulator-5554") // get from command "adb devices"
                .setAppPackage("org.wikipedia") // change to package name of application to be tested
                .setAppActivity("org.wikipedia.main.MainActivity"); // set to main activity of the application
        driver = new AndroidDriver(new URL("http://localhost:4723"), options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // set implicit wait to 5 seconds
    }

    @After
    public void quitDriver() {
        driver.quit();
    }
}
