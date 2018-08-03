#Author: dzarroy@bancolombia.com.co

@tag
Feature: Web Automation in demo site
  I want to use this template for autenticate in demo site

  @tag1
  Scenario: Enter the page Demo site
    Given that Carlos wants to access the Web Automation Demo Site
    When he performs the registration on the page
    Then he verifies that the screen is loaded with text Double Click on Edit Icon to EDIT the Table Row
    
  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
