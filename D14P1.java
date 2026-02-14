import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int B, H;
    static Scanner sc = new Scanner(System.in);
    
    static {
        B = sc.nextInt();
        H = sc.nextInt();
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try {
            if (B<=0 || H<=0) {
                throw new Exception("Breadth and height must be positive");
            }
            System.out.println(B * H);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

