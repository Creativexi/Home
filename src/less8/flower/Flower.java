package less8.flower;

/**
 Создать класс "Flower", который содержит переменные имя и стоимость.
 Собрать 3 букета (используем массив) с определением их стоимости.
 Также подсчитать количество проданных цветов (используем статический метод).
 */
public class Flower {
    public String name;
    public int cost;

    public Flower() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Flower(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public static Booket getBouquet(Flower... flowers) {
        Flower flower[] = new Flower[flowers.length];
        for (int i = 0; i < flowers.length;
        i++) {
            flower[i] = flowers[i];
    }
        return new Booket(flower);
    }

}
