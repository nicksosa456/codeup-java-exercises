package shapes;

import java.util.Scanner;

public class Circle {
    private double radius;
    public double pi = Math.PI;
    private Scanner scanner = new Scanner(System.in);

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        radius = scanner.nextDouble();
        return pi * (Math.pow(radius, 2));
    }

    public double getCircumference() {
        radius = scanner.nextDouble();
        double circumference = 2 * pi * radius;
        System.out.printf("The circumference of your circle is %f.", circumference);
        return circumference;
    }
}
