import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        char operator = sc.next().charAt(0);
        
        switch(operator){
            
            case '+':
                System.out.println(num1 + num2);
                break;
                
            case '-':
                System.out.println(num1 - num2);
                break;
                
            case '*':
                System.out.println(num1 * num2);
                break;
                
            case '/':
                System.out.println(num1 / num2);
                break;
            
            default:
                System.out.println("Invalid");
        }
        
        
        
        
    }
}


// Arithmetic operation
// Write a program that takes two numbers and an operator (+, -, *, /) as input. Use a switch statement to perform the corresponding arithmetic operation and print the result.

// Sample 1:
// Input
// Output
// 5 2 +
// 7