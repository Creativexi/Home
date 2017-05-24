package less9.flower;

import less8.flower.Flower;

public class Rose extends Flower {

    private static int roseCount;

    public Rose() {
        super.setCost(20);
        roseCount++;
    }

    public static int getRoseCount() {
        return roseCount;
    }

    public static void roseSoldPrint() {
        System.out.println("количество проданных роз:" + getRoseCount());
    }


    public  int getCost(Rose[] booket) {
       int price = 0;
        for(Flower flower: booket){
           price += flower.getCost();
       }
        return price;
    }
}
