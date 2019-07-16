Question :
Write a code to reverse a string with preserving the position of spaces. 
Example:
Input:
I Am Not String
Output:
g ni rtS toNmAI
Write a java program to reverse a string with preserving the position of spaces. 
Example:
Input:
I Am Not String
Output:
g ni rtS toNmAI
Explanation:
 if “I Am Not String” is the given string then the reverse of this string with preserving the position of spaces is “g ni rtS toNmAI”:

Runtime Input : 
I Am Not String
Output : 
g ni rtS toNmAI


import java.util.*;
public class spacePreserve&Reverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String arr[]=str.split(" ");
        String nstr,st="";
        for(int i=0;i<arr.length;i++)
        {
            st+=arr[i];
        }
        StringBuilder sb=new StringBuilder(st);
        sb=sb.reverse();
        nstr=sb.toString();
        int i=0;
        for(int k=0;k<str.length();k++)
        {
            if(str.substring(k,k+1).equals(" "))
            {
                if(k<str.length()-1)
                {
                    System.out.print(" ");
                }
            }
            else
            {
                System.out.print(nstr.charAt(i));
                i++;
            }
        }
        
    }
}
