import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
	    Scanner read = new Scanner(System.in);
		
		// Read the number of test cases
		int t = read.nextInt();
		
		// Loop through each test case
		for(int i = 0; i < t; i++)
		{
        	// Accept the two space-separated integers
        	int x = read.nextInt();
        	int y = read.nextInt();
        	
        	// Calculate the total tuition fees
        	int tuition = x * y;
        	
        	// Print the result
        	System.out.println(tuition);
		}
		
		read.close();
	}
}