import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int H = sc.nextInt();
		
		System.out.println(X + Y*(H-1)
);

	}
}


// Parking Charges
// Chef needs to park her car while she watches a movie. The parking charges at the theater are as follows:

// Rs. 
// X
// X for the first 1 hour
// Rs. 
// Y
// Y for every extra hour after the first hour
// If Chef parks her car for 
// H
// H hours, what is the total parking charges that she should pay?

// Input Format
// The only line of the input will contain three space separated integers - 
// X
// X, 
// Y
// Y, and 
// H
// H.

// Output Format
// Output a single integer, which should be the total amount that Chef pays as parking charge.

// Constraints
// 1
// ≤
// X
// ≤
// 100
// 1≤X≤100
// 1
// ≤
// Y
// ≤
// 100
// 1≤Y≤100
// 1
// ≤
// H
// ≤
// 100
// 1≤H≤100
// Sample 1:
// Input
// Output
// 10 1 5
// 14
// Explanation:
// X
// =
// 10
// X=10, which means that for the first hour, Chef has to pay Rs. 10.
// Y
// =
// 1
// Y=1, which means that for every extra hour, Chef has to pay Rs. 1.
// Chef needs to park for 
// H
// =
// 5
// H=5 hours.

// So, for the first hour, she will pay Rs. 
// 10
// 10. And for the 
// 5
// −
// 1
// =
// 4
// 5−1=4 hours extra, she will pay 
// 4
// ∗
// 1
// =
// 4∗1=Rs. 
// 4
// 4. So in total, she has to pay 
// 10
// +
// 4
// =
// 10+4= Rs. 
// 14
// 14.

// Sample 2:
// Input
// Output
// 1 10 100
// 991
// Explanation:
// X
// =
// 1
// X=1, which means that for the first hour, Chef has to pay Rs. 1.
// Y
// =
// 10
// Y=10, which means that for every extra hour, Chef has to pay Rs. 10.
// Chef needs to park for 
// H
// =
// 100
// H=100 hours.

// So, for the first hour, she will pay Rs. 
// 1
// 1. And for the 
// 100
// −
// 1
// =
// 99
// 100−1=99 hours extra, she will pay 
// 99
// ∗
// 10
// =
// 99∗10=Rs. 
// 990
// 990. So in total, she has to pay 
// 1
// +
// 990
// =
// 1+990= Rs. 
// 991
// 991.

// Sample 3:
// Input
// Output
// 10 15 1
// 10
// Explanation:
// X
// =
// 10
// X=10, which means that for the first hour, Chef has to pay Rs. 10.
// Y
// =
// 15
// Y=15, which means that for every extra hour, Chef has to pay Rs. 15.
// Chef needs to park for 
// H
// =
// 1
// H=1 hours.

// So, for the first hour, she will pay Rs. 
// 10
// 10. And she does not have to pay any more. So in total, she has to pay Rs. 
// 10
// 10.