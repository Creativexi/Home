package com.company.vechicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    private String mark;
    private String clas;
    private int veight;

    private int getVeight() {
        return veight;
    }

    private String getMark() {
        return mark;
    }

    private String getClas() {
        return clas;
    }

    public void setVeight(int veight) {
        this.veight = veight;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void left() {
        System.out.println("Поворот налево");
    }

    public void right() {
        System.out.println("Поворот направо");
    }

    public void printInfo(Car car, Engine engine, Driver driver) {
        System.out.println("Машина: " + car.getMark() + " класса: " + car.getClas() + ". Вес: " + car.getVeight() + "кг");
        System.out.println("Водитель: " + driver.getFullName() + ", стаж вождения: " + driver.getExp());
        System.out.println("Производитель двигателя: " + engine.getManufacturer() + ", мощность: " + engine.getPower());
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", clas='" + clas + '\'' +
                ", veight=" + veight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        if (veight != car.veight) return false;
        if (mark != null ? !mark.equals(car.mark) : car.mark != null) return false;
        return clas != null ? clas.equals(car.clas) : car.clas == null;
    }

    @Override
    public int hashCode() {
        int result = mark != null ? mark.hashCode() : 0;
        result = 31 * result + (clas != null ? clas.hashCode() : 0);
        result = 31 * result + veight;
        return result;
    }
}
