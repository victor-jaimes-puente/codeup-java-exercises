public class StringExercise {
    public static void main(String[] args){
//        System.out.println("We don't need no thought control");
//        System.out.println("Check \"this\" out!, \"s inside of \"s! ");
//        System.out.println("In windows, the main drive is usually C:\\");
//        System.out.println("I can do backslashes \\, double backslashes \\\\ and the amazing tirple backslash \\\\\\!");
//        System.out.println();
        String Education = ("We don't need no education");
        System.out.println(Education);
        // need to practice checking the specific value of a string like a specific letter or char
        int lengthOfEdu = Education.length();
        System.out.println(lengthOfEdu);
        char lastOfEdu = Education.charAt(25);
        System.out.println(lastOfEdu);
        int indexOfD = Education.lastIndexOf("d");
        System.out.println(indexOfD);


    }
}
