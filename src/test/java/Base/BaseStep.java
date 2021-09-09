package Base;


import LoginFindBy.LoginPageObjects;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseStep extends LoginPageObjects {
    public WebDriver driver;

    public BaseStep(String initialization)
    {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Kadir/Desktop/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void geturl(){
        driver.get("https://www.hepsiburada.com");
    }



    public void findElementClick(WebElement element){
        try {
                WebDriverWait wait = new WebDriverWait(driver, 10);
                wait.until(ExpectedConditions.elementToBeClickable(element)).click();
        }
        catch (Exception ex){}
    }

    protected WebElement findElement(WebElement element) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOf(element));
            return element;
        } catch (Exception ex) {
            System.out.println("find element method error" + ex.getMessage());
            return null;
        }
    }



    public void PageScrolldown() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,300)", "");

    }

    public void DriverQuit() {
        driver.quit(); }

}

