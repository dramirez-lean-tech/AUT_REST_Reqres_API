#author: Diego Ramirez

@All
Feature: automate the endpoints of the https://reqres.in/ site

  Background:
    Given the user generate token

  @UserCreated
  Scenario: the user created a new user
    When the user create a new user
    Then the user will see the next code 201

  @UserUpdated
  Scenario: the user updated a user
    When the user update a user
    Then the user will see the next code 200

  @RegisterUnsuccessful
  Scenario: the user does not register properly
    When the user adds a wrong email address
    Then the user will see the next code 400

  @UserDeleted
  Scenario: the user deleted a user
    When the user delete a user
    Then the user will see the next code 204

  @UserSummary
  Scenario: the user consults the information of a user
    When the user consults a user
    Then the user will see the next code 200

    