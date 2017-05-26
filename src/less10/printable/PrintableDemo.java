package less10.printable;

public class PrintableDemo {
    public static void main(String[] args) {
        Printable[] printable = {
                new Book(),
                new Magazine(),
                new Book(),
                new Magazine(),
        };
        for (Printable printable1 : printable) {
            printable1.print();
        }
    }
}
