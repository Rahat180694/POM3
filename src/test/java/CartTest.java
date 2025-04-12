import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartTest extends Base {

    CartPage cart ;
    @BeforeMethod

    void openBrowser(){
        setup("https://cart.ebay.com/");
    cart= PageFactory.initElements(driver,CartPage.class);
    }




    @Test(enabled = false)
    void checkContinueButton(){

        cart.clickstartShopping();
        String expectedUrl="https://www.ebay.com/";
        String actualUrl=driver.getCurrentUrl();

        Assert.assertEquals(actualUrl,expectedUrl);

}

@Test(enabled = false)
    void searchAnything(){
        cart.Searchforanything();
        String expectedinUrl="Shoes";
        Assert.assertTrue(driver.getCurrentUrl().contains(expectedinUrl));

}
}

