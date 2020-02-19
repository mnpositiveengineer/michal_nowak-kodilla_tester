package com.kodilla.collections.adv.exercises.homework;

import java.util.Objects;

public class Flight {
    private String departure;
    private String arrival;
    private String destination;

    public Flight(String departure, String arrival, String destination) {
        this.departure = departure;
        this.arrival = arrival;
        this.destination = destination;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public String getDestination() {
        return destination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(departure, flight.departure) &&
                Objects.equals(arrival, flight.arrival) &&
                Objects.equals(destination, flight.destination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departure, arrival, destination);
    }
}
