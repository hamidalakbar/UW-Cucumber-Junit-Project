package edu.washington.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class BrowserUtils {

    /**
     * This class will be storing only the utility methods that can be used across the project
     */

    /*
     For pausing executing of our program for given seconds. --> Takes int seconds <-- Return type void
     */
    public static void sleep(double seconds) {
        try {
            Thread.sleep((long) (seconds * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    /*
    Will switch between windows by using window handles and look for the web page with the given as first argument text
    in its URL and verify if the title contains given as a second argument text.
    --> Takes 3 parameters: WebDriver instance, String text in URL, String text in title
    <-- Return type void. Will assert: 1. URL of one of the windows contains given text
                                       2. Title of that web page contains given text
     */
    public static void switchWindowAndVerify(String expectedInUrl, String expectedInTitle) {

        // To get all window handles as a Set of Strings
        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();

        for (String eachWindowHandle : allWindowHandles) {
            // Switching to window by using its handle
            Driver.getDriver().switchTo().window(eachWindowHandle);
            // Condition
            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl)) {
                // To get a title as a String
                String actualTitle = Driver.getDriver().getTitle();
                // Verification of title
                Assert.assertTrue(actualTitle.contains(expectedInTitle));
                break;
            }
        }
    }

    /*
    Will verify if the web page title matches with the one given as a String parameter title
    --> Takes String as an expected title
    <-- Return type void. Does assertion of actual title vs expected title
     */
    public static void verifyTitle(String expectedTitle) {
        // Getting actual title
        String actualTitle = Driver.getDriver().getTitle();
        // Assertion
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    /*
   Will verify if the web page title contains given as a String parameter text
   --> Takes String as an expected text in title
   <-- Return type void. Does assertion if title contains given text
    */
    public static void verifyTitleContains(String expectedInTitle) {
        // Getting actual title
        String actualTitle = Driver.getDriver().getTitle();
        // Assertion
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

    /*
    Will wait for 10 seconds until element that is given as a parameter disappears from website
        --> Takes WebElement as a parameter
        <-- return type void
     */
    public static void waitForInvisibilityOf(WebElement target) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(target));
    }

    public static void waitForElementToBeClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void verifyUrlContains(String text) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(text));
    }
}
