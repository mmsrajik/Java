

Design an algorithm to count the number of digits in a given number(both +ve and –ve).
Example –
If the number entered is 12345
The output is 5 digits




import java.util.*;
public class checkDigit 
{
	

	
	

	public static void main(String args[])
	{
	   Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		//int n=Integer.parseInt(st);
		int num;
		//String str=Integer.toString(n);
        int len=st.length();
		int count=0,co=0;
		char c;
		for(int i=0;i<len;i++)
		{  
			c=st.charAt(i);
			if((c>='a' && c<='z') || (c>='A' && c<='Z') || c=='-')
			{
				
			}
			else
			{
				count++;
			}
		}
		   System.out.println(count);
	}
}
