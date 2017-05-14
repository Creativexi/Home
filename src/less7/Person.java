package less7;

public class Person {
    private String fullName;
    private int age;

    Person() {
    }

    Person(String n, int a) {
        age = a;
        fullName = n;
    }

    void move() {
        System.out.println("move!");
    }

    void talk() {
        System.out.println(fullName + " says - Hi!");
    }

    public static void main(String[] args) {
        Person dima = new Person();
        Person vova = new Person("Vova", 18);
        vova.talk();
        dima.move();
    }
}


