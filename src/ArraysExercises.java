import java.util.Arrays;

public class ArraysExercises {
    static String[] people = new String[3];

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
//        it returns the UID
        System.out.println(Arrays.toString(numbers));
//        returns the actual numbers and not the UID

/**        Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.
 *
 * Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.
 */
        people[0] = new String("Felipe");
        people[1] = new String("Victor");
        people[2] = new String("Jesus");

        for (String person : people) {
            System.out.println(person);
        }


    }
}












