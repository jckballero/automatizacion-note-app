#Autor: Jean Caballero

@stories
Feature: Node App
  As a user, I want to register in node app web with the screenplay automation guide

  @scenario1
  Scenario: Access to node app website
    Given that Jean needs to create an user
    When he enters the registry in the application
      | name  | email          | password | confirmPassword |
      | test4 | test4@mail.com | Abcd1234 | Abcd1234        |
    Then he displays message text "Account Login"

  @scenario2
  Scenario: Login to node app website
    Given that jean needs to be logged
    When he enters his username and password
      | email          | password |
      | test1@mail.com | asdasd   |
    Then he displays text "Notes App"