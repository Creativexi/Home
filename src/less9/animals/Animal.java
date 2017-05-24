package less9.animals;

public abstract class Animal {
    public String food;
    public String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    void makeNoise() {
        System.out.println("Noise");
    }

    void eat() {
        System.out.println("Eat");
    }

    void sleep() {
    }
}
