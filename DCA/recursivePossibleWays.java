A ‘coin vend’ kiosk is installed all the major metro stations The machine allows one to obtain cash of ‘R’ rupees in exchange for coins.
The machine operates with the following conditions:
Only coins of denomination 1 rupee and 22 rupee can be exchanged.
Coins of denomination 2 rupees should not be inserted successively twice.
The task here to find all the possible combinations of the coins that can be inserted to get rupees from the kiosk Say, R=1, then only one coin of 1 rupee can be inserted to get 1 rupee
 


Example 1:
Input: Value of R
Output:3-Different ways to insert the coins to get R rupees</p>


Explanation

The possible ways of inserting 1 rs and 1 rs coins for 3 rs in cash are
Way 1: (1,1,1) 
Way 2 : (2, 1)
Way 3 : (1, 2)



Example 2 :
Input:5- Value of R
Output:
6-Different ways to insert the coins to get R rupees


Explanation

Way 1: (1,1,1,1,1)
Way 2 : (2,1,1,1)
Way 3 : (1,1,1,2)




Way 4 : (1,1.2.1)
Way 5 : (1.2,1,1)
Way 6 : (2,1,2)

Constraints



0<R<= 50


Input format for testing
The candidate has to write the code to accept 1 input -Accept value for N(positive integer number)
Output format for testing
The output should be a positive integer number (Check the output in Example 1 and Example 2)



Solution 


import java.util.Scanner;
public class recursivePossibleWays{
    static int CountCoin(int n)
    {
        if (n == 0) {
            return 1; //ans (if 0 came, there is 1 possible, that is all the last digits are one )
        }
        if (n == 1) { //ans
            return 1;
        }
        if (n == 2) {   // ans
            return 1 + 1;
        }
        return CountCoin(n - 1) + CountCoin(n - 3);
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        System.out.println(CountCoin(n));
    }
}


