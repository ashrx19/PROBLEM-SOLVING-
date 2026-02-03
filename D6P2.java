import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        for (int qi = 0; qi < q; qi++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int sum = a;
            int temp = 1;   // represents 2^i

            for (int i = 0; i < n; i++) {
                sum += temp * b;
                System.out.print(sum + " ");
                temp = temp * 2;   // move to next power of 2
            }

            System.out.println();
        }

        sc.close();
    }
}

// Problem Statement
// Given q queries, each query consists of three integers a, b, and n. For each query, you need to print the series: a + 2^0 * b, a + 2^0 * b + 2^1 * b, ..., up to n terms.
