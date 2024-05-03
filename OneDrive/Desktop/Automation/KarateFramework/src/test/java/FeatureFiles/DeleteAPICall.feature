Feature: Delete the user using DELETE Request
Given path '/users/'
 And request requestPayload
 And header Authorization='Bearer' + tokenID
 When method POST
 Then status 201
 And match $avatar.name='#present'
 And match $avatar.id="#present"
 
 * def userId=$avatar.id
  * print userId
 
Given path '/users/'
And header Authorization='Bearer' + tokenID
When method delete
Then status 204

