# Autor: Daniel Herrera Gomez

  @stories
  Feature: Academy Choucair
    As a user, I want to learn how to automate in screamplay at the Choucair Academy with the automation course

  @scenario1
  Scenario: Search for a automation course
    Given than brandon wants to learn automation at the academy Choucair
      | strUser     | strPassword |
      | 1152456559  | Choucair2020* |
    When he search for the course  on Choucair academy platform
      | strCourse |
      | Metodologia Bancolombia |
    Then he finds the course called resources
      | strCourse |
      | Metodologia Bancolombia |