package less11.Clothes;

public class Tie extends Clothes implements ManClothes {
    public Tie(Size size, String colour, int price) {
        super(size, colour, price);
    }

    @Override
    public String toString() {
        return "Tie{" +
                "size=" + size +
                ", price=" + price +
                ", colour='" + colour + '\'' +
                '}';
    }
}
