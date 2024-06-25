Feature: Search box Wikipedia
  @reg
  Scenario: The user is redirected to the search
    Given The user is on Wikipedia
    And The user types Microsoft on the search box
    When The user clicks the Search button
    Then The teacher is redirected to the search
@Smoke
  Scenario: Finding all the anchor links at wiki/microsoft
    Given the user searched for Microsoft on wikipedia
    When the user search for all the anchor links
    Then the anchor links are printed with its respective text