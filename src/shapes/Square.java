package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double length){}

    @Override
    public void setWidth(double width) {}

    @Override
    public double getPerimeter() {
        return 4 * this.length;
    }

    @Override
    public double getArea() {
        return this.length * this.length;
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
