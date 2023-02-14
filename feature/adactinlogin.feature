Feature: To validate login

  Scenario: To validate valid credentials to login
    Given starts "chrome" browser
    And open "https://adactinhotelapp.com/" url
    When enter username "maheshraju" using id "username"
    And enter password "Kshatriyas5@adactin" using id "password"
    Then click on login using id "login"
    When successful verify title "Welcome to Adactin Group of Hotels"
    
@wip
  Scenario Outline: To validate login with invalid credentials
    Given starts "chrome" browser
    And open "https://adactinhotelapp.com/" url
    When enter username '<user>' using id "username"
    And enter password '<pass>' using id "password"
    Then click on login using id "login"
    When successful verify title "Welcome to Adactin Group of Hotels"

    Examples: 
      | user       | pass                |
      | mahesh     | mahesh123           |
      | nareshraju | ktysnasdg           |
      | maheshraju | Kshatriyas5@adactin |
