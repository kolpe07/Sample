Feature: Post API

Background:
    * url
    * def requestPayload=
    """
  {
     {
    "firstName": "John",
    "lastName": "Wilson",
    "email": "jobnWilson@yahoo.com",
    "status": false,
    "birthday": "2023-11-09T14:05:29.577Z",
    "skills": [
        "API",
        "Selenium",
        "TestNG"
    ],
    "avatar": [
        {
            "name": "Jazlyn.jpg",
            "percent": 100,
            "size": 40088,
            "status": "done",
            "type": "image/jpeg",
            "uid": "rc-upload-1714695638354",
            "url": "https://cloudflare-ipfs.com/ipfs/Qmd3W5DuhgHirLHGVixi6V76LhCkZUz6pnFt5AJBiyvHye/avatar/286.jpg"
        }
    ]
}
}
"""
    Scenario: create a user

      Given path '/users/'
      And request requestPayload
      And header Authorization='Bearer' + tokenID
      When method POST
      Then status 201
      And match $avatar.name='#present'
      And match $avatar.id="#present"