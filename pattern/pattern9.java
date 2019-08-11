
9)

5
    *
   ***
  *****
 *******
*********


public class pattern9 
{public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);  
	int k=1;
int val=sc.nextInt();

for(int i=1;i<=val;i++)
{
	for(int j=val;j>i;j--)
	{
		System.out.print(" ");
	}
	for(int j=0;j<k;j++)
	{
		System.out.print("*");
	}
	System.out.println();
	k=k+2;
}
	 
	}
}
