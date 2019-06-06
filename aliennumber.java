
The decimal numeral system is composed of ten digits, which we represent as "0123456789" (the digits in a system are written from lowest to highest). Imagine you have discovered an alien numeral system composed of some number of digits, which may or may not be the same as those used in decimal. For example, if the alien numeral system were represented as "oF8", then the numbers one through ten would be (F, 8, Fo, FF, F8, 8o, 8F, 88, Foo, FoF). We would like to be able to work with numbers in arbitrary alien systems. We want to be able to convert decimal numeral system into alien system.
Input:
A line contains a decimal value d.

Output:
A line contains alien numeral value equivalent to given decimal value

Constraint:
1<=d<=9

If the above constraint not met, then print "alien numeral value not possible for the given decimal value"




import java.util.*;
public class aliennumber 
{
	

	
	private static Scanner sc;

	public static void main(String args[])
	{
		
		sc = new Scanner(System.in);
		String str=sc.nextLine();
		char s;
		int flag=0;
		String a="";
		
		int val;
		int stlen=str.length();
		for(int i=0;i<stlen;i++)
		{
			
			s=str.charAt(i);
			if( (s >='a' && s<='z')  || (s>='A' && s<='Z') )
			{
				a+=Character.toString(s);
				flag=1;
			}
			else
			{
				val=Character.getNumericValue(s);
				if(flag==2)
				{
					//wrong
					System.out.println("alien numeral value not possible for the given decimal value");
					System.exit(0);
				}
				flag=2;
				
				if(val<1 || val>9)
				{
					System.out.println("alien numeral value not possible for the given decimal value");
				    System.exit(0);
				}
				else
				{
					switch(val)
					{
					case 1:
					{
						//System.out.println("F");
						
						a+="F";
						break;
					}
					case 2:
					{
						//System.out.println("8");
						a+="8";
						break;
					}
					case 3:
					{
						//System.out.println("Fo");
						a+="Fo";
						break;
					}
					case 4:
					{
						//System.out.println("FF");
						a+="FF";
						break;
					}
					case 5:
					{
						//System.out.println("F8");
						a+="F8";
						break;
					}
					case 6:
					{
						//System.out.println("8o");
						a+="Fo";
						break;
					}
					case 7:
					{
						//System.out.println("8F");
						a+="8F";
						break;
					}
					case 8:
					{
						//System.out.println("88");
						a+="88";
						break;
					}
					case 9:
					{
						//System.out.println("Foo");
						a+="Foo";
						break;
					}
					
				
			      }
		       } 
		   }
		}
		
		System.out.println(a);
	}
}
