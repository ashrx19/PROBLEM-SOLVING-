import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
	    Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		
		// Loop through each test case
		for(int i = 0; i < t; i++)
		{
		    int x = read.nextInt();
		    
		    // Distance = 2 (round trip) * X (distance) * 5 (days)
		    int totalDistance = 2 * x * 5;
		    
		    System.out.println(totalDistance);
		}
	}
}