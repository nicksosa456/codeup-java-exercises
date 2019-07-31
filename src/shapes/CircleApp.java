package shapes;
import util.Input;

import java.util.Scanner;

public class CircleApp {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Input input = new Input();
        System.out.println("What is the radius of your circle?");
        double userRadius = input.getDouble();
        Circle circle = new Circle(userRadius);
        System.out.println(userRadius);
//        System.out.printf("The area for your circle is %f. &n", circle.getArea());
    }
}
