Feature: Questionnaire 1 - Is it Friday yet?
  Everybody wants to know when it's Friday

  Scenario: Q1 Sunday isn't Friday
    Given today is "Sunday"
    When I ask whether it's Friday yet
    Then I should be told "Nope"

  Scenario: Q2 Friday is Friday
    Given today is "Friday"
    When I ask whether it's Friday yet
    Then I should be told "TGIF"