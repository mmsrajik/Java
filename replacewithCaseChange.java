Question :
Design an algorithm which accepts 2 strings from the user and performs the following operation on it.
Example –
string1 = “Hello”
string2 = “World” string3 must be “HellodlroW”
Both strings must be concatenated but after reversing the second string (as shown in string3 above).

Next toggle the string3 characters from upper case to lowercase and lowercase to uppercase. Finally print the string3.

Runtime Input : 
Hello
World
Output : 
hELLODLROw


import java.util.Scanner;
public class replacewithCase 
{
	public static void main(String args[])
	{
	   Scanner sc=new Scanner(System.in);  
	   String str1=sc.nextLine();
	   String str2=sc.nextLine();
	   char c;
	   String rev="";
	   for(int i=str2.length()-1;i>=0;i--)
	   {
		   c=str2.charAt(i);
		   rev=rev+c;
	   }
	   String s;
	   String str3=str1+rev;
	   String nstr="";
	   for(int i=0;i<str3.length();i++)
	   {
		   s=str3.substring(i,i+1);
		   c=str3.charAt(i);		  
		   if(c>= 'a' && c<='z')
		   {
			   s=s.toUpperCase();
			   nstr+=s;
		   }
		   else if(c>='A' && c<='Z')
		   {
			   s=s.toLowerCase();
			   nstr+=s;
		   }		   
	   }	  		   
	   System.out.println(nstr);	   
	}
}



other way:



import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        String str3="";
        
        StringBuffer sb=new StringBuffer(str2);
        sb.reverse();
        str3=str1+sb;
        for(int i=0;i<str3.length();i++)
        {
            if(Character.isUpperCase(str3.charAt(i)))
            {
        System.out.print((str3.substring(i,i+1)).toLowerCase());
            }
            else
            {
                System.out.print((str3.substring(i,i+1)).toUpperCase());
            }
        }
     }
}
