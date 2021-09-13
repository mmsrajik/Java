
Question :
Validate Shuffled String

There are 3 strings str1, str2 and str3 given as input. Str3 is said to be a shuffle of str1 and str2 if it can be formed by interleaving the characters of str1 and str2 in a way that maintains the left to right ordering of the characters from each string.
Example:
Input:
str1="abc"
str2="def"
str3="dabecf" 
Output:
True
Explanation:str3="dabecf" is a valid shuffle since it preserves the character ordering of the two strings.
So, given these 3 strings write a code that detects whether str3 is a valid shuffle of str1 and str2. If str3 is valid shuffle then print "True", otherwise print "false".



Runtime Input : 
abc
def
dabecf
Output : 
True





import java.util.*;
public class ValidateShuffledString
 
{
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);  
String str1=sc.next();
String str2=sc.next();
String str3=sc.next();

int cou=0,con1=0,con2=0;
for(int i=0;i<str1.length();i++)
{
	for(int j=0; j<str3.length();j++)
	{                                   
	if(i>=str1.length())
	{
		break;
	}
		if(str1.charAt(i)==str3.charAt(j))
		{                                                
		cou++;
		 
		i++;
		}
		
	}
	if(cou==str1.length())
	{
		con1=1;
	}
	
	cou=0;
}
	
for(int i=0;i<str2.length();i++)
{
	for(int j=0; j<str3.length();j++)
	{ 		                                          
		if(i>=str2.length())
	{
		break;
	}
		if(str2.charAt(i)==str3.charAt(j))
		{
		cou++;	
		i++;
		}
		
	}
	if(cou==str2.length())
	{
		con2=1;
	}
	
	cou=0;
}


if(con1==1 && con2==1)
{
	System.out.println("True");
}
else
{
	System.out.println("false");
}


	}
}




other way:  


import java.util.*;
public class ValidateShuffledString{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        String str3=sc.nextLine();
        int count=0;
        boolean check=false;
        String arr[]=new String[2];
        arr[0]=str1;
        arr[1]=str2;
        int temp=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length();j++)
            {
                for(int k=temp;k<str3.length();k++)
                {
                    if(arr[i].charAt(j)==str3.charAt(k))
                    {
                       
                        count++;
                        temp=k+1;
                        break;
                    }
                    
                }
               
            }
            if(count==arr[i].length())
            {
               
               check=true;
            }
            else
            {
                System.out.print("False");
                System.exit(0);
            }
            temp=0;
            count=0;
        }
        
        
        if(check==true)
        System.out.println("True");
     }
}
