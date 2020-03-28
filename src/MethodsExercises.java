//import javax.swing.*;
//
//public class MethodsExercises {
//    //    MAIN
//    public static void main(String[] arg) {
//        System.out.println();
//        System.out.println(sayHello("Victor", 27));
////        count(5);
//        System.out.println("Doing some adding "+add(4, 4));
//        System.out.println("Doing some multiplying "+multiply(4, 10));
//        System.out.println("Doing some deviding "+devide(4, 4));
//        System.out.println("Doing some subtracting "+subtract(4, 4));

//    }

    //END OF MAIN
//    public static String sayHello(String name) {
//
//        return String.format("Hello " + name);
//    }
//
//    //    VERSION.2
//    public static String sayHello(String name, Integer age) {
//        return String.format("Hello, I am " + name + "\nI am " + age + " years old");
//    }
//
//    //    ANOTHER.TEST
////    public static void count(int n) {
////        if (n <= 0) {
////            System.out.println("All done!");
////            return;
////        }
////        System.out.println(n);
////        count(n - 1);
////    }
//
//    // ADDITION METHOD
//    public static int add(int a, int b) {
//        System.out.printf("\nInput A %s\nInput B %s\n", a , b);
//        return a + b;
//    }
//
//    // MULTIPLICATION METHOD
//    public static int multiply(int a, int b) {
//        System.out.printf("\nInput A %s\nInput B %s\n", a , b);
//       return a*b;
//    }
//
//    // DEVISION METHOD
//    public static int devide(int a, int b) {
//        System.out.printf("\nInput A %s\nInput B %s\n", a , b);
//        return a / b;
//    }
//
//    // SUBTRACTION METHOD
//    public static int subtract(int a, int b) {
//        System.out.printf("\nInput A %s\nInput B %s\n", a , b);
//        return a - b;
//    }

//SECTION 4 DICE
//public static void testExercise04() {
//
//    System.out.println("Welcome to the dice app. you can use the app for playing board games./n");
//    System.out.print("How many dice do you want? (1 to 8) ");
//    int numDice = getInteger(1, 8);
//    System.out.print("How many sides do you want on each die? (1 to 8) ");
//    int numSides = getInteger(1, 8);
//
//    while(true) {
//        System.out.print("Hit enter to roll the dice, enter 1 to exit ");
//        String response = scanner.nextLine();
//        if (response.length() != 0) break;
//        System.out.println();
//
//        int diceSum = 0;
//        System.out.print("Dice: ");
//        for (int i = 0; i < numDice; i++) {
//            int diceValue = (int) (Math.random() * numSides) + 1;
//            System.out.printf("%1d ", diceValue);
//            diceSum += diceValue;
//        }
//        System.out.printf("\nThe sum of all dice: %1d\n\n", diceSum);
//    }
//}
//
//}
