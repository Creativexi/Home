package less9.animals;

public class Cat extends Animal {
    String name;

    public Cat(String food, String location) {
        super(food, location);
    }

    public String getEars() {
        return name;
    }

    public void setEars(String ears) {
        this.name = ears;
    }

    void makeNoise() {
        System.out.println("Cat noise");
    }

    void eat() {
        System.out.println("Cat eat");
    }
}
