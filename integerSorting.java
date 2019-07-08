Question :
Your task is to make a code that can take any non-negative integer as a argument and return it with its digits in descending order. Essentially, rearrange the digits to create the highest possible number.

Example:
Input: 21445 

Output: 54421



import java.util.*;
public class integerSorting
{
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);  
int val=sc.nextInt();
if(val>=0)
{
	int len=(Integer.toString(val)).length();
	int arr[]=new int[len];
	int in,z=0;
	while(val>0)
	{
	 in=val%10;
	 arr[z]=in;
	 val=val/10;
	 z++;
	}
	int temp;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]<arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	
	for(int k=0;k<arr.length;k++)
	{
		System.out.print(arr[k]);
	}
	
}
	}
}
