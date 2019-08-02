package shapes;

public class ShapesTest {
    public static void main (String[] args) {
//        Rectangle box1 = new Rectangle(4, 5);
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());
//
//        Square box3 = new Square(6);
//        System.out.println(box3.getPerimeter());
//        System.out.println(box3.getArea());

        Measurable myShape = new Square(5);
        Measurable myShape2 = new Rectangle(4,7);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape2.getArea());
        System.out.println(myShape2.getPerimeter());
    }
}
