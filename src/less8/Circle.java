package less8;

public class Circle {
    int radius;
    final double pi = 3.14;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void square(Circle circle) {
        System.out.print("Площадь круга с радиусом " + radius + ":  ");
        double s = pi * (radius * radius);
        System.out.println(s);
    }

    public void length(Circle circe) {
        System.out.print("Длина круга с радиусом " + radius + ": ");
        double d = pi * (radius * 2);
        System.out.println(d);
    }
}



