package less8;

public class Circle {
    private int radius;
    private final static double PI = 3.14;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public static double getPI() {
        return PI;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public void square() {
        System.out.print("Площадь круга r = " + radius + ":  ");
        double s = getPI() * (getRadius() * getRadius());
        System.out.println(s);
    }

    public void length() {
        System.out.print("Длина круга r = " + getRadius() + ": ");
        double d = getPI() * (getRadius() * 2);
        System.out.println(d);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return radius;
    }
}



