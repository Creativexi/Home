package less9.flower;

import less8.flower.Flower;

public class Rose extends Flower {

    private static int roseCount;

    public Rose() {
        super.setName("Rose");
        super.setCost(20);
        roseCount++;
    }

    @Override
    public int getCost() {
        return cost = cost;
    }

    public static int getRoseCount() {
        return roseCount;
    }

    public static void roseSoldPrint() {
        System.out.println("количество проданных роз - " + getRoseCount());
    }

    public static void rosePrice(Flower[] flowers) {
        int price = 0;
        for (Flower flower : flowers) {
            price += flower.getCost();
        }
        System.out.println("стоимость проданных роз - " + price);
    }
}
