# Merchant Boarding for creation of SalesAgent--MerchantGroup--MerchantAccount and perform Primary 
#Transactions with Reseller login
Feature: All Regression scenarios with Reseller Login


  #Scenario: All Regression scenarios with Reseller Login
    @Reseller
    Scenario: create Sales Agenttt
    Given Open the chrome browser
    When Enter the Angular URL and provide the Reseller login details
    #Then Login should be successful
    And user clicked on MB
    And  create a Reseller Regular user
    When create SalesAgent
    And Sales Agent default user creation
    And SalesAgent regular user creation
    Then Sales Agent with Default user is created successfully
    Given user has clicked on Merchant Group tab
    When create Merchant Group
    And Merchant Group default user creation
    And Merchant Group regular user creation
    Then Merchant Group with Default user is created successfully
    Given user has clicked on Merchant Account tab
    When create Merchant Account
    And Merchant Account default user creation
    And configure Merchant Account details
    And Create Merchant Account Regular user
    Then Merchant Account with Default and Regular user is created successfully
    
   # Create Merchant Group Directly Under a Reseller
   When Click on close
   When Click on close
   When Click on close
     And create Merchant Group under Reseller
    And Reseller Merchant Group default user creation
    And Reseller Merchant Group regular user creation
    Then Reseller Merchant Group with Default user is created successfully
    Given user has clicked on Merchant Account tab
    When create Merchant Account
    And Merchant Account default user creation
    And configure Merchant Account details
    And Create Merchant Account Regular user
    Then Merchant Account with Default and Regular user is created successfully
    