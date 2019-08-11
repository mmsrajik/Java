
10)

5
    1
   222
  33333
 4444444
555555555



public class pattern10 
{
public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);  
	int k=1,i,z;
int val=sc.nextInt();

for(i=1,z=0;i<=val;z++,i++)
{
	for(int j=val;j>i;j--)
	{
		System.out.print(" ");
	}
	for(int j=0;j<k;j++)
	{
		System.out.print(k-z);
	}
	System.out.println();
	k=k+2;
}
	 
	}
}
