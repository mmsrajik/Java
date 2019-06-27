
Question :
Create a code that takes a number as input and returns its multiplicative persistence, which is the number of times you must multiply the digits in number until you reach a single digit.
Example:
Input:
39
Output:
3
Explanation:
3*9=27, 2*7 = 14, 1*4=4 and 4 has only one digit.

Runtime Input : 
39
Output : 
3

import java.util.*;
public class multiplicativePersistence
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int j=1,c=0,k;
        while(num>9)
        {
            j=1;
            c++;
            while(num!=0)
            {
                k=num%10;
                j=j*k;
                num/=10;
            }
            num=j;
        }
        System.out.println(c);
    }
}
