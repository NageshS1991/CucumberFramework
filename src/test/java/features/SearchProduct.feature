Feature: Search and place the order from product

Scenario: Search exprience for the prodct from Homepage and Offer page

Given User at the greenkart landing page
When User search with shortname "tom" and extract the fullname from the actual product
Then User search with the "tom" shortname from the offer page
And Validate the both product name are same