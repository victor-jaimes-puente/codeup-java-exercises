import java.nio.file.LinkPermission;
import java.util.Arrays;
import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class ArraysExercises {

    public static void main(String[] args) {
        public static String addPerson (String[]inputPeople, String inputPerson){
            int[] numbers = {1, 2, 3, 4, 5};
            System.out.println(Arrays.toString(numbers));
            String[] people = new String[3];

            people[0] = new String("Alpha");
            people[1] = new String("Bravo");
            people[2] = new String("Charlie");

            for (int i = 0; i < people.length; i++) {
                System.out.println(people[i]);
            }

            for (String person : people) {
                System.out.println(person);
            }
            System.out.println();


//            for (int)
            String addition = new String("Alpha");
            for (String person : addPerson) {
                System.out.println("\t" + addition);
            }
                return addition;
        }
            String[] updatePeople = addPerson(people, addition);

    }
}

// Create static method named addPerson
//(P1) Accepts array of Persons && (P2)single person object
// Input will be added to the passed array
// TWO PARAMETERS, P1 AND P2
//should return an array whose length is 1 greater than the passed array, with the passed person object at
// the end of the array.










