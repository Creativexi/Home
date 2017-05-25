package less10.tab.tab2;

import less10.tab.tab1.ClassOne;

public class ClassFour extends ClassOne {
    public static void printFour() {
        System.out.println("Доступные поля для подкласса находящегося в другом пакете: ");
        System.out.println(c + " " + d);
        System.out.println("Недоступные поля для подкласса находящегося в другом пакете: ");
        System.out.println("a, так как он default. b, так как он private");
        System.out.println();
    }
}
