Feature: Test login
  Background: Login functionality
    Given  browser is open
    And the user is on a home page
Scenario: Login User with correct email and password
When user clicking on Signup Login button
And  user Verifies Login to your account is visible
Then user Enter correct email address and password
And  user  Clicks login button
Then user verify  log in success is visible