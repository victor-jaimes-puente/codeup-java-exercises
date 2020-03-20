public class ControlFlowExercises {
    public static void main(String[] args) {


        long i = 2;
        do {

            System.out.print(" " + i);
            i*=i;
        } while (i <= 1000000);
    }
}