import java.util.Scanner;

public class Recursion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer to calculate its factorial: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            long factorial = calculateFactorial(n);
            System.out.println("Factorial of " + n + " is: " + factorial);
        }

        scanner.close();
    }

    // Recursive method to calculate factorial
    private static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}

 
    

