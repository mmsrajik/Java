
Question :
Disarium number is the number that The sum of its digits powered with their respective positions is equal to the number itself.
Given a number, Find if it is Disarium or not .
Note:
Number passed is always Positive .
Input format:
A line contains a positive integer.
Output format:
A line contains "YES" if the given integer is Disarium number, otherwise it contains "NO" if the given integer is not a Disarium number. 
Example:
Input:
89
Output:
YES
Explanation:
Since, 81 + 92 = 89, thus output is "YES"

Runtime Input : 
89
Output : 
YES

import java.util.*;
import java.math.*;
public class sumDigitsPoweredPosition
{
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);  
int sum=0;
int num=sc.nextInt();
int val,i,temp=num;
int len=(Integer.toString(num)).length();
i=len;
while(num>0 && i>0)
{
	
	val=num%10;
	sum=sum+(int)Math.pow(val, i);
	i--;
	num=num/10;
	
}


if(sum==temp)
{
	System.out.println("YES");
}
else
{
	System.out.println("NO");
}	 	
	}
}
