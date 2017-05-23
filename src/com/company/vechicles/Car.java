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
}
