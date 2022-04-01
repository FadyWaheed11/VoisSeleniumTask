package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage {
    private final WebDriver driver;
    private final By payByBankWireLocator = By.xpath("//a[@title='Pay by bank wire']");
    private final By confirmButtonLocator = By.xpath("//span[text()='I confirm my order']");
    public PaymentPage(WebDriver driver) {
        this.driver = driver;
    }

    public PaymentPage choosePayByBankWire(){
        driver.findElement(payByBankWireLocator).click();
        return this;
    }

    public HomePage confirmPayment(){
        driver.findElement(confirmButtonLocator).click();
        driver.navigate().to("http://automationpractice.com/index.php?controller=my-account");
        return new HomePage(driver);
    }
}
