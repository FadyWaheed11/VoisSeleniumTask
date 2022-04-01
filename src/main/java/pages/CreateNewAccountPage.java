package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateNewAccountPage {
    private final WebDriver driver;

    public CreateNewAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public CreateNewAccountPage clickOnRadioButton() {
        final By mrsRadioButton = By.id("uniform-id_gender2");
        driver.findElement(mrsRadioButton).click();
        return this;
    }

    public CreateNewAccountPage enterPersonalFirstName(String firstName) {
        final By firstNameField = By.id("customer_firstname");
        sendDate(firstNameField, firstName);
        return this;
    }

    public CreateNewAccountPage enterPersonalLastName(String lastName) {
        final By lastNameField = By.id("customer_lastname");
        sendDate(lastNameField, lastName);
        return this;
    }

    public CreateNewAccountPage enterPassword(String password) {
        final By passwordField = By.id("passwd");
        sendDate(passwordField, password);
        return this;
    }

    public CreateNewAccountPage selectDayOfBirth(String day) {
        final By daysDropDownLocator = By.id("days");
        findDropDownElement(daysDropDownLocator).selectByValue(day);
        return this;
    }

    public CreateNewAccountPage selectMonthOfBirth(String month) {
        int monthNumber = Integer.parseInt(month);
        final By monthsDropDownLocator = By.id("months");
        findDropDownElement(monthsDropDownLocator).selectByIndex(monthNumber);
        return this;
    }

    public CreateNewAccountPage selectYearOfBirth(String year) {
        final By yearsDropDownLocator = By.id("years");
        findDropDownElement(yearsDropDownLocator).selectByValue(year);
        return this;
    }

    public CreateNewAccountPage checkNewsLetter() {
        final By checkBoxNewLetterLocator = By.id("newsletter");
        driver.findElement(checkBoxNewLetterLocator).click();
        return this;
    }

    public CreateNewAccountPage checkSpecialOffers() {
        final By checkBoxSpecialOffersLocator = By.id("optin");
        driver.findElement(checkBoxSpecialOffersLocator).click();
        return this;
    }

    public CreateNewAccountPage enterAddressFirstname(String firsName) {
        final By firstNameField = By.id("firstname");
        sendDate(firstNameField, firsName);
        return this;
    }

    public CreateNewAccountPage enterAddressLastName(String lastName) {
        final By lastNameField = By.id("lastname");
        sendDate(lastNameField, lastName);
        return this;
    }

    public CreateNewAccountPage enterCompanyName(String companyName) {
        final By companyNameField = By.id("company");
        sendDate(companyNameField, companyName);
        return this;
    }

    public CreateNewAccountPage enterAddress(String address) {
        final By addressField = By.id("address1");
        sendDate(addressField, address);
        return this;
    }

    public CreateNewAccountPage enterSecondAddress(String secondAddress) {
        final By secondAddressField = By.id("address2");
        sendDate(secondAddressField, secondAddress);
        return this;
    }

    public CreateNewAccountPage enterCity(String cityName) {
        final By cityField = By.id("city");
        sendDate(cityField, cityName);
        return this;
    }

    public CreateNewAccountPage selectState(String stateName) {
        final By stateDropDownLocator = By.id("id_state");
        findDropDownElement(stateDropDownLocator).selectByVisibleText(stateName);
        return this;
    }

    public CreateNewAccountPage enterPostalCode(String postalCode) {
        final By postalCodeField = By.id("postcode");
        sendDate(postalCodeField, postalCode);
        return this;
    }

    public CreateNewAccountPage selectCountry(String countryName) {
        final By countryDropDownLocator = By.id("id_country");
        findDropDownElement(countryDropDownLocator).selectByVisibleText(countryName);
        return this;
    }

    public CreateNewAccountPage enterAdditionalInfo(String info) {
        final By additionalInfoField = By.id("other");
        sendDate(additionalInfoField, info);
        return this;
    }

    public CreateNewAccountPage enterHomePhoneNumber(String homePhoneNumber) {
        final By homePhoneNumberField = By.id("phone");
        sendDate(homePhoneNumberField, homePhoneNumber);
        return this;
    }

    public CreateNewAccountPage enterMobilePhoneNumber(String mobilePhoneNumber) {
        final By mobilePhoneNumberFiled = By.id("phone_mobile");
        sendDate(mobilePhoneNumberFiled, mobilePhoneNumber);
        return this;
    }

    public CreateNewAccountPage enterFutureAddress(String futureAddress) {
        final By futureAddressField = By.id("alias");
        driver.findElement(futureAddressField).clear();
        sendDate(futureAddressField, futureAddress);
        return this;
    }

    public MyAccountPage clickOnRegisterButton(){
        final By registerButton = By.id("submitAccount");
        driver.findElement(registerButton).click();
        return new MyAccountPage(driver);
    }

    private void sendDate(By locator, String data) {
        driver.findElement(locator).sendKeys(data);
    }

    private Select findDropDownElement(By locator) {
        return new Select(driver.findElement(locator));
    }
}
