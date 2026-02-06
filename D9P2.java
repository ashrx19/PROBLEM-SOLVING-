// Write a Java program to reverse an array of integers and print the original and reversed arrays.

import java.util.Arrays; 

class Main {
    public static void main(String[] args) {
        
        int[] arr = {5, 2, 6, 8, 1, 6, 20};
        
        int[] reverse = new int[arr.length];
        
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reverse[j] = arr[i];
            j++;
        }
        
        System.out.println(arr.length);
        System.out.println("Array = " + Arrays.toString(arr));
        System.out.println("Reversed Array=  " + Arrays.toString(reverse));
    }
}
