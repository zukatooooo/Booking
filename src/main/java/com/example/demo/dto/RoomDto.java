package com.example.demo.dto;

public class RoomDto {
    private final int roomNumber;
    private final boolean isBooked;

    public RoomDto(int roomNumber, boolean isBooked) {
        this.roomNumber = roomNumber;
        this.isBooked = isBooked;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isBooked() {
        return isBooked;
    }

}
