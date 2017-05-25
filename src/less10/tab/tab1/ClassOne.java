package less10.tab.tab1;

public class ClassOne {
    static String a = "a";
    static private String b = "b";
    public static String c = "c";
    protected static String d = "d";

    public static void printOne() {
        System.out.println("Доступные поля для одного и тогоже класса: ");
        System.out.println(a + " " + b + " " + c + " " + d);
        System.out.println();
    }
}
