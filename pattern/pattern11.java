
11)

5
    A
   CCC
  EEEEE
 GGGGGGG
IIIIIIIII



public class pattern11 
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
		System.out.print((char)(z+65));
	}
	System.out.println();
	k=k+2;
	z=z+1;
}
	 
	}
}
