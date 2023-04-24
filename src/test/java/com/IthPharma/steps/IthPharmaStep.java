package com.IthPharma.steps;


import com.IthPharma.pages.IthPharma;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static com.IthPharma.browserfactory.ManageBrowser.driver;

/**
 * Created by Ashish Mor
 */
public class IthPharmaStep {
    @Given("^As a user I am on Homepage$")
    public void asAUserIAmOnHomepage() {

    }

    @When("^I click On Home$")
    public void iClickOnHome() {
        new IthPharma().IclickOnHome();
    }


    @And("^I verify text \"([^\"]*)\"$")
    public void iVerifyText(String expectedMessage) {
        Assert.assertEquals("messase is not display", expectedMessage, new IthPharma().IIverifyText());

    }

    @And("^I click On registered Page$")
    public void iClickOnRegisteredPage() {
//        this method will mousehoover and wait intil click
        By by = By.xpath("//a[contains(text(),'Register')]");
        Actions action = new Actions(driver);
        WebElement elem = driver.findElement(by);
        action.moveToElement(elem);
        action.perform();
        new IthPharma().IclickOnRegisterPage();


    }


    @And("^I enter Username \"([^\"]*)\"$")
    public void iEnterUsername(String enterUsername) {
        new IthPharma().IEnterUserName(enterUsername);

    }


    @And("^I enter Last name \"([^\"]*)\"$")
    public void iEnterLastName(String enterLastName) {
        new IthPharma().IEnterLastName(enterLastName);

    }


    @And("^I enter Company Name \"([^\"]*)\"$")
    public void iEnterCompanyName(String enterCompanyName) {
        new IthPharma().IEnterCompanyName(enterCompanyName);

    }

    @And("^I enter Business email \"([^\"]*)\"$")
    public void iEnterBusinessEmail(String enterBusinessEmail) {
        new IthPharma().IEnterBusinessEmail(enterBusinessEmail);

    }

    @And("^I enter Phone Number \"([^\"]*)\"$")
    public void iEnterPhoneNumber(String enterPhoneNumber) {
        new IthPharma().IEnterPhoneNumber(enterPhoneNumber);

    }


    @And("^I enter total Order \"([^\"]*)\"$")
    public void iEnterTotalOrder(String enterTotalOrder) {
        new IthPharma().IEnterTotalOrder(enterTotalOrder);


    }

    @And("^I enter Message \"([^\"]*)\"$")
    public void iEnterMessage(String enterMessage) {
        new IthPharma().IEnterMessage(enterMessage);

    }

    @And("^I click On Arrange Your Call$")
    public void iClickOnArrangeYourCall() {
        new IthPharma().IclickOnArrangeYourCall();
    }


}
