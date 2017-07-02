package less12;

public class Palindrom {
    public static void main(String[] args) {
        String l = "Если есть хвосты по дз, начните с 1 не сданного задания. 123 324 111 4554";
        String[] splitedStr = l.split(" ");
        getPalindrom(splitedStr);
    }

    public static void getPalindrom(String[] word) {
        for (String c : word) {
            StringBuilder sb = new StringBuilder(c);
            sb.reverse();
            if (c.equals(sb.toString())) {
                System.out.println(c);
            }
        }
    }
}



