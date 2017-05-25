package less10.tab.tab2;

import less10.tab.tab1.ClassOne;

public class ClassFive {
    public static void printFive() {
        System.out.println("Доступные поля для класса из другого пакета, не являющегося подклассом: ");
        System.out.println(ClassOne.c);
        System.out.println("Недоступные поля для класса из другого пакета, не являющегося подклассом: ");
        System.out.println("a, так как он default. b, так как он private, d, так как он protected");
        System.out.println();
    }
}
