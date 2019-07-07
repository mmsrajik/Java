Question :
Find Array Elements Difference


Write a program that accepts two arguments: an array of integers and another integer n. Determine the number of times where two integers in the array have a difference of n.
Input format:
First line contains size of the array and second line contains array elements. Third line contains an integer n.
Output format:
A line contains a integer to denote the number of times where two integers in the array have a difference of n.
Example:
Input:
7
1 1 5 6 9 16 27
4
Output:
3
Explanation:
Two integers in the array have a difference of 4:[1, 5], [1, 5], [5, 9], So the output is 3.

Runtime Input : 
7
1 1 5 6 9 16 27
4
Output : 
3


import java.util.*;
public class arrayElementsDifference 
{
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);  
int val=sc.nextInt();
int arr[]=new int[val];
for(int i=0;i<val;i++)
{
	arr[i]=sc.nextInt();
}
int n=sc.nextInt();
int count=0,inter;
for(int i=0;i<val-1;i++)
{
	for(int j=i+1;j<val;j++)
	{
	if(arr[i]>arr[j])
	{
		inter=arr[i]-arr[j];
		if(inter==n)
		{
			count++;
		}
		inter=0;
	}
	else
	{
		inter=arr[j]-arr[i];
		if(inter==n)
		{
			count++;
		}
		inter=0;
	}
	
	
	}
}

System.out.println(count);


	}
}
