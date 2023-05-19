package edu.washington.pages;

import edu.washington.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class PageBase {

    public PageBase() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
