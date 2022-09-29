Feature: Tokopedia

  Scenario: testBelanja
    When User go to web tokopedia
    Then User search item "Keran air Shimizu"
    And User move to last item
    And Check result