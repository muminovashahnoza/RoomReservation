Feature: Reservation

@temp
Scenario:
     Given : Team lead makes reservation
     When : User clicks on the rooms
     Then : Schedule for that room should be displayed
     And : User can  see only  his reservation 
     
     
Scenario:
      Given : Team lead makes a reservation
      When  : User clicks on "cancel conference" button and cancels the reservation
      Then  : "conference has been cancelled" message should be displayed
      And   :  The same room should be available  
       

Scenario:
      Given :Team lead make a reservation
      When : Team lead cancels reservation
      Then : User should receive email notification          