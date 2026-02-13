// Write a Java program to find the nth largest element in an array of integers.

import java.util.Arrays; 

class Main {
    public static void main(String[] args) {
        int[] arr = {5, 1, 9, 7,3 ,2};
        Arrays.sort(arr);
        int[] reverse = new int[arr.length];
        
        //reverse
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reverse[j] = arr[i];
            j++;
        }
        
        
        int target=2;
        //1259
        System.out.println(reverse[target-1]);
            
        }
        
    }


