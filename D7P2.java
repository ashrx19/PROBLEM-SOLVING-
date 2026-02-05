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
        
        if(N % 2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        bufferedReader.close();
    }
}


// Task
// Given an integer, determine whether it is Even or Odd.

// Input Format

// A single integer, N.

// Constraints

// -1000 <= N <= 1000

// Output Format

// Print "Even" if the number is even, otherwise print "Odd".

// Sample Input

// 7

// Sample Output

// Odd
