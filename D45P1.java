import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            while (t-- > 0) {
                int num = sc.nextInt();
                if (isEven(num)) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            }
        }
    }
    
    // Corrected function: returns true if even, false if odd
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}