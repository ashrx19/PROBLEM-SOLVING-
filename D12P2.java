//move all the zero to the end of the array 


import java.util.Arrays; 

class Main {
    public static void main(String[] args) {
        
        int[] arr = {1,9,2,3,4,0,5,0,6,7,8};
        int[] newArr= new int[arr.length];
        
        
        int j=0;
        for (int i = 0; i<=arr.length; i++) {
            if(0!= arr[i]){
                newArr[j] = arr[i];
                System.out.println("New Array=  " + Arrays.toString(newArr));
                j++;
            }
         }

        System.out.println("Array = " + Arrays.toString(arr));
        System.out.println("New Array=  " + Arrays.toString(newArr));
        
    }
}
