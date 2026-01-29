Task
// Given an integer, , perform the following conditional actions:

// If  is odd, print Weird
// If  is even and in the inclusive range of  to , print Not Weird
// If  is even and in the inclusive range of  to , print Weird
// If  is even and greater than , print Not Weird
// Complete the stub code provided in your editor to print whether or not  is weird.

// Input Format

// A single line containing a positive integer, .

// Constraints

// Output Format

// Print Weird if the number is weird; otherwise, print Not Weird.

// Sample Input 0

// 3
// Sample Output 0

// Weird
// Sample Input 1

// 24
// Sample Output 1

// Not Weird


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        int Weird=0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        if(num%2 != 0 && num<=100 ){
            Weird=1;
        }else{
            if(num>=2 && num<=5){
                Weird=0;
            }else if(num>=6 && num<=20) {
                Weird=1;
            }else if(num>20 && num<=100) {
                Weird=0;
            }
        }
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        sc.close();
        
        if(Weird == 0){
            System.out.println("Not Weird");
        }else{
            System.out.println("Weird");
        }
    }
}
