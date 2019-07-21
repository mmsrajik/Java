Question :
Balanced number is the number that The sum of all digits to the left of the middle digit(s) and the sum of all digits to the right of the middle digit(s) are equal.
Given a number, Find if it is Balanced or not.
Notes
    1. If the number has an odd number of digits then there is only one middle digit, e.g. 92645 has middle digit 6; otherwise, there are two middle digits , e.g. 1301 has middle digits 3 and 0
    2. The middle digit(s) should not be considered when determining whether a number is balanced or not, e.g 413023 is a balanced number because the left sum and right sum are both 5.
    3. Number passed is always Positive.
    4. Print the result as String "Balanced" if the given number is balanced, otherwise print "Not Balanced"
Example1:
Input:
413023
Output:
Balanced

Example2:
Input:
7
Output:
Balanced




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
