Feature: Home page Testing


  Scenario: As a user i want to verify Home page
    Given As a user I am on Homepage
    When I click On Home
    And I verify text "COVID 19"
    And I click On registered Page
    And I enter Username "Himesh"
    And I enter Last name "Mor"
    And I enter Company Name " Mor And Mor "
    And I enter Business email "ashu.soft.tech007@gmail.com"
    And I enter Phone Number "07377135736 "
    And I enter total Order "2000"
    And I enter Message " Hello, I'm curious about your service. Please schedule a call at this number: 07377135736 "
    And I click On Arrange Your Call


