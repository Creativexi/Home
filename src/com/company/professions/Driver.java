package com.company.professions;

import less7.Person;

public class Driver extends Person {

    private int exp;

    public Driver(String n, int a) {
        super(n, a);
    }

    public int getExp() {
        return exp;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "exp=" + exp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Driver driver = (Driver) o;
        return exp == driver.exp;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + exp;
        return result;
    }

}
