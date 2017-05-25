package com.company.details;

public class Engine {

    private int power;
    private String manufacturer;

    public void setPower(int power) {
        this.power = power;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPower() {
        return power;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        if (power != engine.power) return false;
        return manufacturer != null ? manufacturer.equals(engine.manufacturer) : engine.manufacturer == null;
    }

    @Override
    public int hashCode() {
        int result = power;
        result = 31 * result + (manufacturer != null ? manufacturer.hashCode() : 0);
        return result;
    }
}

