Feature:  Expedia Search Functionality
Scenario: 
  Background:
    Given user is on Expedia home page
//https://github.com/praveenpala/roundtrip_flight_search.git
  @negative
  Scenario: Verify the user gets an error message when searching for past-date flights
    And user should select the flights tab
    And user selects Columbus, OH airport for departure city airport field
    And user selects Portland, OR airport for arrival city airport field
    And user selects a past date for the flight date
    And user clicks on search button
    Then verify that "The start or end date is prior to the current date." error message is displayed

  @regression
  Scenario Outline: Verify the user finds the correct departure flight details
    And user should select the flights tab
    And user selects <departure_airport> airport for departure city airport field
    And user selects <arrival_airport> airport for arrival city airport field
    And user selects a future date for the flight date
    And user clicks on search button
    And waits for the search results to load
    Then verify the flight search results <results_msg> is displayed correctly
    Examples:
      | departure_airport | arrival_airport | results_msg                         |
      | Columbus, OH      | Cleveland, OH   | Select your departure to Cleveland  |
      | Cleveland, OH     | Portland, ME    | Select your departure to Portland   |
      | Columbus, OH      | Phoenix, AZ     | Select your departure to Phoenix    |
      | Phoenix, AZ       | Portland, OR    | Select your departure to Portland   |

  @negative
  Scenario: Verify different error message are displayed when searching using invalid or incomplete data
    And user should select the flights tab
    And user selects a past date for the flight date
    And user clicks on search button
    Then verify the following error messages are displayed
    | error_messages                                             | dates   |
    | The start or end date is prior to the current date.        | past    |
    | Please complete the highlighted origin field below.        | future  |
    | Please complete the highlighted destination field below.   | future  |

  @regression
  Scenario: Verify the user gets the search results sorted in lowest to highest price
    And user should select the flights tab
    And user selects Columbus, OH airport for departure city airport field
    And user selects Portland, OR airport for arrival city airport field
    And user selects a future date for the flight date
    And user clicks on search button
    And waits for the search results to load
    Then verify the results are sorted from lowest to highest price order



