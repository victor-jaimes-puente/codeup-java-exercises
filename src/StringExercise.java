public class StringExercise {
    public static void main(String[] args) {
//        System.out.println("We don't need no thought control");
//        System.out.println("Check \"this\" out!, \"s inside of \"s! ");
//        System.out.println("In windows, the main drive is usually C:\\");
//        System.out.println("I can do backslashes \\, double backslashes \\\\ and the amazing tirple backslash \\\\\\!");
//        System.out.println();
        String Education = ("  We don't need no education  ");
        System.out.println(Education);
        // need to practice checking the specific value of a string like a specific letter or char
        int lengthOfEdu = Education.length();
        System.out.println(lengthOfEdu);
        char lastOfEdu = Education.charAt(25);
        System.out.println(lastOfEdu);
        int indexOfD = Education.lastIndexOf("d");
        System.out.println(indexOfD);
        String Replaced = Education.replace("We", "They");
        System.out.println(Replaced);
        System.out.println(Education);
        String word = Education.substring(0, 8);
        System.out.println(word);
        String CAPITlAIZED = Replaced.toUpperCase();
        System.out.println(CAPITlAIZED);
        String Trimmed = Replaced.trim().toUpperCase();
        System.out.println(Trimmed);
    }
}









