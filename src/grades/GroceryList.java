package grades;
import util.Input;

public class GroceryList {
    public static void main(String[] args) {
        Input input = new Input();
        boolean begin = true;
        boolean newItem;

        do {
            begin = input.yesNo("Would you like to create a grocery list?");
            newItem = input.yesNo("Would you like to enter a new item?");

        } while (begin);
    }
}
