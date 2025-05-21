import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartTest extends Base {

    CartPage cart ;
    @BeforeMethod

    void openBrowser(){
        setup("https://www.ebay.com/");
    cart= PageFactory.initElements(driver,CartPage.class);
    }


    @Test
    void checkStartShoppingButton() throws InterruptedException {
        //driver.manage().timeouts().implicitlyWait(5000);
        Thread.sleep(5000);
        cart.clickstartShopping();
        String expectedUrl="https://www.ebay.com/";
        String actualUrl=driver.getCurrentUrl();

        Assert.assertEquals(actualUrl,expectedUrl);


}

@Test
    void searchAnything(String product){
        cart.Searchsomething(product);

        Assert.assertTrue(driver.getCurrentUrl().contains(product));

}
}

