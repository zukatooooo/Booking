package com.example.demo.model;

import java.util.UUID;

public class Hotel {
    private final UUID id;
    private final String name;
    private final int maxCapacity;

    public Hotel(UUID id, String name, int maxCapacity) {
        this.id = id;
        this.name = name;
        this.maxCapacity = maxCapacity;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }
}
