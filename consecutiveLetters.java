Question :
A string is called diverse if it contains consecutive (adjacent) letters of the alphabet and each letter occurs exactly once.

For example, the following strings are diverse: "fced", "xyz".

The following string are not diverse: "az", "aa". Note that the letters 'a' and 'z' are not adjacent.

Formally, consider positions of all letters in the string in the alphabet. These positions should form contiguous segment, i.e. they should come one by one without any gaps. And all letters in the string should be distinct (duplicates are not allowed).

You are given a strings. For each string, if it is diverse, print "Yes". Otherwise, print "No".

Runtime Input : 
fced
Output : 
Yes


import java.util.*;
public class consecutiveLetters 
{
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);  
		String str=sc.nextLine();
		for(int i=0;i<str.length()-1;i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					System.out.print("No");
					System.exit(0);
				}
			}
		}
		char c,d;
		String nextv,prevv;
		int z=1;
       for(int i=0;i<str.length();i++)
       {
    	   c=str.charAt(i);
    	   d=c;
    	   nextv=String.valueOf(++c);
    	prevv=String.valueOf(--d);
    	//for(int j=0;j<str.length();j++)
    	//{
    		
    //	}
    	
    	if(str.contains(nextv) || str.contains(prevv) )
    	{
    		//System.out.println(nextv);
    		System.out.println("Yes");
    		System.exit(0);
    	}
    	   
       }
		if(z==1)
		{
			System.out.print("No");
		}
	
	}
}


some ligic issue in upper program.
	New Modified program:


import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int val=0;
        for(int i=0;i<str.length();i++)
        {
        char ch=str.charAt(i);
        char temp1=--ch;
        char temp2=++ch;
        ++temp2;
        
        
        
        for(int k=0;k<str.length();k++)
		{
			for(int j=k+1;j<str.length();j++)
			{
				if(str.charAt(k)==str.charAt(j))
				{
					System.out.println("No");
					System.exit(0);
				}
			}
		}
		
        
        if(i==0)
        {
            if(str.charAt(i+1)==temp2)
        {
            System.out.println("Yes");
            val=1;
            
        }
            
        }
        else if(i==str.length()-1)
        {
            if(str.charAt(i-1)==temp1 || str.charAt(i-1)==temp2)
        {
            System.out.println("Yes");
            val=1;
        }
            
        }
        else
        {
        if(str.charAt(i+1)==temp2 || str.charAt(i-1)==temp1)
        {
            System.out.println("Yes");
            val=1;
        }
        }
        
       
     }
     
     if(val==0)
     {
         System.out.println("No");
     }
}
}

