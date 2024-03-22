package org.example;


public class Main {
    public static void main(String[] args)  {

        ConferenceEvent conferenceEvent = new ConferenceEvent("001", "AI", "Paris", "qq", 100, 3, 3,20, 30, 40 );
        conferenceEvent.calculateEventCost();
        System.out.println(conferenceEvent);


        
        }
    }
