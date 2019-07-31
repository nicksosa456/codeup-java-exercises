import java.util.Arrays;

import static java.util.Arrays.copyOf;

public class ArraysExercises {
    static void addPerson(String peep[]){
        String[] newPeep = Arrays.copyOf(peep, peep.length+1);
        Person peach = new Person("Peach");
        newPeep[peep.length] = peach.getName();
        for (String person : newPeep) {
            System.out.println(person);
        }
    }
    public static void main (String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        Person nick = new Person("Nick");
        Person bill = new Person("Bill");
        Person kate = new Person("Kate");
        String[] people = {nick.getName(), bill.getName(), kate.getName()};
        for (String person : people) {
            System.out.println(person);
        }
        addPerson(people);
    }
}
