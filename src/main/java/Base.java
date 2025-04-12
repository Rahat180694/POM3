import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Base {

 static WebDriver driver;

  void setup(String url){
      driver=new ChromeDriver();
      driver.get(url);

  }
  void waitForElementVisibility(int time, WebElement element){
      WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(time));
      wait.until(ExpectedConditions.visibilityOf(element));

  }
  void clean(){
      driver.quit();
  }

}
