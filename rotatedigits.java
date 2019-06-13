Question :
Truck loves to preform different operations on arrays, and so being the principal of ATV School, he assigned a task to his new student Risvi. Risvi will be provided with an integer array A of size N and an integer K , where she needs to rotate the array in the right direction by K steps and then print the resultant array. As she is new to the school, please help her to complete the task.

Input:
The first line consists of two integers N and K, N being the number of elements in the array and K denotes the number of steps of rotation.
The next line consists of N space separated integers , denoting the elements of the array A.

Output:
Print the resultant array.

Runtime Input : 
5 2
1 2 3 4 5
Output : 
4 5 1 2 3

import java.util.*;
public class rotatedigits 
{
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);  
	int num=sc.nextInt();
	int k=sc.nextInt();
	int arr[]=new int[num];
	for(int i=0;i<num;i++)
	{
		arr[i]=sc.nextInt();	
	}
	for(int i=num-k;i<num;i++)
	{
		System.out.print(arr[i]+" ");
	}
	for(int i=0;i<num-k;i++)
	{		
	if(i==(num-k)-1)
	{
	      System.out.print(arr[i]);
	}
	else
	{
			System.out.print(arr[i]+" ");
	}
	}
	

	
	}
}
