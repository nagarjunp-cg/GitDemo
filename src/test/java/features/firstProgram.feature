Feature: Application Login

#Scenario: Admin page default login
#Given User is on NetBanking landing page
#When User login into application with "admin" and password "1234"
#Then Home page is displayed
#And Cards are displayed
#
#
#Scenario: User Page default login
#Given User is on NetBanking landing page
#When User login into application with "user" and password "0953"
#Then Home page is displayed
#And Cards are displayed

Scenario Outline: user page default login
Given User is on NetBanking landing page
When User login into application with "<Username>" and password "<Password>"
Then Home page is displayed
And Cards are displayed
Examples: 
|Username| Password|
|debituser|hello12|
|credituser|lpo213|

Scenario: User Page default Sign up

Given User is on Practice landing page
When User Signup into application
|nagarjun|
|prakash|
|contact@email.com|
|8838870213|
Then Home page is displayed
And Cards are displayed




