package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightFinderTestSuit {

    //metoda dodająca obiekty do mapy (mapa jest statyczna więc dodanie w metodie pierwszej spowoduje, że te obiekty już będą przy następnych metodach)
    public void method() {
        if (FlightRepository.connection.isEmpty()) {
            FlightRepository.addConnection("Poznań", new Flight("10:00", "11:00", "Berlin"));
            FlightRepository.addConnection("Poznań", new Flight("09:00", "12:00", "Petersburg"));
            FlightRepository.addConnection("Gdańsk", new Flight("08:00", "10:00", "Lisboa"));
            FlightRepository.addConnection("Gdańsk", new Flight("12:00", "13:30", "Oslo"));
            FlightRepository.addConnection("Gdańsk", new Flight("18:00", "21:00", "Petersburg"));
        }
    }

    @Test
    public void shouldFindFlightsFrom(){
        //Given
        method();
        //When
        List<Flight> flightsFrom = FlightFinder.findFlightsFrom("Poznań");
        List<Flight> expectedFlightsFrom = new ArrayList<>();
        expectedFlightsFrom.add(new Flight("10:00", "11:00", "Berlin"));
        expectedFlightsFrom.add(new Flight("09:00", "12:00", "Petersburg"));
        //Then
        assertEquals(expectedFlightsFrom, flightsFrom);
    }

    @Test
    public void shouldFindFLightsTo(){
        //Given
        method();
        //When
        List<Flight> flightsTo = FlightFinder.findFlightsTo("Petersburg");
        List<Flight> expectedFlightsFrom = new ArrayList<>();
        expectedFlightsFrom.add(new Flight("09:00", "12:00", "Poznań"));
        expectedFlightsFrom.add(new Flight("18:00", "21:00", "Gdańsk"));
        //then
        assertEquals(expectedFlightsFrom, flightsTo);
    }

    @Test
    public void shouldAddToConnection() {
        //Give
        method();
        //When
        List<Flight> flightList = FlightRepository.connection.get("Gdańsk");
        List<Flight> expectedFlightList = new ArrayList<>();
        expectedFlightList.add(new Flight("08:00", "10:00", "Lisboa"));
        expectedFlightList.add(new Flight("12:00", "13:30", "Oslo"));
        expectedFlightList.add(new Flight("18:00", "21:00", "Petersburg"));
        //Then
        assertEquals(expectedFlightList, flightList);
    }
}
