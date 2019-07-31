import java.util.Arrays;

import static java.util.Arrays.copyOf;

public class ArraysExercises {
    static Person[] addPerson(Person[] group, Person newPerson){
        Person[] newPeep = Arrays.copyOf(group, group.length+1);
        newPeep[newPeep.length-1] = newPerson;
        return newPeep;
    }
    public static void main (String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        Person[] people = {new Person("Nick"), new Person("Bill"), new Person("Kate")};
        for (Person person : people) {
            System.out.println(person.getName());
        }
        Person[] newGroup = addPerson(people, new Person("Peach"));
        for (Person person : newGroup) {
            System.out.println(person.getName());
        }
    }
}
