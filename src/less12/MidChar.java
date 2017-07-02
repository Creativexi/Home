package less12;

public class MidChar {
    public static void main(String[] args) {
        String s = "string";
        String c = "code";
        String p = "Practice";

        printMidChar(s);
        printMidChar(c);
        printMidChar(p);
    }

    public static void printMidChar(String s) {
        System.out.println(s.substring(s.length() / 2 - 1, (s.length() / 2 - 1) + 2));
    }
}

