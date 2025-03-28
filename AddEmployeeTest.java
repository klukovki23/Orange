// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class AddEmployeeTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void addEmployee() {
    // Test name: AddEmployee
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("https://opensource-demo.orangehrmlive.com//");
    // 2 | setWindowSize | 1366x728 | 
    driver.manage().window().setSize(new Dimension(1366, 728));
    // 3 | type | name=username | Admin
    driver.findElement(By.name("username")).sendKeys("Admin");
    // 4 | type | name=password | admin123
    driver.findElement(By.name("password")).sendKeys("admin123");
    // 5 | click | css=button.orangehrm-login-button | 
    driver.findElement(By.cssSelector("button.orangehrm-login-button")).click();
    // 6 | click | xpath=//span[text()='PIM']/ancestor::a | 
    driver.findElement(By.xpath("//span[text()=\'PIM\']/ancestor::a")).click();
    // 7 | click | css=li.oxd-topbar-body-nav-tab:nth-child(3) | 
    driver.findElement(By.cssSelector("li.oxd-topbar-body-nav-tab:nth-child(3)")).click();
    // 8 | type | name=firstName | User
    driver.findElement(By.name("firstName")).sendKeys("User");
    // 9 | type | name=middleName | Test
    driver.findElement(By.name("middleName")).sendKeys("Test");
    // 10 | type | name=lastName | Complete
    driver.findElement(By.name("lastName")).sendKeys("Complete");
    // 11 | type | xpath=/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input | 1
    driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).sendKeys("1");
    // 12 | click | css=button.oxd-button:nth-child(3) | 
    driver.findElement(By.cssSelector("button.oxd-button:nth-child(3)")).click();
    // 13 | click | css=li.oxd-topbar-body-nav-tab:nth-child(2) > a:nth-child(1) | 
    driver.findElement(By.cssSelector("li.oxd-topbar-body-nav-tab:nth-child(2) > a:nth-child(1)")).click();
    // 14 | type | css=div.oxd-grid-item:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > input:nth-child(2) | User Test Complete
    driver.findElement(By.cssSelector("div.oxd-grid-item:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > input:nth-child(2)")).sendKeys("User Test Complete");
    // 15 | click | css=button.oxd-button:nth-child(2) | 
    driver.findElement(By.cssSelector("button.oxd-button:nth-child(2)")).click();
  }
}
