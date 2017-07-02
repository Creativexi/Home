package uitschool;

public class ExDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("A");
        Ex myThread1 = new Ex(stringBuilder);
        Ex myThread2 = new Ex(stringBuilder);
        Ex myThread3 = new Ex(stringBuilder);
        myThread1.start();
        myThread2.start();
        myThread3.start();

    }
}

