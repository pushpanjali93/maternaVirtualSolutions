Feature: verify the google search

  Scenario Outline: search using google with right number of position
    Given Navigate to the page
    When Handle the page cookies
    Then Search on the page '<searchName>'
    And Verify the page using title
    Then Click on the <position> link

    Examples:
      | searchName  | position |
      | Active sync | 0        |

  Scenario Outline: search using google with wrong number of position
    Given Navigate to the page
    When Handle the page cookies
    Then Search on the page '<searchName>'
    And Verify the page using title
    Then Click on the <position> link

    Examples:
      | searchName  | position |
      | Active sync | 4        |
