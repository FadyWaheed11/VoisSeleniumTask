package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {
    private final WebDriver driver;
    private final By proceedToCheckOutSummeryLocator = By.xpath("//*[text()='Proceed to checkout']");
    private final By proceedToCheckOutAddressLocator = By.name("processAddress");
    private final By agreeTermsCheckBoxLocator = By.id("uniform-cgv");
    private final By proceedToCheckOutShippingLocator = By.name("processCarrier");

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public PaymentPage goToPayment(){
        clickOnButton(proceedToCheckOutSummeryLocator);
        clickOnButton(proceedToCheckOutAddressLocator);
        clickOnButton(agreeTermsCheckBoxLocator);
        clickOnButton(proceedToCheckOutShippingLocator);
        return new PaymentPage(driver);
    }

    private void clickOnButton(By locator){
        driver.findElement(locator).click();
    }
}
