package com.driver.services;


import com.driver.model.Passenger;
import com.driver.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassengerService {

    @Autowired
    PassengerRepository passengerRepository;

    public Integer addPassenger(Passenger passenger) {
        //Add the passenger Object in the passengerDb and return the passengerId that has been returned
        passenger = passengerRepository.save(passenger);

        return passenger.getPassengerId();
    }
}