Feature: Submit message via UI

    Background:
    * configure driver = { type: 'chrome' }
    * configure retry = { count: 3, interval: 3000 }

  Scenario: User submits a new message
    Given driver 'http://localhost:8080'
    And input('#title-input', 'Hola Caracola')
    And input('#body-input', 'Que tal estas amigo')
    And click('#submit')

    Then waitFor('#title')
    And match text('#title') == 'Hola Caracola'
    And match text('#body') == 'Que tal estas amigo'
