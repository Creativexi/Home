package less7;

public class Person {
    public String fullName;
    public int age;

    Person() {
    }

    public Person(String n, int a) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return fullName != null ? fullName.equals(person.fullName) : person.fullName == null;
    }

    @Override
    public int hashCode() {
        int result = fullName != null ? fullName.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }
}


