Question :
Design an algorithm to accept a string from the user. Replace all vowels (‘a’, ‘e’, ‘I’, ‘o’, ‘u’) with ‘z’. If there are no vowels in the string just print the message “No vowels present”.

Runtime Input : 
java
Output : 
jzvz



import java.util.Scanner;
public class replaceVowels 
{
	public static void main(String args[])
	{
	   Scanner sc=new Scanner(System.in);
	int count=0;
	String str=sc.nextLine();
	int len=str.length();
	char c;
	char rep='z';
	for(int i=0;i<len;i++)
	{
		c=str.charAt(i);
		if(c=='a' ||c== 'e' || c== 'i' ||c== 'o' ||c== 'u')
			{
				count++;
				str=str.replace(c,rep);
			}
		
	}
	if(count==0)
	{
		System.out.println("No vowels present");
	}
	else
	{
		System.out.println(str);
	}
	   
	   
	}
}
