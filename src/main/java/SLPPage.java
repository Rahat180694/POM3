import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SLPPage extends Base{

        @FindBy(xpath = "//button[@aria-controls='nid-cdl-4-content']")
        WebElement sortOption;
        String optionValue="Sort: Price + Shipping: lowest first";
        void sortByprice() {
            dropdown(sortOption, optionValue);
        }
        }
