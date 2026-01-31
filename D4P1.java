import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
                count++;
            }
        }

        System.out.println(count);
    }
}
// Problem Statement
// Write a Java program that reads a string from standard input and counts the number of vowels (a, e, i, o, u) in the string, regardless of case. The program should then print the count of vowels to standard output.
