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

    void setVeight(){this.veight = veight;}
    void setMark(){this.mark = mark;}
    void setClas(){this.clas = clas;}

     private void printInfo(){
        System.out.println(engine.getPower());
    }

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
        Car engine = new Car();
        engine.printInfo();
    }
}
