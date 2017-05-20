package less8;

public class Circle {
    private int radius;
    private final double pi = 3.14;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void square(Circle circle) {
        System.out.print("Площадь круга r = " + radius + ":  ");
        double s = pi * (radius * radius);
        System.out.println(s);
    }

    public void length(Circle circe) {
        System.out.print("Длина круга r = " + radius + ": ");
        double d = pi * (radius * 2);
        System.out.println(d);
    }
}



