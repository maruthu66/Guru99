Feature: Book Flight Ticket in Make My Trip

Scenario: Book Flight Ticket
Given Launch MakeMyTrip Application
And User close the Advertisment
And User cliks on one way trip
And User enters the from place
And User enter the to place
And User enter the date of depature
And User cliks on search
Then verify the from place,to place,travel date and class

