package less8.flower;

/**
 Создать класс "Flower", который содержит переменные имя и стоимость.
 Собрать 3 букета (используем массив) с определением их стоимости.
 Также подсчитать количество проданных цветов (используем статический метод).
 */
public class Flower {
    String name;
    int cost;
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

    public static void main(String[] args) {
        Flower flover1 = new Flower();
        Flower flower2 = new Flower();
        Flower flower3 = new Flower();
    }
}
