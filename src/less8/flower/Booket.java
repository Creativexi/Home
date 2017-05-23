package less8.flower;

public class Booket {

    public String toString() {
        String info = "Букет состоит из:\n";
        for (Flower flower : flowers) {
            info += flower.getName();
        }
        return info;
    }
}
