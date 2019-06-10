Question :
An integer array is given as input which may contains both positive and negative numbers. Design an algorithm to remove all duplicate elements. Print the resulting array in ascending order.

Input format:

First line contains an integer n and second line contains n integers which are separated by a space.

Output format:

A line contains resulting array elements which are separated by a space.

Runtime Input : 
5
3 2 5 2 1
Output : 
1 3 5



import java.util.*;
public class removeDuplicateAndOrder
{
	public static void main(String args[])
	{
	   Scanner sc=new Scanner(System.in);  
	 int num=sc.nextInt();
     
	 int arr[]=new int[num];
	  int arr1[]=new int[num];
	ArrayList al=new ArrayList();
	  for(int i=0;i<num;i++)
	 {
		arr[i]=sc.nextInt();
	 }
	for(int i=0;i<num;i++)
	{
		for(int j=0;j<num;j++)
		{
			if(arr[i]==arr[j])
			{
				arr1[i]++;
			}
		}
	}
	for(int i=0;i<num;i++)
	{
		if(arr1[i]==num)
		{
			System.out.print(arr[i]);
			System.exit(1);
		}
	else if(arr1[i]>1)
	{
	}
	
	else
	{
		al.add(arr[i]);
	}
	
	}
	Collections.sort(al);
Object[] narr=al.toArray();
	for(int i=0;i<narr.length;i++)
	{
		if(i==(narr.length-1))
		{
			 System.out.print(narr[i]);
		}
		else
		{
			 System.out.print(narr[i]+" ");
		}
		
	}
	
	
	}
}
