package less11.Clothes;

public class TShirt extends Clothes implements ManClothes, WomanClothes {

    public TShirt(Size size, String colour, int price) {
        super(size, colour, price);
    }

    @Override
    public String toString() {
        return "TShirt{" +
                "size=" + size +
                ", price=" + price +
                ", colour='" + colour + '\'' +
                '}';
    }
}
