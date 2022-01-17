package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageActions.QuizPageActions;
import utils.SeleniumDriver;

public class QuizSteps {
	
	QuizPageActions actionsPage = new QuizPageActions();
	
	@Given("I am on the home page {string} of vajro website")
	public void i_am_on_the_home_page_of_vajro_website(String websiteUrl) throws InterruptedException {
		SeleniumDriver.openPage(websiteUrl);

	}

	@When("I select the category of the product as Sports")
	public void i_select_the_category_of_the_product_as_sports() throws InterruptedException {
		actionsPage.chooseCategory();
	}

	@And("I select the average revenue")
	public void i_select_the_average_revenue() throws InterruptedException {
	   actionsPage.chooseRevenue();
	}

	@And("I select the peers in my industry")
	public void i_select_the_peers_in_my_industry() throws InterruptedException {
	   actionsPage.choosePeersInfo();
	}

	@And("I select the traffic i get every month")
	public void i_select_the_traffic_i_get_every_month() throws InterruptedException {
	   actionsPage.chooseTrafficInfo();
	}

	@And("I select percentage of online session from mobile")
	public void i_select_percentage_of_online_session_from_mobile() throws InterruptedException {
	   actionsPage.chooseOnlineSalesPercentage();
	}

	@And("I select the products that customers are interested")
	public void i_select_the_products_that_customers_are_interested() throws InterruptedException {
	   actionsPage.chooseProductSellingInfo();
	}

	@And("I select repeat percentage of customers")
	public void i_select_repeat_percentage_of_customers() throws InterruptedException {
	   actionsPage.chooseRepeatCustomerPercentage();
	}

	@And("I select impulse purchase of customers")
	public void i_select_impulse_purchase_of_customers() throws InterruptedException {
	  actionsPage.chooseImpulsePurchase();
	}

	@And("I select number of followers in social media")
	public void i_select_number_of_followers_in_social_media() throws InterruptedException {
	   actionsPage.chooseSocialMediaFollowersCount();
	}

	@Then("I enter my store name as {string}")
	public void i_enter_my_store_name_as(String name) throws InterruptedException {
	  actionsPage.enterName(name);
	}

	@And("I enter the email as {string} and click submit")
	public void i_enter_the_email_as_to_send_report(String email) throws InterruptedException {
	   actionsPage.enterEmailAndSubmit(email);
	}

}
