Feature: Book Flight Ticket in Make my Trip

Background: Launching the browser
Given Launch MakemyTrip Application "https://www.makemytrip.com"
And User close the Advertisments
Scenario: Book Flight Ticket
When User cliks on the one way trip
And User enterr the from place #with one dim list
|Hyderabad|Kolkata|Chennai|
And User enters the to place#with one dim map
|place1|Thiruvananthapuram|
|place2|Tiruchirappalli|
|place3|Tirupati|

Scenario: Book Flight Ticket
When User clikes on the one way trip
And User enters the from place #with one dim list
|Thiruvananthapuram|Tirupati|Tiruchirappalli|
And User enterr the to place#with one dim map
|place1|Hyderabad|
|place2|Kolkata|
|place3|Chennai|

