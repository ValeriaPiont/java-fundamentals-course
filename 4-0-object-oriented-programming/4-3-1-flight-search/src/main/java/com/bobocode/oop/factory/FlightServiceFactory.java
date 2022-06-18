package com.bobocode.oop.factory;

import com.bobocode.oop.data.FlightDao;
import com.bobocode.oop.service.FlightService;
import com.bobocode.util.ExerciseNotCompletedException;

/**
 * {@link FlightServiceFactory} is used to create an instance of {@link FlightService}
 * <p>
 */
public class FlightServiceFactory {

    /**
     * Create a new instance of {@link FlightService}
     *
     * @return FlightService
     */
    public FlightService creteFlightService() {
        return new FlightService(createFlightDao());
    }

    /**
     * Create a new instance of {@link FlightService}
     *
     * @return FlightService
     */
    public FlightDao createFlightDao() {
        return new FlightDao();
    }

}
