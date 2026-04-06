public class HelloApp {
    public static void main(String[] args) {
        // If no arguments, print default greeting
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Build greeting string
        String names = "";
        for (String arg : args) {
            names += arg + ", ";
        }

        // Remove trailing ", " using substring
        names = names.substring(0, names.length() - 2);

        // Print final greeting
        System.out.println("Hello, " + names + "!");
    }
}