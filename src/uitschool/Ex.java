package uitschool;

public class Ex extends Thread {
    StringBuilder s;

    public Ex(StringBuilder stringBuilder) {
        s = stringBuilder;
    }

    public  void run() {
        synchronized (s) {
            for (int i = 0; i < 100; i++) {
                System.out.print(s);
            }
            System.out.println();
            char c = s.charAt(0);
            c++;
            s.setCharAt(0, c);
        }
    }
}
