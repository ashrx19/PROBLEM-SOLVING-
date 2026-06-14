import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		for(int i = 0; i < t; i++)
		{
    		int x = read.nextInt();
    		int y = read.nextInt();
    		
    		// Top 10 participants get X
    		int prize_top10 = 10 * x;
    		
    		// Ranks 11 to 100 is 90 participants (100 - 11 + 1 = 90)
    		int prize_11to100 = 90 * y;
    		
    		System.out.println(prize_top10 + prize_11to100);
		}
	}
}