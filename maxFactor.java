
Question :
Given integer N, you need to find four integers A,B,C,D, such that they're all factors of N (A/N,B/N,C/N,D/N), and N=A+B+C+D. Your goal is to maximize (A*B*C*D).
Input format:
A line contains an Integer N.
Output format:
A line contains the answer (A*B*C*D). 
Note: If there is no way to find such four numbers,output -1.

Runtime Input : 
8
Output : 
16

import java.util.*;
public class maxFactor 
{
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);  
int n=sc.nextInt();
int a,b,c,d;
int mid=n/4;
int res;
if(n%mid==0)
{
	a=b=c=d=mid;
	res=a*b*c*d;
	System.out.println(res);
}
else
{
	System.out.println("-1");
}

	
	
	}
}
