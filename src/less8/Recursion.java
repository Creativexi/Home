package less8;

public class Recursion {
    public static void main(String[] args) {
        int a = 10, b = 5;
        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = a; i >= b; i--) {
                System.out.println(i);
            }
        }
    }
}
