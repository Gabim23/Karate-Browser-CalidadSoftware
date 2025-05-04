Feature: Submit message via UI with no title

  Background:
    * configure driver = { type: 'chrome' }
    * configure retry = { count: 3, interval: 3000 }

  Scenario: Message should not be created when title is empty
    Given driver 'http://localhost:8080'
    * delay(3000) 

    And input('#title-input', '')  
    * delay(3000) 

    And input('#body-input', 'Sebas')
    * delay(3000) 

    And click('#submit')
    * delay(3000) 

    Then match text('#messages') !contains 'Sebas'