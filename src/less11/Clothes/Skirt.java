package less11.Clothes;

public class Skirt extends Clothes implements WomanClothes {
    public Skirt(Size size, String colour, int price) {
        super(size, colour, price);
    }

    @Override
    public String toString() {
        return "Skirt{" +
                "size=" + size +
                ", price=" + price +
                ", colour='" + colour + '\'' +
                '}';
    }
}
