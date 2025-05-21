import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class CartPage extends Base{

    @FindBy(css = "[data-test-id='start-shopping']") WebElement Startshopping;
@FindBy(xpath = "//input[@aria-label='Search for anything']") WebElement Searchanything;

    void clickstartShopping() {
        //driver.manage().timeouts().implicitlyWait(5000);
        waitForElementVisibility(5000, Startshopping);
        Startshopping.click();
    }

    void Searchsomething(String product){
        Searchanything.sendKeys(product+ Keys.ENTER);
    }


}
