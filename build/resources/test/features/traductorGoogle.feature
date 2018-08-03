#Author: dzarroy@bancolombia.com.co

@tag
Feature: Traductor de google
  Como usuario quiero ingresar a google para traducir palabras en diferentes idiomas

  @tag1
  Scenario: Traducir de ingles a espanol
    Given El usuario quiere usar el traductor de google
    When traduce la palabra table de ingles a espanol
    Then Se debe mostrar la palabra mesa en la pantalla
  

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
