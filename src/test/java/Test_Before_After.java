import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.Page;
import pages.PageObject;

import java.awt.*;
import java.net.MalformedURLException;


public class Test_Before_After {
    public  static final String SITE = "https://www.instagram.com";
    public  static String BITCH = "alechka.vcher";
    protected PageObject photoPage;

    @Before
    public void setUp() throws MalformedURLException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Denys\\Desktop\\chromedriver_win32\\chromedriver.exe");
        photoPage = new PageObject(new FirefoxDriver());
        Page.getDriver().manage().window().maximize();

    }
    @After
    public void shoutDown() {
        if (Page.getDriver()!= null) {
            Page.getDriver().quit();
        }
    }
}
