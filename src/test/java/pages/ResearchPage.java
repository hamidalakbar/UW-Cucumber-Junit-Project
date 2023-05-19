package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ResearchPage extends PageBase {

    @FindBy(id = "q")
    public WebElement searchForTraining;

    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> allTableRows;

    @FindBy(xpath = "//tbody//td")
    public List<WebElement> allTableData;

    @FindBy(xpath = "//tbody//td[1]")
    public List<WebElement> nameColumnData;
}
