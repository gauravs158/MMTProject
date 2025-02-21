#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template


Feature: Basic happy path

Scenario: Check if the user is able to enter details into the fields
    Given the user is in MakeMyTrip homepage
    When the user clicks oneWay
    And the user enters fromCity details
    And the user enters toCity details
    And the user enters departure date
    And the user enters number of adults as two
    And the user enters number of children as two
    And the user enters number of infants as two
    And the user chooses FirstClass in travel class
    And the user clicks Apply button
    Then total number of travellers is displayed as six

