
Question :
Design a code to remove consonants from the given string.

Note: If the given string contains only consonants, then print "all letters are consonants"

Runtime Input : 
hello world
Output : 
eo o



import java.util.*;
public class removeConsonants
{
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);  
    String str=sc.nextLine();
    char c;
    int flag=0;
    int count=0;
    for(int i=0;i<str.length();i++)
    {
    	c=str.charAt(i);   	
    	if((c>='a' && c<='z') || (c>='A' && c<='Z'))
    	{
    		flag=1;
    	}
    	if((c=='a'|| c=='e' || c=='i' || c=='o' || c=='u') || flag==0 )
    	{
    		count++;
    		System.out.print(c);
    	}
    	flag=0;   	
    }
    if(count==0)
    {
    	System.out.print("all letters are consonants");
    }
	}
}
