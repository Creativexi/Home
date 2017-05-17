package uitschool ;

public class ShapeDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangl = new Rectangle();
        Shape figure[] = new Shape[2];
        figure[0]=circle;
        figure[1]=rectangl;
        for (Shape x: figure){
            x.draw();
        }
    }
}
