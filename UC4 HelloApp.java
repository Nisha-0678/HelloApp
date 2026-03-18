public class HelloApp {
    public static void main(String[] args) {
        
        // Check if any arguments are passed
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Loop through all arguments and print greeting
            for (String name : args) {
                System.out.println("Hello, " + name + "!");
            }
        }
    }
}