package shapes;

public class Square extends Quadrilateral {

    public Square(double length) {
        super(length, length);
    }

    @Override
    public double setLength(double length) {
        return 0;
    }

    @Override
    public double setWidth(double width) {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return length * length;
    }
//    public int side;
//    public Square (int side) {
//        super(side, side);
//        this.side=side;
//    }
//
//    public int getArea() {
//        return 4 * side;
//    }
//
//    public int getPerimeter() {
//        return side * side;
//    }
}