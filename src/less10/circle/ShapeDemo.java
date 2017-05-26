package less10.circle;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(2.2, 13.1, 12.4),
                new Rectangle(2.1, 3.2, 4.1, 5.5)
        };
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
