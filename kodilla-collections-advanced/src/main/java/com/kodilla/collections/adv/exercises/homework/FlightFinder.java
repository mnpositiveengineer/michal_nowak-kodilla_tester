package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightFinder{

    public static List<Flight> findFlightsFrom(String departure){
       return FlightRepository.connection.getOrDefault(departure, Collections.emptyList());
    }

    public static List<Flight> findFlightsTo(String arrival){
        List<Flight> flightsTo = new ArrayList<>();
        for (Map.Entry<String, List<Flight>> flight : FlightRepository.connection.entrySet()){
            for (int i = 0; i < flight.getValue().size(); i++){
                if (flight.getValue().get(i).getDestination() == arrival) {
                    flightsTo.add(new Flight(flight.getValue().get(i).getDeparture(), flight.getValue().get(i).getArrival(), flight.getKey()));
                }
            }
        }
        return flightsTo;
    }

}
