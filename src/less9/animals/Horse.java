package less9.animals;

public class Horse extends Animal {
    String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Horse(String food, String location) {
        super(food, location);
    }

    void makeNoise() {
        System.out.println("Horse noise");
    }

    void eat() {
        System.out.println("Horse eat");
    }
}
