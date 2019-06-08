Design an algorithm to accept 20 integer elements for an array and print the maximum 3 and minimum 3 elements from the array.

Note:

In output first line contains 3 minimum numbers which are separated by a space in descending order and second line contains 3 maximum numbers which are separated by a space in descending order.

Runtime Input : 
20 19 18 17 16 15 14 13 12 11 10 1 2 3 4 5 6 7 8 9
Output : 
3 2 1
20 19 18



import java.util.*;
public class minMax3 
{
	public static void main(String args[])
	{
	   Scanner sc=new Scanner(System.in);
	int arr[]=new int[20];
	int len=20;
	   for(int i=0;i<20;i++)
	{
		arr[i]=sc.nextInt();
	}
	   
	   Arrays.sort(arr);

	   int val=2;
	   for(int i=0;i<3;i++)
	   {
		   if(val>0)
		   System.out.print(arr[val]+" ");
		   else
			   System.out.print(arr[val]);
		   val--;
	   }
	   System.out.println();
	   val=len-1;
	   for(int i=0;i<3;i++)
	   {
		   if(i!=2)
			   System.out.print(arr[val]+" ");
			   else
				   System.out.print(arr[val]);
			   val--;
	   }	   
	   
	}
}
