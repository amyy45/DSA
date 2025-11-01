import java.util.Scanner; 
public class sum_two_number {
    static int sumTwoNumbers(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers to sum:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sumTwoNumbers(num1, num2));
        scanner.close();
    }
}
