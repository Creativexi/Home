package less11.Clothes;

public class Studio {
    public void wearMan(Clothes[] clothes) {
        System.out.println("Mans clothes: ");
        for (Clothes c : clothes) {
            if (c instanceof ManClothes) {
                System.out.println(c);
            }
        }
    }

    public void wearWoman(Clothes[] clothes) {
        System.out.println("Woman clothes: ");
        for (Clothes c : clothes) {
            if (c instanceof WomanClothes) {
                System.out.println(c);
            }
        }
    }
}
