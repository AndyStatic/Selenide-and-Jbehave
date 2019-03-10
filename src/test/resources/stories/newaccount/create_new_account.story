Meta:

Narrative:
As a user
I want to create new account
So that I can continue using website's functionality as registered user

Scenario: create new account
Given I open Sign In page
When I enter email for create an account "hmrc52@test.com"
And I press Submit Create button
And Create New Account page is opened
And I enter firstname for create an account "Hello"
And I enter lastname for create an account "World"
And I enter password for create an account "Qwerty"
And I enter address1 for create an account "Test Str 123"
And I enter city for create an account "London"
And I select state for create an account "Alaska"
And I enter postcode for create an account "00000"
And I enter mobile phone for create an account "123456789"
And I press Submit Account button
Then there is no error message displayed