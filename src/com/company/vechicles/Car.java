package com.company.vechicles;

import com.company.details.Engine;
import com.company.professions.Driver;

/**
 Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, водитель типа Driver, мотор типа Engine.
 Методы start(), stop(), turnRight(), turnLeft(), которые выводят на печать:
 "Поехали", "Останавливаемся", "Поворот направо" или "Поворот налево".
 А также метод printInfo(), который выводит полную информацию об автомобиле, ее водителе и моторе.
 */
public class Car {
    String mark;
    String clas;
    int veight;
    Driver driver = new Driver();
    Engine engine = new Engine();

    int getVeight(){return veight;}
    String getMark(){return mark;}
    String getClas(){return clas;}

    void setVeight(int veight){this.veight = veight;}
    void setMark(String mark){this.mark = mark;}
    void setClas(String clas){this.clas = clas;}

    //public void printInfo(){
      //  System.out.println(car.getVeight());
    //}

    void start(){
        System.out.println("Поехали");
    }
    void stop(){
        System.out.println("Останавливаемся");
    }
    void left(){
        System.out.println("Поворот налево");
    }
    void right(){
        System.out.println("Поворот направо");
    }

    public static void main(String[] args) {
        Car car = new Car();
        Driver driver = new Driver();
        Engine engine = new Engine();

        engine.setManufacturer("BMW");
        engine.setPower(200);
        car.setClas("S");
        car.setMark("KIA");
        car.setVeight(1000);
        driver.setFullName("Vova");
        driver.setExp(5);
       // car.printInfo();

    }
}
