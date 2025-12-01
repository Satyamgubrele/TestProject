Feature: Open Google using Playwright

  Scenario: Frames Handling
    Given I open "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get" in playwright
    When I switch to frame
    When I handle Tab and Popup
