package less10.fruit;

public class FruitDemo {
    public static void main(String[] args) {
        Fruit[] fruits = {
                new Apple(),
                new Apple(),
                new Apple(),
                new Pear(),
                new Pear(),
                new Apricot(),
                new Pear(),
                new Apricot(),
        };
        printFruitsPriceInfo(fruits);
    }

    public static void printFruitsPriceInfo(Fruit[] fruits) {
        int appleTotalCost = 0;
        int pearTotalCost = 0;
        int apricotTotalCost = 0;
        int fruitsTotalCost = 0;
        for (Fruit fruit : fruits) {
            if (fruit instanceof Apple) {
                appleTotalCost += fruit.getPrice();
            }
            if (fruit instanceof Apricot) {
                apricotTotalCost += fruit.getPrice();
            }
            if (fruit instanceof Pear) {
                pearTotalCost += fruit.getPrice();
            }
        }
        fruitsTotalCost = appleTotalCost + apricotTotalCost + pearTotalCost;
        System.out.println("Стоимость проданных яблок составляет - " + appleTotalCost);
        System.out.println("Стоимость проданных абрикос составляет - " + apricotTotalCost);
        System.out.println("Стоимость проданных груш составляет - " + pearTotalCost);
        System.out.println("Стоимость всех проданных фруктов состваляет - " + fruitsTotalCost);
    }
}
