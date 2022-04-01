package test;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.OrderHistoryPage;
import utils.DataDriven;

public class ECommerceTests extends BaseTests {
    @Test(dataProviderClass = DataDriven.class, dataProvider = "test-data")
    public void validateOrder(String firstname, String lastName, String password
            , String day, String month, String year, String addressFirstName
            , String addressLastName, String companyName, String address
            , String detailedAddress, String city, String state, String postalCode
            , String country, String additionalInfo, String homePhoneNumber
            , String mobilePhoneNumber, String futureAddress) {
        OrderHistoryPage orderHistoryPage = homePage.clickOnSignIn()
                .authenticateEmail(getRandomEmail())
                .clickOnRadioButton()
                .clickOnRadioButton()
                .enterPersonalFirstName(firstname)
                .enterPersonalLastName(lastName)
                .enterPassword(password)
                .selectDayOfBirth(day)
                .selectMonthOfBirth(month)
                .selectYearOfBirth(year)
                .checkNewsLetter()
                .checkSpecialOffers()
                .enterAddressFirstname(addressFirstName)
                .enterAddressLastName(addressLastName)
                .enterCompanyName(companyName)
                .enterAddress(address)
                .enterSecondAddress(detailedAddress)
                .enterCity(city)
                .selectState(state)
                .enterPostalCode(postalCode)
                .selectCountry(country)
                .enterAdditionalInfo(additionalInfo)
                .enterHomePhoneNumber(homePhoneNumber)
                .enterMobilePhoneNumber(mobilePhoneNumber)
                .enterFutureAddress(futureAddress)
                .clickOnRegisterButton()
                .selectBlousesCategory()
                .addToCart()
                .proceedToCheckOut()
                .goToPayment()
                .choosePayByBankWire()
                .confirmPayment()
                .clickOnOrderHistory();
        Assert.assertTrue(orderHistoryPage.orderIsVisible());
    }
}
