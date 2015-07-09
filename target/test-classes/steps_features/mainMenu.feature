Feature: Main Menu

  @valid
  Scenario: Swap photo
    Given I am logged
    When  I enter in Perfil
    And   I add a photo
    Then  Upload photo done

  Scenario: Buitrear
    Given I am logged
    When I write a girl
    Then I wait response

