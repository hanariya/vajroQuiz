@quiz-home-page
Feature: Quiz flow test
  
  @quiz-e2e-test
  Scenario: Validate Quiz Flow
    Given I am on the home page "https://www.vajro.com/quiz" of vajro website
    When I select the category of the product as Sports
    And I select the average revenue
    And I select the peers in my industry
    And I select the traffic i get every month
    And I select percentage of online session from mobile
    And I select the products that customers are interested
    And I select repeat percentage of customers
    And I select impulse purchase of customers
    And I select number of followers in social media
    Then I enter my store name as "Happy Stores"
    And I enter the email as "abc@xyz.com" and click submit