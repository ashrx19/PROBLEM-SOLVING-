// Print factorial
// Write a program that uses a do-while loop to find the factorial of a given input number.

import java.util.Scanner;

class Codechef
{
    public static void main (String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        

        if(num == 0) {
            System.out.println(1);
        } else {
            int factorial = 1;
            int i = num;
            
            do {
                factorial *= i; // Multiply current total by i
                i--;            // Decrement i
            } while (i > 0);    // Continue until i reaches 0
    
            System.out.println(factorial);
        }
    }
}