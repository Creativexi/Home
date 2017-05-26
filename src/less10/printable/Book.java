package less10.printable;

public class Book implements Printable {
    @Override
    public void print() {
        System.out.println("Это книга");
    }
}
