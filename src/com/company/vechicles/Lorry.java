package com.company.vechicles;

public class Lorry extends Car {
    private int carrying;

    public int getCarrying() {
        return carrying;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Lorry lorry = (Lorry) o;

        return carrying == lorry.carrying;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + carrying;
        return result;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "carrying=" + carrying +
                '}';
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }
}
