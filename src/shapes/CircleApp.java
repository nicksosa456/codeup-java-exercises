package shapes;

import util.Input;

public class CircleApp {
    public static void main (String[] args) {
        Input input = new Input();
            double radius = input.getDouble("What is the radius of this circle?");
            Circle circle = new Circle(radius);
            System.out.printf("The area of the circle is: %f%n", circle.getArea());
            System.out.printf("The circumference of the circle is: %f%n", circle.getCircumference());
    }
}
