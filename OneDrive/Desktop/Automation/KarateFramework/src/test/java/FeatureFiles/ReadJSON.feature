Feature : Read the JSONArray

Scenario: read the json parser
* def jsonobject=
"""
[
   {
     "name" : "ram",
     "city" : "pune"
      "age" : 24
   }
   {
     "name" : "rahul",
     "city" : "mumbai"
      "age" : 20
   }
]
"""
* print jsonobject
* print  jsonobject[0].name
* print  jsonobject[1].name+jsonobject[1].city+jsonobject[1].age

Scenario : Read the complex json

* def Jsonobject=
"""{

     "productinfo": 
    {
      "firstName": "Krupa",
      "lastName": "valekar",
      "productType": [
        "amazon",
        "flipcart",
        "google"
      ],
      "productPrice": [
        100,
        200,
        300
      ],
      "delivarylocation": "Pune",
      "totalproduct": 3,
      "id": "c939"
    
    }
"""
* print Jsonobject
* print Jsonobject.firstName
* print Jsonobject.productType.amazon
* print Jsonobject.productPrice.300
