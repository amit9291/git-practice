package com.IthPharma.pages;


import com.IthPharma.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

/**
 * Created by Ashish Mor
 */
public class IthPharma extends Utility {
    private static final Logger log = LogManager.getLogger(IthPharma.class.getName());

    // insitialise
    public IthPharma() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup

//    @FindBy(xpath = "//li[@xpath='1']")
    @FindBy(xpath = "//header/ul[1]/li[1]/a[1]/span[1]/span[1]")
    WebElement home;



    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'COVID 19')]")
    WebElement verifyText;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registerPage;

    @CacheLookup
    @FindBy(xpath= "/html/body/main/div/div/div/form/div[2]/div/div/input")
    WebElement enterUserName;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"4545907714\"]")
    WebElement Lastname;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"4545910786\"]")
    WebElement companyName;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"4545908738\"]")
    WebElement email;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"4545914882\"]")
    WebElement phoneNumber;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"4586371074\"]")
    WebElement order;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"4586383362\"]")
    WebElement message;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"submit_button\"]")
    WebElement arrangeCall;


    public void IclickOnHome() {
        log.info("I click On WhoWeAre");
        mouseHoverToElement(home);
        clickOnElement(home);
    }


    public String IIverifyText() {
        log.info("I verify Text" + verifyText);
        String actualMessage = getTextFromElement(verifyText);
        return actualMessage;
    }


    public void IclickOnRegisterPage() {
        log.info("I click Registered Page" + registerPage);
        clickOnElement(registerPage);
    }

    public void IEnterUserName(String enterUsername) {
        String currentHandle= driver.getWindowHandle();
        Set<String> handles=driver.getWindowHandles();
        for(String actual: handles) {
            if(!actual.equalsIgnoreCase(currentHandle)) {
//Switch to the opened tab
                driver.switchTo().window(actual);
//opening the URL saved.
               // driver.get(urlToClick);
            }
        }
        log.info("I enter UserName " + enterUserName);
        sendTextToElement(enterUserName, enterUsername);

    }

    public void IEnterLastName(String enterLastName) {
        log.info("I enter Last name " + Lastname);
        sendTextToElement(Lastname, enterLastName);

    }

    public void IEnterCompanyName(String enterCompanyName) {
        log.info("I enter Company name  " + companyName);
        sendTextToElement(companyName, enterCompanyName);

    }

    public void IEnterBusinessEmail(String enterBusinessEmail) {
        log.info("I enter Busienss Email " + email);
        sendTextToElement(email, enterBusinessEmail);
    }

    public void IEnterPhoneNumber(String enterPhoneNumber) {
        log.info("I enter Phone number " + phoneNumber);
        sendTextToElement(phoneNumber, enterPhoneNumber);
    }

    public void IEnterTotalOrder(String enterTotalOrder) {
        log.info("I enter total order " + order);
        sendTextToElement(order, enterTotalOrder);

    }

    public void IEnterMessage(String enterMessage) {
        log.info("I enter Message " + message);
        sendTextToElement(message, enterMessage);
    }

    public void IclickOnArrangeYourCall() {
        log.info("I click On Arrange your call " + arrangeCall);
        clickOnElement(arrangeCall);

    }
}