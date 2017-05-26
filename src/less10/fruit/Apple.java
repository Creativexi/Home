package less10.fruit;

public class Apple extends Fruit {
    public int appleCount;

    Apple() {
        setPrice(25);
        appleCount++;
    }

    @Override
    public int getFruitPrice() {
        return this.getPrice();
    }
}
