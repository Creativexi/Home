package less9.animals;

public class Vet {
    void treatAnimal(Animal animal) {
        System.out.println(animal.getFood() + " " + animal.getLocation());
    }
}
