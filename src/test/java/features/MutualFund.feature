Feature: Verify a New User can successfully Register an Account

Scenario: New User Register on MutualFund

Given Launch the Browser and open the SBIMutualFund page
When I click here to Register
Then I Enter the First Name
And I Enter the Last Name
Then I Enter my Email Address
And Click on Submit
#Then Set a New Password
#And Enter confirm Password
Then Close the Browser