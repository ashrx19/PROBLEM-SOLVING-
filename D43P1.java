import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        int exponent = scanner.nextInt();

        int result = calculatePower(base, exponent);
        System.out.println(result);
    }

    public static int calculatePower(int base, int exponent) {
        // Use Math.pow and cast the result to int
        return (int) Math.pow(base, exponent);
    }
}

// Calculate power
// Write a function named calculatePower that takes two integer, base and exponent respectively, and returns the result of raising base to the power of exponent

// Sample 1:
// Input
// Output
// 2 3
// 8