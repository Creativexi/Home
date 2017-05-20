package less8;

import less8.Circle;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(13);

        circle1.square(circle1);
        circle2.square(circle2);
        circle1.length(circle1);
        circle2.length(circle2);
    }
}
