package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightRepository {

    static Map<String, List<Flight>> connection = new HashMap<>();

    public static void addConnection(String airport, Flight flight){
        List<Flight> flights = connection.getOrDefault(airport, new ArrayList<>());
        flights.add(flight);
        connection.put(airport,flights);
    }
}
