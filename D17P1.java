// Simple Interest = (P x T x R)/100 

// Example 1:

// Input :  P = 10000
//          R = 5
//          T = 5
// Output : 2500

// Explanation - We need to find simple interest on 
// Rs. 10, 000 at the rate of 5% for 5 
// units of time.

// Example 2:

// Input :  P = 3000
//          R = 7
//          T = 1
// Output : 210
import java.io.*;

class GFG {
    public static void main(String args[])
    {
        // We can change values here for
        // different inputs
        float P = 1, R = 1, T = 1;

        /* Calculate simple interest */
        float SI = (P * T * R) / 100;
        System.out.println("Simple interest = " + SI);
    }
}