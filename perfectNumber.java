Perfect Number

Create a code that tests whether an integer is a perfect number or not. A perfect number is a number that can be written as the sum of its factors, excluding the number itself. If the given number is perfect number then print "Yes", otherwise print "No".
Example1:
Input:
28
Output:
Yes
Explanation:
28 is a perfect number, since 1 + 2 + 4 + 7 + 14 = 28.

Runtime Input : 
28
Output : 
Yes



import java.util.*;
public class perfectNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();
        int sum=0;
        for(int i=1;i<val;i++)
        {
            if(val%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==val)
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
    }
}
