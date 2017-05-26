package less10.fruit;

public abstract class Fruit {
    public int price;

    final void printManufacturerInfo() {
        System.out.print("Made in Ukraine");
    }

    public abstract int getFruitPrice();

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
