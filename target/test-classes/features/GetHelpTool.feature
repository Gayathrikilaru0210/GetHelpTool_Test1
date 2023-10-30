Feature: GetHelpTool

  @sanity
  Scenario: GetHelp_Below_16
    Given browser is launched
    And Maximize the browser Window
    When opens URL "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start"
    And the user clicks on start Element at the getHelpStartPage page
    And the user clicks on CountryEngland Element at the countryPage page
    And the user clicks on next Element at the GPPracticeLocationPage page
    And the user clicks on GPYes Element at the GPPracticeLocationPage page
    And the user clicks on next Element at the GPPracticeLocationPage page
    And the user clicks on dentalEngland Element at the dentalPracticeLocationpage page
    And the user clicks on next Element at the GPPracticeLocationPage page
    And the user Enters on "02" into the day textbox at the dataofBirthpage page
    And the user Enters on "10" into the month textbox at the dataofBirthpage page
    And the user Enters on "2017" into the year textbox at the dataofBirthpage page
    #And the user clicks on next Element at the GPPracticeLocationPage page
    #And the user clicks on patnerNo Element at the PatnerPage page
    And the user clicks on next Element at the GPPracticeLocationPage page
    When the user verifies on "You get free:" visible at GetHelpResultPage page
    # Then the user takes the screenshot "GetHelp_Below_16"
    Then the user closes the browser

  #@sanity
  #Scenario: GetHelp_above_16
    #Given browser is launched
    #And Maximize the browser Window
    #When opens URL "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start"
    #And the user clicks on start Element at the getHelpStartPage page
    #And the user clicks on CountryEngland Element at the countryPage page
    #And the user clicks on next Element at the GPPracticeLocationPage page
    #And the user clicks on GPYes Element at the GPPracticeLocationPage page
    #And the user clicks on next Element at the GPPracticeLocationPage page
    #And the user clicks on dentalEngland Element at the dentalPracticeLocationpage page
    #And the user clicks on next Element at the GPPracticeLocationPage page
    #And the user Enters on "02" into the day textbox at the dataofBirthpage page
    #And the user Enters on "10" into the month textbox at the dataofBirthpage page
    #And the user Enters on "1998" into the year textbox at the dataofBirthpage page
    #And the user clicks on next Element at the GPPracticeLocationPage page
    #And the user clicks on patnerYes Element at the PatnerPage page
    #And the user clicks on next Element at the GPPracticeLocationPage page
    #When the user verifies on "You get free:" visible at GetHelpResultPage page
    # Then the user takes the screenshot "GetHelp_Below_16"
    #Then the user closes the browser
