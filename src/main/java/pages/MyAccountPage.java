package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MyAccountPage {
    private final WebDriver driver;
    private final By womenCategoryLocator = By.xpath("//a[@title='Women']");
    private final By blousesSubCategoryLocator = By.xpath("//a[@title='Blouses']");

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public BlousesCategoryPage selectBlousesCategory() {
        final Actions actions = new Actions(driver);
        WebElement womenCategory = driver.findElement(womenCategoryLocator);
        actions.moveToElement(womenCategory).perform();
        driver.findElement(blousesSubCategoryLocator).click();
        return new BlousesCategoryPage(driver);
    }
}
