import java.util.Scanner; // Import the Scanner class

public class vishal1 {
    public static void main(String[] args) {
        // Create a Scanner object to read from standard input (keyboard)
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Reads a line of text

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Reads an integer

        System.out.println("Hello " + name + ", you are " + age + " years old.");

        // Always close the scanner when done to free up resources
        scanner.close(); 
    }
}
