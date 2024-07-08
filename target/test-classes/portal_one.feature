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
Feature: Few activities on Naukri portal
Scenario: Login into the naukri portal, search a jobs by single selected criteria
Given The user navigate to https://www.naukri.com/
When user enter valid email "mayuresh.rajopadhye@gmail.com"
And valid password "Mayuresh@90"
Then click on complete profile button & update few information & perform few operations  
