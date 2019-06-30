Question :
Given any number, we can create a new number by adding the sums of squares of digits of that number. For example, given 203, our new number is 4 + 0 + 9 = 13. If we repeat this process, we get a sequence of numbers: 203 -> 13 -> 10 -> 1 -> 1.
Sometimes, like with 203, the sequence reaches (and stays at) 1. Numbers like this are called happy.
Not all numbers are happy. If we started with 11, the sequence would be:11 -> 2 -> 4 -> 16 -> ...
This sequence will never reach 1, and so the number 11 is called unhappy.
Given a positive whole number, you have to determine whether that number is happy or unhappy. If the given number is happy then print "Happy", otherwise print "UnHappy".

Note:You can assume (and it is actually true!) that all positive whole numbers are either happy or unhappy. Any happy number will have a 1 in its sequence, and every unhappy number will have a 4 in its sequence.

Runtime Input : 
203
Output : 
Happy


import java.util.*;
import java.math.*;
public class squareSum 
{
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);  
int n=sc.nextInt();
 int sum=0,val;
 while(sum!=1)
 {
	 
	 if(n==1)
		{
			System.out.print("Happy");
			System.exit(0);
		}
		if(n==4)
		{
			System.out.println("UnHappy");
					System.exit(0);
		}
	 while(n>0)
	 {
	 val=n%10;
	 sum+=(int)Math.pow(val, 2);
	 n=n/10;
	 }
	n=sum;
	
	sum=0;
 }
 
	
	
	
	}
}
