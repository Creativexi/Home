package com.company.vechicles;

public class SportCar {
    private int maxSpeed;

    @Override
    public String toString() {
        return "SportCar{" +
                "maxSpeed=" + maxSpeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SportCar sportCar = (SportCar) o;

        return maxSpeed == sportCar.maxSpeed;
    }

    @Override
    public int hashCode() {
        return maxSpeed;
    }

    public int getMaxSpeed() {

        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
