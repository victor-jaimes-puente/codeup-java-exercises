public class ServerNameGenerator {
    static String[] adj = {"Ancient", "Black", "Critical", "Demented", "Enlightened","Florescent", "Gangster",
            "Horrendous",
            "Intoxicated",
            "Jacked"};
    static String[] noun = {"Ape", "Buffalo", "Cobra", "Dog", "Eagle","Fox", "Goat", "Hawk", "Impala", "Jackal"};

    public static String getRandomEle(String[] arr){
        int index = (int)(Math.random() * ((arr.length - 1) + 1));
        return arr[index];
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Here is your server name: ");
        String message = String.format("%s %s", getRandomEle(adj), getRandomEle(noun));
        System.out.println(message);

    }
}