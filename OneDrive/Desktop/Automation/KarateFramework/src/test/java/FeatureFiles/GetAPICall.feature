Feature: Get API

  Scenario: test the get api call

    Given Url 
    And path '1'
    When Method GET
    Then status 200
    * print response
    * def jsonResponse=response
    * print jsonResponse
    * def actualName=jsonResponse.avatar.name
    * def actualStatus=jsonResponse.avatar.status
    * def actualEmail=jsonResponse.email
    * print actualName
    * print actualStatus
    * print actualEmail
    * match actualName='Monty.jpg'


    Scenario: get the user details- user not found
      Given Url
      And path '33'
      When Method GET
      Then status 404

