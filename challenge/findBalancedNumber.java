import java.util.Scanner;
public class findBalancedNumber 
{
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);  

String str=sc.next();
int len=str.length();
int half=0,a=0,b=0,flag=0;
if(len==1)
{
	System.out.println("Balanced");
	System.exit(0);
}
else if(len%2==0)
{
	half=len/2;
	flag=1;
}
else
{
	flag=2;
	half=len/2;
}
	 int i,j;
	 
	 if(flag==1)
	 {
		 for(i=0,j=len-1;i<half-1;i++,j--)
		 {
			 a+=Integer.parseInt(str.substring(i,i+1));
			 b+=Integer.parseInt(str.substring(j,j+1));
		 }
		 if(a==b)
		 {
			 System.out.println("Balanced");
		 }
		 else
		 {
			 System.out.println("Not Balanced");
		 }
		 
	 }
	 else if(flag==2)
	 {
	 for(i=0,j=len-1;i<half;i++,j--)
	 {
		 a+=Integer.parseInt(str.substring(i,i+1));
		 b+=Integer.parseInt(str.substring(j,j+1));
		 
		 
	 }
	 if(a==b)
	 {
		 System.out.println("Balanced");
	 }
	 else
	 {
		 System.out.println("Not Balanced");
	 }
	 }
	 
	}
}
