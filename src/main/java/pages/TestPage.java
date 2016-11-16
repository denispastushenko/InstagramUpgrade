package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestPage extends Page {

    @FindBy(xpath="//a[@href='/ideas']")
    private WebElement ideas;

    public TestPage(WebDriver webDriver) {
        super(webDriver);
    }

    public AssertPage getLinkIdeas(){
        ideas.click();
        return  new AssertPage(driver.get());
    }
}
