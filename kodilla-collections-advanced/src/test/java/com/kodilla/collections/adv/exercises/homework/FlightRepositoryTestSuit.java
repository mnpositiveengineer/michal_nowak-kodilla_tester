package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightRepositoryTestSuit {

    @Test
    public void testAddConnection() {
        FlightRepository.addConnection("Poznań", new Flight("10:00", "11:00", "Berlin"));
        FlightRepository.addConnection("Poznań", new Flight("09:00", "12:00", "Petersburg"));
        FlightRepository.addConnection("Gdańsk", new Flight("08:00", "10:00", "Lisboa"));
        FlightRepository.addConnection("Gdańsk", new Flight("12:00", "13:30", "Oslo"));
        FlightRepository.addConnection("Gdańsk", new Flight("18:00", "21:00", "Petersburg"));
        List<Flight> flightList = FlightRepository.connection.get("Gdańsk");
        List<Flight> expectedFlightList = new ArrayList<>();
        expectedFlightList.add(new Flight("08:00", "10:00", "Lisboa"));
        expectedFlightList.add(new Flight("12:00", "13:30", "Oslo"));
        expectedFlightList.add(new Flight("18:00", "21:00", "Petersburg"));

        //Then
        assertEquals(expectedFlightList, flightList);
    }
}