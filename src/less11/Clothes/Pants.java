package less11.Clothes;

public class Pants extends Clothes implements ManClothes, WomanClothes {

    public Pants(Size size, String colour, int cost) {
        super(size, colour, cost);
    }

    @Override
    public String toString() {
        return "Pants{" +
                "size=" + size +
                ", price=" + price +
                ", colour='" + colour + '\'' +
                '}';
    }
}
