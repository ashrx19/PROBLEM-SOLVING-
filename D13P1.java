//move all the zero to the end of the array 


import java.util.Arrays; 

class Main {
    public static void main(String[] args) {
        
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,7,8,9,2,5};
        //int[] intersection= new int[arr1.length];

        
        
        //int index=0;
        for (int i = 0; i<=arr1.length-1; i++) {
            for (int j = 0; j<=arr2.length-1; j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                    //index++;
                    break;
                    
                }
            }
         }

        System.out.println("Array1 = " + Arrays.toString(arr1));
        System.out.println("Array2=  " + Arrays.toString(arr2));
        //System.out.println("Intersection=  " + Arrays.toString(intersection));
        
    }
}
