package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ResearchPage extends PageBase {

    @FindBy(id = "q")
    public WebElement searchForTraining;

    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> records;
}
