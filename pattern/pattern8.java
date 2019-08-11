
8)

5
55555
 4444
  333
   22
    1

public class pattern8 
{
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);  
	
int val=sc.nextInt();
int z,i;
for(i=1,z=val;i<=val;i++,z--)
{
	for(int j=1;j<i;j++)
	{
		System.out.print(" ");
	}
	for(int k=val;k>=i;k--)
	{
		System.out.print(z);
	}
	System.out.println();
}
	 
	}