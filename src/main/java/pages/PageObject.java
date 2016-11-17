package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.KeyEvent;



public class PageObject extends  Page {
    @FindBy(id="lst-ib")
    private WebElement search;

    @FindBy(xpath="//a[@href='https://www.epam.com/']")
    private WebElement getSiteEpam;





    public PageObject(WebDriver webDriver) {
        super(webDriver);
    }

    public TestPage testURL( String string) throws AWTException, InterruptedException {

        search.sendKeys(string);
        Thread.sleep(2000);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(3000);

        getSiteEpam.click();
        Thread.sleep(3000);
        return  new TestPage(driver.get());

    }
  /*  private  static int SCROLL = 250;
    private Robot r = new Robot();
    @FindBy(xpath = "//a[@class='_oidfu']")
    private WebElement buttonContinue;

    @FindBy(xpath = "//span[@class='_bkw5z']")
    private WebElement quantity;

    @FindBy(xpath = "//div[@class='_jjzlb']//img")
    private List<WebElement> photocicle;

    public PageObject(WebDriver webDriver) throws AWTException {
        super(webDriver);
    }
    public PageObject clickButton(){
        buttonContinue.click();
        return  this;
    }
     public  PageObject savetoComputer() {
         int rw =  Integer.parseInt(quantity.getText().replaceAll(",", ""));
         while (rw > photocicle.size()) {
             ((JavascriptExecutor) getDriver()).executeScript(String.format("scrollBy(0, %d)", SCROLL += 250));
             r.mouseWheel(-1);
             Sleep.sleep();
         }
         photocicle.stream()
                 .map((webElement -> regchecking(webElement.getAttribute("src"))))
                 .collect(Collectors.toSet())
                 .forEach(s -> {
                     try {
                         saver(s,FILE_WAY);
                     } catch (IOException e) {
                         e.printStackTrace();
                     }
                 });
         return this;

     }

    public  PageObject savetoDB(){
        int rw =  Integer.parseInt(quantity.getText().replaceAll(",", ""));
        while (rw > photocicle.size()) {
            ((JavascriptExecutor) getDriver()).executeScript(String.format("scrollBy(0, %d)", SCROLL += 250));
            r.mouseWheel(-1);
            Sleep.sleep();
        }
        photocicle.stream()
                .map((webElement -> regchecking(webElement.getAttribute("src"))))
                .collect(Collectors.toSet())
                .forEach(s -> {
                    try {
                        Connection_Class.getInstance().connectMethod(s);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
        return this;

    }*/
}
