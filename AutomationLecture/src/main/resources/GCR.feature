Feature: GCR Login

description: Login feature 


Scenario: Valid Login
Given User is on GCR Homepage
When User clicks on the account
And User write username
And User writes password
And User clicks sign in
Then User is signed in  




