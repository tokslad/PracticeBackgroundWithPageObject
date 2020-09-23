Feature: Registration

  Background: Valid Registration
    Given I navigate to angularjs site
    When I click on Sign in1
    And I enter email text "janedoe118@gmail.com"
    And I enter password text "Adel0nd0n"
    And I click on sign in

    Scenario: creating new article
      When I enter click on New Article
      And I write my Article Title "DemoTesting"
      And I write what my article is all about "TestingDemo"
      And I write my Article "Testing"
      And I enter tags "Demo"
      And I click on Publish Article
      Then my article should be created successfully

      Scenario: global feed
        When I click on Global Feed
        Then I should be able see my posted article


