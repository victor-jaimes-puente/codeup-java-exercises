public class MethodsExercises {
    public static void main(String[] arg) {
        System.out.println();
        System.out.println(sayHello("Victor", 27));
    }

    public static String sayHello(String name) {

        return String.format("Hello " + name);
    }

    //    VERSION.2
    public static String sayHello(String name, Integer age) {
        return String.format("Hello, I am " + name + "\nI am " + age + " years old");
    }
}