package com.example.demo.model;

public class Room {
    private int id;
    private int hotelId;

    public Room(int id, int hotelId) {
        this.id = id;
        this.hotelId = hotelId;
    }

    public int getId() {
        return id;
    }

    public int getHotelId() {
        return hotelId;
    }
}
