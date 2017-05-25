package less10.tab.tab1;

public class ClassThree {
    public static void printThree() {
        System.out.println("Доступные поля для класса из тогоже пакета, не являющегося подклассом: ");
        System.out.println(ClassOne.a + " " + ClassOne.c + " " + ClassOne.d);
        System.out.println("Недоступные поля для класса из тогоже пакета, не являющегося подклассом: ");
        System.out.println("b, так как он private");
        System.out.println();
    }
}
