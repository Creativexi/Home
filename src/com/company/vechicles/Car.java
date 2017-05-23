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

    private void setVeight(int veight) {
        this.veight = veight;
    }

    private void setMark(String mark) {
        this.mark = mark;
    }

    private void setClas(String clas) {
        this.clas = clas;
    }

    private void start() {
        System.out.println("Поехали");
    }

    private void stop() {
        System.out.println("Останавливаемся");
    }

    private void left() {
        System.out.println("Поворот налево");
    }

    private void right() {
        System.out.println("Поворот направо");
    }

    private void printInfo(Car car, Engine engine, Driver driver) {
        System.out.println("Машина: " + car.getMark() + " класса: " + car.getClas() + ". Вес: " + car.getVeight() + "кг");
        System.out.println("Водитель: " + driver.getFullName() + ", стаж вождения: " + driver.getExp());
        System.out.println("Производитель двигателя: " + engine.getManufacturer() + ", мощность: " + engine.getPower());
    }

    public static void main(String[] args) {
        Car car = new Car();
        Engine engine = new Engine();
        Driver driver = new Driver();
        engine.setManufacturer("BMW");
        engine.setPower(200);
        car.setClas("S");
        car.setMark("KIA");
        car.setVeight(1000);
        driver.setFullName("Владимир");
        driver.setExp(5);
        car.printInfo(car, engine, driver);
        car.left();
        car.right();
        car.start();
        car.stop();
    }
}
