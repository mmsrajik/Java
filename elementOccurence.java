Question :
Given an array A[]  of n elements. Your task is to complete the Function num which returns an integer denoting the total number of times digit k appears in the whole array.
For Example:
Input:
5 (size of the array)
11 12 13 14 15 (array elements)
1 (value of k)
Output:
6  (count of the digit k in the array)



import java.util.*;
public class elementOccurence 
{
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);  
int len=sc.nextInt();
int arr[]=new int[len];
for(int i=0;i<len;i++)
{
	arr[i]=sc.nextInt();
}
int k=sc.nextInt();
int count=0,in;
for(int i=0;i<len;i++)
{
	while(arr[i]>0)
	{
		in=arr[i]%10;
		if(in==k)
		{
			count++;
		}
		arr[i]/=10;
	}
	
}
System.out.println(count);

	}
}
