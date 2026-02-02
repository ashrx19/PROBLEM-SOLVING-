import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a + " " + b);
    }
}

// Problem Statement
// Write a Java program that reads two integers from standard input and swaps their values without using any temporary variable. The program should then print the swapped values to standard output.