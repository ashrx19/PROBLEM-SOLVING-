import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        
        for(int i = 1; i <= N; i++){
            System.out.println(i);
        }

        bufferedReader.close();
    }
}


// Task
// Given an integer N, print the first N natural numbers.

// Input Format

// A single integer, N.

// Constraints

// 1 <= N <= 1000

// Output Format

// Print the first N natural numbers, each on a new line.

// Sample Input

// 5

// Sample Output

// 1
// 2
// 3
// 4
// 5
