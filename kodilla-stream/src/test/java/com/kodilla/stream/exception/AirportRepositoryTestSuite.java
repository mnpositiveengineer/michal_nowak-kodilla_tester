package com.kodilla.stream.exception;

import org.junit.Test;

import static org.junit.Assert.*;

public class AirportRepositoryTestSuite {

    @Test
    public void testIsAirportInUse() throws AirportNotFoundException {
        AirportRepository airportRepository = new AirportRepository();
        boolean isWarsawInUSe = airportRepository.isAirportInUse("Warsaw");
        assertTrue(isWarsawInUSe);
    }

    @Test (expected = AirportNotFoundException.class)
    public void testIsAirportInUseException() throws AirportNotFoundException {
        AirportRepository airportRepository = new AirportRepository();
        boolean isWienInUSe = airportRepository.isAirportInUse("Wien");
        assertTrue(isWienInUSe);
    }

}