package less10.fruit;

public class Pear extends Fruit {
    public int pearCount;

    Pear() {
        setPrice(20);
        pearCount++;
    }

    @Override
    public int getFruitPrice() {
        return this.getPrice();
    }
}
