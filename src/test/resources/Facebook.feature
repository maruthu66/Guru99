@Run
Feature: Creating a Facebook Account

  Background:
    Given launch Facebook "https://www.facebook.com/"

  Scenario Outline: Creating New Account
    When Click create new account butt on
    And Create User Name "<First name>"
    And Create User sur Name "<Last name>"
    And Enter Mobile number or email id "<Phone no or email>"
    And Create password "<password>"
    And Click Date of Birth
    And Select month
    And select year
    And Click Gender
    Then Click SignUp "<SS>"

  Examples:
    | First name | Last name | Phone no or email     | password       |SS|
    | Maruthu     | Pandi     | 966662347           | 783683456459   |temp1|
    | Raja         |Ram       |9458496787          |84573495709      |temp2|
     | subash     | Pandi     | 966662547           | 78368345459   |temp3|
     | Rocky    | Ravi    | 966662367           | 78368345645   |temp4|