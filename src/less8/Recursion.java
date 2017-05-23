package less8;

public class Recursion {
    public static void recursionMethod(int a, int b) {
        if (a < b) {
            System.out.println(a);
            recursionMethod(++a, b);
        } else if (a > b) {
            System.out.println(a);
            recursionMethod(--a, b);
        } else {
            System.out.println(b);
        }
    }
}