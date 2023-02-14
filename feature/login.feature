Feature: login page

  @sanity
  Scenario: login with valid credentials
    Given launch "chrome" browser
    And enter "www.facebook.com"
    And click on enter
