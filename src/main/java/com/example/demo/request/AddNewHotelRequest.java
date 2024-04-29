package com.example.demo.request;

import com.example.demo.model.Hotel;

import java.util.UUID;

public class AddNewHotelRequest {
    Hotel hotel;

    public void addNewHotelRequest(String name, int maxCapacity) {
        this.hotel = new Hotel(UUID.randomUUID(), name, maxCapacity);
    }

}
