Question :
Write a code to check whether one string is a rotation of another. 
For example, If "Java J2ee Struts Hibernate" is a string then some rotated versions of this string are "Struts Hibernate Java J2ee", "J2ee Struts Hibernate Java", "Hibernate Java J2ee Struts".
If s1 and s2 are two given strings, then write a code to check whether s2 is a rotated version of s1. If s2 is a rotated version of s1 print "Yes", otherwise print "No".
Runtime Input : 
Java J2ee Struts Hibernate
Hibernate Java J2ee Struts
Output : 
Yes


import java.util.*;
public class stringRotateCompare
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String nstr=sc.nextLine();
        String[] arr=str.split(" ");
        String[] narr=nstr.split(" ");
        int count=0;
        int flag=0;
        int len1=arr.length;
        int len2=narr.length;
        if(len1==len2)
        {
            flag=1;
        }
        for(int i=0;i<narr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j].equals(narr[i]))
                {
                    count++;
                }
            }
        }
        if(count==narr.length && (flag==1 || len2>len1))
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
        
    }
}

alternative way:

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str1=sc.nextLine();
	    String str2=sc.nextLine();
	    String arr1[]=str1.split(" ");
	    String arr2[]=str2.split(" ");
	    ArrayList<String> al2=new ArrayList<String>(Arrays.asList(arr2));
	    
	    for(int i=0;i<arr1.length;i++)
	    {
	        for(int j=0;j<arr2.length;j++)
	        {
	            
	            if(arr1[i].equals(arr2[j]))
	            {
	                al2.remove(j);
	            }
	        }
	        
	        System.out.println(al2);
	    }
	    
	    if(al2.size()==0 && (arr1.length == arr2.length))
	    {
	        System.out.println("Yes");
	    }
	    else
	    {
	        System.out.println("No");
	    }
	}
}


