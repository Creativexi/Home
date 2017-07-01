package less7;

public class Person {
    public String fullName;
    private int age;

    public Person() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {

        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Person(String fullName, int age) {
        this.age = age;
        this.fullName = fullName;
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


