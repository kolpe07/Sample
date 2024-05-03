

Feature: Update the user using PUT API

Background:
    * url
    * def requestPayload=
   """ 
  {
      "skills": 
      [
        "UI Automation",
        "Karate framework",
        "Git"
       ],
  }
   """
Scenario: Update the user using request payload
Given path '/users/1'
And request requestPayload
And header Authorization='Bearer' + tokenID
When method put
Then status 200
