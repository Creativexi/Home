package less9.animals;

public class Dog extends Animal {
    String dogGame;

    public String getDogGame() {
        return dogGame;
    }

    public void setDogGame(String dogGame) {
        this.dogGame = dogGame;
    }

    public Dog(String food, String location) {
        super(food, location);
    }

    void makeNoise() {
        System.out.println("Dog noise");
    }

    void eat() {
        System.out.println("Dog eat");
    }
}
