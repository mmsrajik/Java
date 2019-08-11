
3)

5
ABCDE
ABCDE
ABCDE
ABCDE
ABCDE

public class pattern3 
{
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);  
	 char j;
	 int a;
int val=sc.nextInt();

for(int i=1;i<=val;i++)
{
	for(j='A',a=1;a<=val;j++,a++)
	{
		System.out.print(j);
		
	}
	System.out.println();
}
	 
	}
}
