#Autor: Jean Caballero

@stories
Feature: Note App
  As a user, I want to create note in Note App with the screenplay automation guide

  Background: Login to page Note App
    Given that Jean starts session in Note App
      | email          | password |
      | test1@mail.com | asdasd   |
    Then Displays the "Notes" navigation menu

  @scenario1
  Scenario: Access to session
    Given that Jean needs to create a note
    When he enters the data
      | title | descriptionNote              |
      | Nota1 | descripcion de la nota 1 |
    Then he displays text "Notes App"