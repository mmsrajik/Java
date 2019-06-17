Question :
Given an array of integers, find and print the maximum number of integers you can select from the array such that the absolute difference between any two of the chosen integers is less than or equal to 1.
Examples:
Input array:
10 (size of the array)
6 4 6 8 5 9 9 9 10 3 (array elements)
Output: 
4
Explanation:
The input array is: 6, 4, 6, 8, 5, 9, 9, 9, 10, 3
No we can pick up different sets for which the absolute difference between any two numbers in the set is 1.
Possible sets are:
{6, 6, 5} {4, 5} {8, 9, 9, 9} {9, 9, 9, 10} {4, 3}
Thus maximum no of picked up elements is: 4  - {9, 9, 9, 10}


Runtime Input : 
10
6 4 6 8 5 9 9 9 10 3
Output : 
4

import java.util.*;
public class possibleMaxPickedElements 
{
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);  

	 int num=sc.nextInt();
	 int arr[]=new int[num];
	 ArrayList<Integer> al=new ArrayList<Integer>();
	 String str="";
	 for(int i=0;i<num;i++)
	 {
		 arr[i]=sc.nextInt();
	 }
	 
	 int end=0;
	 int ab=0;
	 int maxnum=0;
	 for(int i=0;i<num-1;i++)
	 {
		 for(int j=i+1;j<num;j++)
		 {
			 if(end==1)
			 {
				 if(ab==arr[j])
				 {
					al.add(arr[j]);
				 }
							 
			 }
		 else if(arr[i]==arr[j])
			 {
				 if(al.isEmpty())
				 {
					 al.add(arr[i]);
				 }
				 al.add(arr[i]);
			 }
			 else if(arr[i]>arr[j])	
			 {
				 
				 
				 if((arr[i]-arr[j])<=1)
				 {
					 if(al.isEmpty())
					 {
						 al.add(arr[i]);
					 }
					 ab=arr[j];
					 al.add(arr[j]);
					 
					 end=1;
				 }
				
			 }
			 else if(arr[i]<arr[j])	
			 {
				 
				 
				 if((arr[j]-arr[i])<=1)
				 {
					 if(al.isEmpty())
					 {
						 al.add(arr[i]);
					 }
					 
					 ab=arr[j];
					 al.add(arr[j]);
					 end=1;
				 }
				
			 }
			 
			 
			 
			 if(j==num-1)
			 {
				 
				if(al.size()>maxnum)
				{
					maxnum=al.size();
				}
				 al.clear();
				 end=0;
			 }
			 
			 
		 }
	 }

	 System.out.println(maxnum);
	}
}
