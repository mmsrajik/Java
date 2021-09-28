A ‘coin vend’ kiosk is installed all the major metro stations The machine allows one to obtain cash of ‘R’ rupees in exchange for coins.
The machine operates with the following conditions:
Only coins of denomination 1 rupee and 22 rupee can be exchanged.

The task here to find all the possible combinations of the coins that can be inserted to get rupees from the kiosk Say, R=1, then only one coin of 1 rupee can be inserted to get 1 rupee

slightly alter question compared tpo original question. Here 2 can come one after other.

import java.util.Scanner;
public class recursivePossibleWays2{
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
        
        if (n ==3){ // ans
            return 3;
        }
    
        return CountCoin(n - 1) + CountCoin(n - 2);
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        System.out.println(CountCoin(n));
    }
}