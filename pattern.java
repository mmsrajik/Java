
Generate the pattern for the given input value.

Input:

4

Output:
1 1 1 1 3
4 2 2 2 2
3 3 3 3 5
6 4 4 4 4


import java.util.*;
public class pattern 
{
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);  
	int num=sc.nextInt();
int k=1;

	for(int i=0;i<num;i++)
	{
		if(i%2==0)
		{
			for(int j=0;j<num+1;j++)
			{
			 if(j==(num+1)-1)
			 {
				 System.out.print(k+2);
			 }
			 else
			 {
				 System.out.print(k+" ");
			 }
			}
			k++;
		}
		else 
		{
			for(int j=0;j<num+1;j++)
			{
				if(j==0)
				{
					System.out.print((k+2)+" ");
				}
				else if(j==(num+1)-1)
				{
					System.out.print(k);
				}
				else
				{
					System.out.print(k+" ");
				}								
			}
			k++;
		}
		
		System.out.println();
	}
	
	}
}
