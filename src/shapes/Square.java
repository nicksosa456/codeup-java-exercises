package shapes;

public class Square extends Rectangle {
    public int side;
    public Square (int side) {
        super(side, side);
        this.side=side;
    }

    public int getArea() {
        return 4 * side;
    }

    public int getPerimeter() {
        return side * side;
    }
}
