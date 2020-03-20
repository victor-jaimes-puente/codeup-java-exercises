        import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args){
//        double pi = 3.14159;
//        String name = "Vic";
//        System.out.printf("Pi is almost %s \n", pi);

//SCANNER SECTION
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something here: ");
        long userInput = scanner.nextInt();

        System.out.printf("This is what your printed %s", userInput);
    }
}
