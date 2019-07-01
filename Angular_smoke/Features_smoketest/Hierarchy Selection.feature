# Merchant Boarding for creation of Reseller--SalesAgent--MerchantGroup--MerchantAccount
Feature: All Smoke test cases for Angular UI BridgePay


  # Scenario to login as an Admin
  @AdminSmoke
  Scenario: Login to the Application with Admin login
    Given Open the chrome browser
    When Enter the Angular URL and provide the Admin login details
    Then Login should be successful

  
  #Scenario to Select Hierarchy
  @hierarchy
  Scenario: Hierarchy Selection 
    Given user has clicked on hierarchy picker
    When select the Reseller
  And select the Sales Agent
     And select the Merchant Group
      And select the desired Merchant Account
    Then Display the hierarchy selected
    
     #Scenario to Select VT and Perform Primary Transactions
    Scenario: Perform Primary Transactions 
    Given  Click on VT
    And select Credit sale and perform the transcation
    And select Credit Auth and perform the transcation
    And select Credit Refund and perform the transcation
    And select ACH sale and perform the transcation
    And select Check Sale and perform the transcation
    And select Check Refund and perform the transcation
    And select Check21 sale and perform the transcation
    # And select Check21 Refund and perform the transcation
    And select Cash Sale and perform the transcation
   # And select Cash Refund and perform the transcation
    Then All Primary transcations are Performed
    
    
   