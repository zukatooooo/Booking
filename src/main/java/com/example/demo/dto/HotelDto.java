package com.example.demo.dto;

public class HotelDto {
    private final String name;
    private final int maxCapacity;

    public HotelDto(String name, int maxCapacity) {
        this.name = name;
        this.maxCapacity = maxCapacity;
    }

    public String getName() {
        return name;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }
}
