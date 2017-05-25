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

    @Override
    public String toString() {
        return "Horse{" +
                "breed='" + breed + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Horse horse = (Horse) o;
        return breed != null ? breed.equals(horse.breed) : horse.breed == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (breed != null ? breed.hashCode() : 0);
        return result;
    }
}
