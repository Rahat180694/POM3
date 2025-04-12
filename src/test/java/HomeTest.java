import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeTest extends Base{
    Homepage home;

   @BeforeMethod
    void openBrowser(){
        setup("https://ebay.com");
         home= PageFactory.initElements(driver,Homepage.class);

    }
    


    @Test
    void checkLogo(){
        boolean test=home.isLogoVisible();
       
        Assert.assertTrue(test);
    }
    @Test
   void checkSearch(){
       String word="kitchen";
       home.search(word);
       String textResult=home.searchResult();
       Assert.assertTrue(textResult.contains("kitchen"));


   }
   @Test
   void checkSearch1() {
       String word = "kitchen";
       home.search(word);
       String searchUrl = driver.getCurrentUrl();
       Assert.assertTrue(searchUrl.contains(word));
   }


   }


