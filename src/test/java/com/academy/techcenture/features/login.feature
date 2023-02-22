Feature: Test Register User Functionality

Scenario: Check user register functionality works properly
  Given browser is open
  And the user is on a home page
  Then user clicks on sing up button log in button
  Then user is been navigated to login page
  Then user enters name and email
  And user clicks sing up
  Then user navigates to create an account page
  Then user enters <Title>, <Name>, <Email>, <Password>, <Date of birth>
  Then user  Select checkbox 'Sign up for our newsletter!'
  Then user Select checkbox 'Receive special offers from our partners!
  Then user Fill details: <First name>, <Last name>, <Company>, <Address>, <Address2>, <Country>, <State>, <City>, <Zipcode>, <Mobile>
  Then user Clicks 'Create Account button'
  Then user navigated to account created successfully page
  Then user clicks continue button
  Then user navigated to the home page


