package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vechicles.Car;

public class CarDemo {
    public static void main(String[] args) {
        Car car = new Car();
        Engine engine = new Engine();
        Driver driver = new Driver("vova", 50);
        engine.setManufacturer("BMW");
        engine.setPower(200);
        car.setClas("S");
        car.setMark("KIA");
        car.setVeight(1000);
        driver.setFullName("Владимир");
        driver.setExp(5);
        car.setEngine(engine);
        car.setDriver(driver);
        System.out.println(car);
        car.left();
        car.right();
        car.start();
        car.stop();
    }
}
