//find the duplicate element in the array

import java.util.Arrays; 

class Main {
    public static void main(String[] args) {
        
        int[] arr = {5, 2, 6, 8, 1, 2 ,6, 20};
        
        
        
        // int j = 0;
        for (int i=0 ; i<arr.length ; i++) {
            for (int j=i; j<arr.length ; j++){
                if(i==j){
                    continue;
                }else{
                    if(arr[i]==arr[j]){
                        System.out.println(arr[i]);
                    }
                }
                
            }
            
        }
        
    }
}
