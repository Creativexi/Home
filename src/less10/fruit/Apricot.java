package less10.fruit;

public class Apricot extends Fruit {
    public int apricotCount;

    Apricot() {
        setPrice(35);
        apricotCount++;
    }

    @Override
    public int getFruitPrice() {
        return this.getPrice();
    }
}
