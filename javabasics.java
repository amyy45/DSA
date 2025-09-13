import java.util.*;
public class javabasics {
    public static void main(String[] args) {
        // Print "Hello, World!" to the console
        System.out.println("Hello, World!");

        // Variable declaration and initialization
        int myNumber = 42;
        String myString = "Java Basics";
        double myDouble = 3.14;
        boolean myBoolean = true;

        // Print variable values
        System.out.println("Integer: " + myNumber);
        System.out.println("String: " + myString);
        System.out.println("Double: " + myDouble);
        System.out.println("Boolean: " + myBoolean);

        // Conditional statement
        if (myNumber > 50) {
            System.out.println("myNumber is greater than 50");
        } else {
            System.out.println("myNumber is 50 or less");
        }

        // Looping through an array
        String[] fruits = {"Apple", "Banana", "Cherry"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        // Using a Scanner to get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        // Close the scanner
        scanner.close();
    }
}