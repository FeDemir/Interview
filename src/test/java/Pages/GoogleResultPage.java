package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleResultPage extends BasePage{
    @FindBy (id = "result-stats")
    public WebElement resultStats;
}
