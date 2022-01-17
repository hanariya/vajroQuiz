package pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuizPageLocators {
	
	@FindBy(xpath="//div[contains(text(),'Sports')]")
	public WebElement sportsCategoryButton;
	
	@FindBy(xpath="//div[contains(text(),'$5,000 - $20,000')]")
	public WebElement revenueButton;
	
	@FindBy(xpath="//*[@data-qa='iframe']")
	public WebElement frameElement;
	
	@FindBy(xpath="//div[contains(text(),'No')]")
	public WebElement peersInformation;
	
	@FindBy(xpath="//div[contains(text(),'5000-10000')]")
	public WebElement trafficInformation;
	
	@FindBy(xpath="//div[contains(text(),'30-60%')]")
	public WebElement onlineSalesPercentage;
	
	@FindBy(xpath="//div[contains(text(),'Some of them')]")
	public WebElement productSellingInfo;
	
	@FindBy(xpath="//div[contains(text(),'15 – 30%')]")
	public WebElement repeatCustomerPercentage;
	
	@FindBy(xpath="//div[contains(text(),'Yes')]")
	public WebElement impulsePurchase;
	
	@FindBy(xpath="//div[contains(text(),'10,000-20,000')]")
	public WebElement socialMediaFollowersCount;
	
	@FindBy(xpath="//input[@placeholder='Type your answer here...']")
	public WebElement nameInputTextBox;
	
	@FindBy(xpath="//input[@name='email']")
	public WebElement emailInputTextBox;
	
	@FindBy(xpath="//span[contains(text(),'Submit')]")
	public WebElement submitButton;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
