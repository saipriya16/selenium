Feature: amazonapplication
Scenario: to test registration page
 
  Given Open chrome browser and the url
  When  enter username,mailid/phonenumber & password
  Then  registered success
  
Scenario: to test signin page
 
  Given Open chrome browser and the url
  And click on signin button
  When  enter mailid & click continue button
  And enter password
  Then   click on signin  button
  
Scenario: to test add product to cart
 
  Given Open chrome browser and the url
  And  enter the product in search bar 
  When click  on search button 
  And click on product
  Then click on add to cart button
  Then  product added  successfully
 