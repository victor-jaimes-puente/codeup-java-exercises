public class ControlFlowExercises {
    public static void main(String[] args) {

//        Fizzbuzz
//
//        One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
//
//                Write a program that prints the numbers from 1 to 100.
//        For multiples of three: print “Fizz” instead of the number.
//        For the multiples of five: print “Buzz”.
//        For numbers which are multiples of both three and five: print “FizzBuzz”.

        // 1 print from 1 to 100
        // 2 multiples of 3 print Fizz instead of number
        // 3 multiples of 5 print Buzz instead of number
        // 4 multiples of both print FizzBuzz instead of number

        for (long i = 1; i < 101; i++) {
        if ((i%3 == 0)&&(i%5==0)){
            System.out.println(" FIZZBUZZ");
            } else if (i%3 == 0){
            System.out.println("( "+ i + " Fizz )");
        }else if (i%5==0){
            System.out.println("( "+ i + " Buzz )");
        }
        else{
            System.out.println(i);
        }
        }
    }
}