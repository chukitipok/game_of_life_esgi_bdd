Feature: Evolve

  Scenario: Stay alive

    Given The following population
      |*|*|*|
      |*|.|*|
      |*|*|*|
    When Evolving to the next generation
    Then The new population should be
      |*|.|*|
      |.|.|.|
      |*|.|*|

  Scenario: Reborn

    Given The following population
      |.|.|.|
      |*|.|*|
      |.|*|.|
    When Evolving to the next generation
    Then The new population should be
      |.|.|.|
      |.|*|.|
      |.|.|.|

  Scenario: Overcrowding

    Given The following population
      |.|*|.|
      |*|*|*|
      |.|*|.|
    When Evolving to the next generation
    Then The new population should be
      |*|*|*|
      |*|.|*|
      |*|*|*|

  Scenario: Underpopulation

    Given The following population
      |.|*|.|
      |.|*|.|
      |.|.|.|
    When Evolving to the next generation
    Then The new population should be
      |.|.|.|
      |.|.|.|
      |.|.|.|
