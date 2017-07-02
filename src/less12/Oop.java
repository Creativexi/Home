package less12;

public class Oop {
    public static void main(String[] args) {
        String l = "object oriented programming";
        System.out.println(oopMethod1(l));
        System.out.println(oopMethod2(l));
    }

    public static String oopMethod1(String l) {
        String regexp = "(?i)object\\s*oriented\\s*programming";
        return l.replaceAll(regexp, "OOP");
    }

    public static String oopMethod2(String text) {
        String result = "";
        String[] splited = text.split(" ");
        for (String c : splited) {
            result += c.substring(0, 1).toUpperCase();
        }
        return result;
    }
}
