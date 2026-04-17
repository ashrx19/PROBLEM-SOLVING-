import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int add = a+b;
		int mul = a*b;
		
		
		int result = Math.abs(mul - add);
		System.out.println(result);
		
	}
}
