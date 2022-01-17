package pageActions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pageLocators.QuizPageLocators;
import utils.SeleniumDriver;

public class QuizPageActions {

	QuizPageLocators locatorsPage;
	Actions actions;

	public QuizPageActions() {
		locatorsPage = new QuizPageLocators();
		actions = new Actions(SeleniumDriver.getDriver());
		PageFactory.initElements(SeleniumDriver.getDriver(), locatorsPage);
	}

	public void chooseCategory() {
		SeleniumDriver.getDriver().switchTo().frame(locatorsPage.frameElement);
		SeleniumDriver.waitForElement(locatorsPage.sportsCategoryButton);
		locatorsPage.sportsCategoryButton.click();
	}

	public void chooseRevenue() {
		SeleniumDriver.waitForElement(locatorsPage.revenueButton);
		locatorsPage.revenueButton.click();
	}

	public void choosePeersInfo() {
		SeleniumDriver.waitForElement(locatorsPage.peersInformation);
		locatorsPage.peersInformation.click();
	}

	public void chooseTrafficInfo() {
		SeleniumDriver.waitForElement(locatorsPage.trafficInformation);
		locatorsPage.trafficInformation.click();
	}

	public void chooseOnlineSalesPercentage() {
		SeleniumDriver.waitForElement(locatorsPage.onlineSalesPercentage);
		locatorsPage.onlineSalesPercentage.click();
	}

	public void chooseProductSellingInfo() {
		SeleniumDriver.waitForElement(locatorsPage.productSellingInfo);
		locatorsPage.productSellingInfo.click();
	}

	public void chooseRepeatCustomerPercentage() {
		SeleniumDriver.waitForElement(locatorsPage.repeatCustomerPercentage);
		locatorsPage.repeatCustomerPercentage.click();
	}

	public void chooseImpulsePurchase() {
		SeleniumDriver.waitForElement(locatorsPage.impulsePurchase);
		locatorsPage.impulsePurchase.click();
	}

	public void chooseSocialMediaFollowersCount() {
		SeleniumDriver.waitForElement(locatorsPage.socialMediaFollowersCount);
		locatorsPage.socialMediaFollowersCount.click();
	}

	public void enterName(String name) {
		SeleniumDriver.waitForElement(locatorsPage.nameInputTextBox);
		locatorsPage.nameInputTextBox.sendKeys(name);
		locatorsPage.nameInputTextBox.sendKeys(Keys.ENTER);
	}

	public void enterEmailAndSubmit(String email) {
		SeleniumDriver.waitForElement(locatorsPage.emailInputTextBox);
		locatorsPage.emailInputTextBox.sendKeys(email);
		String keysPressed = Keys.chord(Keys.CONTROL, Keys.RETURN);
		locatorsPage.emailInputTextBox.sendKeys(keysPressed);
	}

}
