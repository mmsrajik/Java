Question :
Given an array of integers, find a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i. Finally print the sum of array elements in the new array.
For example,
Input:
1 2 3 4 5
Output:
274
Explanation:
if input was [1, 2, 3, 4, 5], the expected new array would be [120, 60, 40, 30, 24]. The sum of array elements in the new array 274 is the output.
Note: Get inputs in command line.

Runtime Input : 
1 2 3 4 5

Output : 
274

import java.util.*;
public class arrayIndexExcludeMultiple 
{
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);  
      
	 String str=sc.nextLine();
	 String arr[]=str.split(" ");
	 int arr1[]=new int[arr.length];
	 for(int i=0;i<arr1.length;i++)
	 {
		 arr1[i]=Integer.parseInt(arr[i]);
	 }
	 int sum=0,z=1;;
	 for(int j=0;j<arr1.length;j++)
	 {
	 for(int i=0;i<arr1.length;i++)
	 {
		 if(j!=i)
		 {
		z=z*arr1[i];	 
		 }
	 }
	 sum+=z;
	 z=1;
	 }
	 
System.out.println(sum);
	}
}
