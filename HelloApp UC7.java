public class HelloApp {
    public static void main(String[] args) {
        
        // If no arguments, print default greeting
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Join all arguments with ", "
        String names = String.join(", ", args);

        // Print greeting
        System.out.println("Hello, " + names + "!");
    }
}