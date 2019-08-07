package util;

public class InputTest {
    public static void main (String[] args) {
        Input input = new Input();
//        System.out.println(input.getString());
//        System.out.println(input.yesNo());
//        input.getInt();
//        System.out.println(input.getDouble());
//        System.out.println(input.getDouble(1.0, 20.0));
//        System.out.println(input.getInt(1, 20));
        int test = input.getHex("enter a num");
        System.out.println(test);

    }
}
