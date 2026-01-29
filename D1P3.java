// Task
// In this challenge, you must read  integers from stdin and then print them to stdout. Each integer must be printed on a new line. To make the problem a little easier, a portion of the code is provided for you in the editor below.

// Input Format

// There are  lines of input, and each line contains a single integer.

// Sample Input

// 42
// 100
// 125
// Sample Output

// 42
// 100
// 125

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String myString = scanner.next();
        int myInt1 = scanner.nextInt();
        int myInt2 = scanner.nextInt();
        int myInt3 = scanner.nextInt();
        scanner.close();

        //System.out.println("myString is: " + myString);
        System.out.println(myInt1);
        System.out.println(myInt2);
        System.out.println(myInt3);
        
    }
}