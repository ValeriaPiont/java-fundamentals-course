package com.bobocode.oop.data;

import java.util.HashSet;
import java.util.Set;

/**
 * {@link FlightDao} represents a Data Access Object (DAO) for flights. The implementation is simplified, so it just
 * uses {@link HashSet} to store flight numbers.
 * <p>
 */
public class FlightDao {
    private Set<String> flights = new HashSet<>();

    /**
     * Stores a new flight number
     *
     * @param flightNumber a flight number to store
     * @return {@code true} if a flight number was stored, {@code false} otherwise
     */
    public boolean register(String flightNumber) {
        return flights.add(flightNumber);
    }

    /**
     * Returns all stored flight numbers
     *
     * @return a set of flight numbers
     */
    public Set<String> findAll() {
        return flights;
    }

}
