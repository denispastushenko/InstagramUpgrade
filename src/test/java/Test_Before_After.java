import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import pages.AssertPage;
import pages.Page;
import pages.TestPage;

import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;


public class Test_Before_After {
   /* public  static final String SITE = "https://www.instagram.com";
    public  static String BITCH = "alechka.vcher";
    protected PageObject photoPage;*/
    public static final String site = "https://www.epam.com";
   // protected PageObject pageObject;
    protected TestPage testPage;
    protected AssertPage assertPage;

    @Before
    public void setUp() throws MalformedURLException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Denys\\Desktop\\chromedriver_win32\\chromedriver.exe");
        testPage = new TestPage(new RemoteWebDriver(new URL("http://localhost:4445/wd/hub"), DesiredCapabilities.firefox()));
       // photoPage = new PageObject(new ChromeDriver());
        Page.getDriver().manage().window().maximize();
    }

    @After
    public void shoutDown() {
        if (Page.getDriver()!= null) {
            Page.getDriver().quit();
        }
    }
}
