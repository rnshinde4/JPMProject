@regression
Feature: JP Morgan logo test

@googlesearch 
Scenario Outline: Validate logo on JP Morgan homepage
    Given user navigated to google webpage "<title>"
    When user search for "<search>" and click on relevant search result item
   	Then user should be able to view jpm logo on the page
    
    Examples: 
      | title  | search     |
      | Google | J.P. Morgan |