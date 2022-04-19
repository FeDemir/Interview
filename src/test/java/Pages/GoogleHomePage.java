package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleHomePage extends BasePage{
    @FindBy (name = "q")
    public WebElement  searchInput;
    @FindBy (name = "btnK")
    public WebElement searchBtn;
    public void search(String keyword){
        searchInput.sendKeys(keyword);
        searchBtn.click();
    }
}
