Generate the following pattern for the given value input n.
Input:
5
Output:
*****
 *   *
  *   *
   *   *
    *****




import java.util.Scanner;
public class pattern 
{
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);  
int n=sc.nextInt();
for(int i=0;i<n;i++)
{
	for(int j=0;j<i;j++)
	{
System.out.print(" ");
	}
	if(i==0 || i==n-1)
	{
		for(int k=0;k<n;k++)
		{
		System.out.print("*");
		}
    }
	else
	{
		for(int k=0;k<n;k++)
		{
			if(k==0 || k==n-1)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
	}
	
	System.out.println();
	
	 
}	 
	}
}
