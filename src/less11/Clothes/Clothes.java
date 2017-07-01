package less11.Clothes;

public abstract class Clothes {
    Size size;
    int price;
    String colour;

    public Clothes(Size size, String colour, int price) {
        this.size = size;
        this.colour = colour;
        this.price = price;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Clothes clothes = (Clothes) o;

        if (price != clothes.price) return false;
        if (size != clothes.size) return false;
        return colour != null ? colour.equals(clothes.colour) : clothes.colour == null;
    }

    @Override
    public int hashCode() {
        int result = size != null ? size.hashCode() : 0;
        result = 31 * result + price;
        result = 31 * result + (colour != null ? colour.hashCode() : 0);
        return result;
    }
}
