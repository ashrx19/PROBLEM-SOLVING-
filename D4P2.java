import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// Problem Statement
// Write a Java program that reads an integer N from standard input and prints a right-angled triangle pattern of asterisks (*) with N rows to standard output. Each row i (where 1 ≤ i ≤ N) should contain i asterisks.