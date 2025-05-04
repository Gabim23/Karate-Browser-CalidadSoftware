Feature: Wikipedia Search Functionality
  As a Wikipedia user
  I want to search for information about Rafa Nadal
  So that I can read about the tennis player

  Background:
    * configure driver = { type: 'chrome' }
    * configure retry = { count: 3, interval: 3000 }

  Scenario: Search for Rafa Nadal on Wikipedia
    Given driver 'https://www.wikipedia.org/'
    And delay(3000)  


    # Wait until the search input is visible
    When waitFor('input[name=search]')
    * delay(3000)
    And input('input[name=search]', 'Rafa Nadal')

    # Wait until the submit button is clickable and click
    And waitFor("button[type='submit']")
    And click("button[type='submit']")

    # Wait until the content area is loaded on the result page
    Then waitFor('#mw-content-text')

    # Check that content contains the expected keyword (adjust as needed)
    And match text('#mw-content-text') contains 'Nadal'
