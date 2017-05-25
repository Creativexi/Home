package less8.flower;

public abstract class Flower {
    public String name;
    public int cost;
    private static int flowerCount;

    public Flower() {
    }

    public String getName() {
        return name;
    }

    public abstract int getCost();

    public Flower(String name, int cost) {
        this.name = name;
        this.cost = cost;
        flowerCount++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public static void printBooketInfo(Flower[] booket) {
        int flowerCountRose = 0;
        int flowerCountLily = 0;
        int flowerCountDaisy = 0;
        int flowerCountLotus = 0;
        int flowerCountAster = 0;
        int price = 0;
        for (Flower flower : booket) {
            price += flower.getCost();
            if (flower.getName().equals("Rose")) {
                flowerCountRose = ++flowerCountRose;
            }
            if (flower.getName().equals("Lily")) {
                flowerCountLily = ++flowerCountLily;
            }
            if (flower.getName().equals("Aster")) {
                flowerCountAster = ++flowerCountAster;
            }
            if (flower.getName().equals("Lotus")) {
                flowerCountLotus = ++flowerCountLotus;
            }
            if (flower.getName().equals("Daisy")) {
                flowerCountDaisy = ++flowerCountDaisy;
            }
        }
        System.out.println("Букет состоит из:");
        System.out.println("Роз: " + flowerCountRose + " шт");
        System.out.println("Лилий: " + flowerCountLily + " шт");
        System.out.println("Астр: " + flowerCountAster + " шт");
        System.out.println("Лотосов: " + flowerCountLotus + " шт");
        System.out.println("Маргариток: " + flowerCountDaisy + " шт");
        System.out.println("Стоимость букета: " + price);
    }

    public static void flowerSold() {
        System.out.println("Всего цветков было продано: " + flowerCount + " шт");
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        if (cost != flower.cost) return false;
        return name != null ? name.equals(flower.name) : flower.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + cost;
        return result;
    }
}
