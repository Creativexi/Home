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

    @Override
    public String toString() {
        return "Dog{" +
                "dogGame='" + dogGame + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return dogGame != null ? dogGame.equals(dog.dogGame) : dog.dogGame == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (dogGame != null ? dogGame.hashCode() : 0);
        return result;
    }
}
