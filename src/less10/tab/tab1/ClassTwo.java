package less10.tab.tab1;

public class ClassTwo extends ClassOne {
    public static void printTwo() {
        System.out.println("Доступные поля для подкласса находящегося в том же пакете, что и суперкласс: ");
        System.out.println(a + " " + c + " " + d);
        System.out.println("Недоступные поля для подкласса находящегося в том же пакете, что и суперкласс: ");
        System.out.println("b, так как он private");
        System.out.println();
    }
}
