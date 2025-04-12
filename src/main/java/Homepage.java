import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Base {

@FindBy(css = "[id='gh-logo']") WebElement logo;
@FindBy(xpath = "//input[@aria-label='Search for anything']") WebElement search;
@FindBy(css = "[class='srp-controls__count-heading']") WebElement searchResult;


boolean isLogoVisible(){
    return logo.isDisplayed();

}
void search(String text){
    search.sendKeys(text, Keys.ENTER);
}
String searchResult(){
    return searchResult.getText();
}

}
