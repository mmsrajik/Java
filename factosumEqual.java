Question :
Write a code to check if a given number is a strong number or not. A strong number is a number in which the sum of the factorial of the digits is equal to the number itself.

Input:

A line contains a number.

Output:

A line contains "true" if the given number is strong number, otherwise it contains "false".

Example1:

Input:

145

Output:

true

Explanation:

sum=1!+4!+5!=1+24+120=145. sum(145) is equal to the given number(145), so the given number 145 is a strong number.

Example2:

Input:

123

Output:

false

Explanation:

sum=1!+2!+3!=1+2+6=9. sum(9) is not equal to the given number(123), so the given number 123 is not strong number.

Runtime Input : 
123
Output : 
false







import java.util.*;
public class factosumEqual 
{
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);  
	int num=sc.nextInt();
	int fin=num;
	int n,k=1,tot=0;
	while(num>0)
	{
		n=num%10;
		for(int i=n;i>0;i--)
		{
			k=k*i;
		//	System.out.println(k);
		}
		tot+=k;
	//	System.out.println(tot);
		num=num/10;
		k=1;
	}
	if(fin == tot)
	{
		System.out.println("true");
	}
	else
	{
		System.out.println("false");
	}
	
	}
}
