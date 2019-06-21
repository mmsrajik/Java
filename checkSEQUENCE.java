
Given an array and you need to first find whether the given array is bitoni array.  An array is said to be bitonic if it has an increasing sequence of integers followed immediately by a decreasing sequence of integers. If the given array is a bitonic array, then find the maximum value of the array. 
Example:
Input:
1 4 8 3 2
Output:
8
Note1: If the given array is not a bitonic array, then print "Invalid Input".

Note2: The array elements are given in command line.

Command Line Arguments : 
1 4 8 3 2
Runtime Input : 
Output : 
8


import java.util.*;
public class checkSEQUENCE 
{
	public static void main(String args[])
	{
	// Scanner sc=new Scanner(System.in);  
		int arr[]=new int[args.length];
		for(int i=0;i<args.length;i++)
		{
			arr[i]=Integer.parseInt(args[i]);
		}
	
		int tot=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]<arr[i+1])
			{
				i++;
			}
			if((arr[i+1]<arr[i]) && i>1 )
			{
				tot++;
			}
		}
		if(tot>0)
		{
			Arrays.sort(arr);
			System.out.print(arr[arr.length-1]);
		}
	 
	 
	 
	
	}
}
