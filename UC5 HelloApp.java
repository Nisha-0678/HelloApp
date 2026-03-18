public class HelloApp {
    public static void main(String[] args) {

        // If no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Enhanced for loop (for-each)
            for (String name : args) {
                System.out.println("Hello, " + name + "!");
            }
        }
    }
}