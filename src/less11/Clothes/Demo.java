package less11.Clothes;

public class Demo {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new Skirt(Size.L, "white", 200),
                new Tie(Size.M, "black", 20),
                new Pants(Size.XXS, "black", 250),
                new TShirt(Size.S, "blue", 100)
        };
        Studio studio = new Studio();
        studio.wearMan(clothes);
        studio.wearWoman(clothes);
    }
}
