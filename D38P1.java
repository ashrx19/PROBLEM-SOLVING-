// First occurrence
// Write a program using a for loop to find and print the index of the first occurrence of the number 8 in the array {2, 4, 8, 12, 8}.

// Sample 1:
// Input
// Output
// 2

class Codechef
{
	public static void main (String[] args) 
	{
		int[] numbers = {2, 4, 8, 12, 8};
        
        for(int i=0; i<4; i++){
            
            if(numbers[i]==8){
                System.out.println(i);
            }
            
            
        }

	}
}
