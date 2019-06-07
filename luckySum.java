check whether the input number is formed by 2 lucky numbers or not

Riyak loves lucky numbers. The lucky numbers are the positive integers whose decimal representations contain only the lucky digits 4 and 7. For example, numbers 47, 744, 4 are lucky and 5, 17, 467 are not.
A positive integer n is given. You need find number of times lucky digits(any lucky digit) required to get n by performing sum, see below examples for clear understanding
Example 1:
Input: 11
Output: 2
Explanation: We can get 11 by using lucky digit 4 once and 7 once.i.e.7+4=11. so, lucky digit required is 2(4 once and 7 once).
Example 2:
Input: 29
Output: 5
Explanation: We can get 11 by using lucky digit 4 two times and 7 three times .i.e.(7x3)+(4x2)=29. . so, lucky digit required is 5(4 twice and 7 thrice).
Input
The single line contains an integer n which is the sum of digits of the required lucky number.
Output
Print on the single line the result — the number of times lucky digit required.
Note: If not able to get n by using lucky number, then print -1.











import java.util.Scanner;


public class luckySum 
{
	

	
	

	public static void main(String args[])
	{
	   Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int val=0;
		int l1=7,l2=4,x;
		int count=0;
	//	
		int flag=1;
		x=l1;
		while(true)
		{
	   val+=x;
	   count++;
	   if(val==num)
	   {
		   System.out.println(count);
		   break;
	   }
	   else if(val<num)
	   {
		   
		   if(flag%2!=0)
		   {
			   x=l2;
		   }
		   else if(flag%2==0)
		   {
			   x=l1;
		   }
	   }
	   else if(val>num)
	   {
		   break;
	   }
	   flag++;
		}
	   
	//	
		
		if(val>num)
		{
			val=0;
			count=0;
			
			 flag=1;
			x=l2;
			while(true)
			{
		   val+=x;
		   count++;
		   if(val==num)
		   {
			   System.out.println(count);
			   break;
		   }
		   else if(val<num)
		   {
			   
			   if(flag%2!=0)
			   {
				   x=l1;
			   }
			   else if(flag%2==0)
			   {
				   x=l2;
			   }
		   }
		   else if(val>num)
		   {
			   break;
		   }
		   flag++;
			}
			
		}
		
		
		
		//
		
		if(val>num)
		{
			val=0;
			count=0;
			while(true)
			{
				x=l1;
		   val+=x;
		   count++;
		   if(val==num)
		   {
			   System.out.println(count);
			   break;
		   }
		   else if(val>num)
		   {
			   break;
		   }
		
		
			}
		}
		
		
		//
		
		
		if(val>num)
		{
			val=0;
			count=0;		
			while(true)
			{
				x=l2;
		   val+=x;
		   count++;
		   if(val==num)
		   {
			   System.out.println(count);
			   break;
		   }
		   else if(val>num)
		   {
			   break;
		   }
		
		
			}
		}
		
		
		
		
		
		
		//
		if(val>num)
		   {
			System.out.println("-1");
		   }
		
		
		
		
	}
}
