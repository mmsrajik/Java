
5)

5
EDCBA
EDCB
EDC
ED
E

public class pattern5 
{
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);  
	
int val=sc.nextInt();

for(int i=0;i<=val-1;i++)
{
	for(int j=val-1;j>=i;j--)
	{
		System.out.print((char)(j+65));
		
	}
	System.out.println();
}
	 
	}
}
