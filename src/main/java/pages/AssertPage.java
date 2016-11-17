package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AssertPage extends Page {

    @FindBy(xpath="//a[@href='/ideas']")
    private WebElement checkIdeas;

    public AssertPage(WebDriver webDriver) {
        super(webDriver);
    }

    public AssertPage assertTest(String string){
        Assert.assertEquals(checkIdeas.getText(),string);
        return  new AssertPage(driver.get());
    }
}
