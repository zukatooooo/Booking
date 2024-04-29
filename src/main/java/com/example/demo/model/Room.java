package com.example.demo.model;

public class Room {
    private final int id;
    private final int hotelId;
    private final int roomNumber;
    private boolean isBooked = false;

    public Room(int id, int hotelId, int roomNumber, boolean isBooked) {
        this.id = id;
        this.hotelId = hotelId;
        this.roomNumber = roomNumber;
        this.isBooked = isBooked;
    }

    public int getId() {
        return id;
    }

    public int getHotelId() {
        return hotelId;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }
}
