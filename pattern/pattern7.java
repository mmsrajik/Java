
7)

5
    A
   AB
  ABC
 ABCD
ABCDE


public class pattern7 
{
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);  
	
int val=sc.nextInt();
int k;
char a;
for(int i=1;i<=val;i++)
{
	for(int j=val;j>i;j--)
	{
		System.out.print(" ");
	}
	for(k=1,a='A';k<=i;a++,k++)
	{
		System.out.print(a);
	}
	System.out.println();
}
	 
	}
}
