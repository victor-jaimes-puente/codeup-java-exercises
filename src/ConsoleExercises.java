        import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args){
//        double pi = 3.14159;
//        String name = "Vic";
//        System.out.printf("Pi is almost %s \n", pi);

//SCANNER SECTION
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the width in feet here: ");
        long width = sc.nextInt();
        System.out.print("Enter the length in feet here: ");
        long length = sc.nextInt();
        long areaOfClassRoom = length * width;
        long perimiterOfClassRoom = (width * 2) + (length * 2);

        System.out.printf("The number you input were: %s %s\n", width, length);
        System.out.printf("The area of your class room is: %s\n", areaOfClassRoom);
        System.out.printf("The perimiter of your classroom is: %s",perimiterOfClassRoom);



    }
}
