package com.kodilla.collections.adv.exercises.homework;

import java.util.Objects;

public class Flight {

    private String timeOfDeparture;
    private String timeOfArrival;
    private String destination;

    public Flight(String timeOfDeparture, String timeOfArrival, String destination) {
        this.timeOfDeparture = timeOfDeparture;
        this.timeOfArrival = timeOfArrival;
        this.destination = destination;
    }

    public String getDeparture() {
        return timeOfDeparture;
    }

    public String getArrival() {
        return timeOfArrival;
    }

    public String getDestination() {
        return destination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(timeOfDeparture, flight.timeOfDeparture) &&
                Objects.equals(timeOfArrival, flight.timeOfArrival) &&
                Objects.equals(destination, flight.destination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeOfDeparture, timeOfArrival, destination);
    }
}
