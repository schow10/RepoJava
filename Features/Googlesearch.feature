@googleSearch
Feature: Google search

Scenario Outline: simple search

Given I am on google homepage
When I enter search "<term>"
And I click on google search button
Then I receive relevant results 

Examples:
|term								|
|Quality Assurance	|
|Software Testing		|
