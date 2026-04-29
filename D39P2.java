import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
    		int x = sc.nextInt();
    		int y = sc.nextInt();
    		int a = sc.nextInt();
    		
    		if( (x<=a) & (y>a) ){
    		    System.out.println("YES");
    		}else{
    		    System.out.println("NO");
    		}
		}
		
	}
}


// The problem asks you to determine if a person is eligible for an exam based on their age (
// A
// A) relative to two constraints:

// Minimum Age Requirement (
// X
// X): Chef's age must be at least 
// X
// X. Mathematically, this is expressed as 
// A
// ≥
// X
// A≥X. If 
// A
// A is smaller than 
// X
// X, he is not eligible.
// Maximum Age Limit (
// Y
// Y): Chef's age must be strictly less than 
// Y
// Y. Mathematically, this is 
// A
// <
// Y
// A<Y. If 
// A
// A is equal to or greater than 
// Y
// Y, he is not eligible.
// To be eligible, BOTH conditions must be true at the same time.

// Visual Breakdown:
// A
// <
// X
// A<X: NO (Too young)
// X
// ≤
// A
// <
// Y
// X≤A<Y: YES (Perfect)
// A
// ≥
// Y
// A≥Y: NO (Too old)
// In your code, you implemented this logic using (x <= a) && (y > a). This correctly checks that the age is:

// Greater than or equal to the minimum (
// X
// X).
// Strictly less than the maximum (
// Y
// Y).
// If your code was failing, it was likely due to the bitwise operator & (which performs bit-level operations) instead of the logical operator && (which performs boolean comparison). Using && ensures that if the first condition (x <= a) is false, the computer doesn't even bother checking the second one, which is faster and safer in Java.