//move all the zero to the end of the array 


import java.util.Arrays; 

class Main {
    public static void main(String[] args) {
        
        String[] arr = {"M","A","D","E","M"};
        //String[] arr = {"M","A","D","A","M"};
        
        
        //reverse 
        String[] rev= new String[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            rev[j] = arr[i];
           j++;
        }

        //palindrome check
        int check = 1;
        for (int i=0 ; i<arr.length ; i++) {
            if(!arr[i].equals(rev[i])){
                check=0;
                break;
            }
        }
            
        //System.out.println(arr.length);
        System.out.println("Array = " + Arrays.toString(arr));
        System.out.println("Reversed Array=  " + Arrays.toString(rev));
        if(check==0){
            System.out.println("Not a Palindrome!!!");
        }else{
            System.out.println("Palindrome!!!");
            
        }
    }
}
