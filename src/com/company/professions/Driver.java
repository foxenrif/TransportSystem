package com.company.professions;

public class Driver extends Person {
    private String fullName;
    private int drivingExperience;

    public Driver(String fullName, int drivingExperience) {
        this.fullName = fullName;
        this.drivingExperience = drivingExperience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "fullName='" + fullName + '\'' +
                ", drivingExperience=" + drivingExperience +
                '}';
    }
}
