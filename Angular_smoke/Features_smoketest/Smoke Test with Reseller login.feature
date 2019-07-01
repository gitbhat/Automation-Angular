# Merchant Boarding for creation of Reseller--SalesAgent--MerchantGroup--MerchantAccount
Feature: All Smoke test cases for Angular UI BridgePay


  # Scenario to login as an Admin
  @AdminSmoke
  Scenario: Login to the Application with Reseller login
    Given Open the chrome browser
    When Enter the Angular URL and provide the Reseller login details
    Then Login should be successful



       
    #Scenario: To create a Sales Agent with default user
    @Resellerrrrr
    Scenario: create Sales Agent
    Given Open the chrome browser
    When Enter the Angular URL and provide the Reseller login details
    Then Login should be successful
    Given user has clicked on MerchantBoarding
    When create SalesAgent
    And Sales Agent default user creation
    Then Sales Agent with Default user is created successfully
    Given user has clicked on Merchant Group tab
    When create Merchant Group
    And Merchant Group default user creation
    Then Merchant Group with Default user is created successfully
    Given user has clicked on Merchant Account tab
    When create Merchant Account
    And Merchant Account default user creation
    And configure Merchant Account details
    Then Merchant Account with Default user is created successfully
    
    
     #Scenario: To create a Merchant Group with default user
     @Smoke
    Scenario: create Merchant Group
    Given user has clicked on Merchant Group tab
    When create Merchant Group
    And Merchant Group default user creation
    Then Merchant Group with Default user is created successfully
    
     #Scenario: To create a Merchant Account with default user
     @Smoke
    Scenario: create Merchant Account
    Given user has clicked on Merchant Account tab
    When create Merchant Account
    And Merchant Account default user creation
    And configure Merchant Account details
    Then Merchant Account with Default user is created successfully
