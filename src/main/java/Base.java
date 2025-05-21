import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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
      wait.until(ExpectedConditions.visibilityOf(element));git init

  }
  void dropdown(WebElement element,String value){
        Select select=new Select(element);
        select.selectByValue(value);


    }


  void clean(){
      driver.quit();
  }

}
