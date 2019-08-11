
6)

5
    *
   **
  ***
 ****
*****

public class pattern6 
{
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);  
	
int val=sc.nextInt();

for(int i=1;i<=val;i++)
{
	for(int j=val;j>i;j--)
	{
		System.out.print(" ");
	}
	for(int j=0;j<i;j++)
	{
		System.out.print("*");
	}
	System.out.println();
}
	 
	}
}
