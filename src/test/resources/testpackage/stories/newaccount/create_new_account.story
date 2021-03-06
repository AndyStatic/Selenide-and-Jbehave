Narrative:
As a user
I want to create new account
So that I can continue using website's functionality as registered user

Narrative: Lifecycle:
Narrative: Before:
Narrative: Given I open Sign In page
Narrative: This will be executed before each scenario

Scenario: create new account
Meta: @skip
Given I open Sign In page
When I enter email for create an account "<account>"
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
Examples:
|account        |
|hmrc57@test.com|
|hmrc58@test.com|

Scenario: create new account 2
Meta: @skip
Given I open Sign In page
When I enter email for create an account "hmrc55@test.com"
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

Scenario: create new account 3
Given I open Sign In page
When I enter email for create an account "hmrc60@test.com"
And I press Submit Create button
And Create New Account page is opened
And I enter fullname
|firstname|lastname|
|Hello    |World   |
And I enter password for create an account "Qwerty"
And I enter address1 for create an account "Test Str 123"
And I enter city for create an account "London"
And I select state for create an account "Alaska"
And I enter postcode for create an account "00000"
And I enter mobile phone for create an account "123456789"
And I press Submit Account button
Then there is no error message displayed