package less9.animals;

public class AnimalDemo {
    public static void main(String[] args) {
        Vet veterinarian = new Vet();
        Animal[] animals = new Animal[6];
        animals[0] = new Cat("fish", "Kiev");
        animals[1] = new Cat("turkey", "Poltava");
        animals[2] = new Dog("corn", "Lviv");
        animals[3] = new Dog("meat", "Kharkov");
        animals[4] = new Horse("hay", "Lugansk");
        animals[5] = new Horse("grass", "Donetsk");

        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }
    }
}
