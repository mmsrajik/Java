Question :
First string to Second String
Consider there are two strings given as input. How many characters do we have to remove from the first string to get the second string? Although not the only way to solve this, we could create a Hash of counts for each string and see which character counts are different. That should get us close to the answer. I will leave the rest to you.
Input format:
First line contains a first string and second line contains a second string.
Output format:
An integer denote number of characters should be removed from first string to get second string.
Example1:
Input:
aabcdefg
fbd
Output:
5
Example2:
Input:
xyz
yxxz
Output:
0
Explanation:("xyz","yxxz") = 0, because we cannot get second string from the first since the second string is longer.

Note: If we are not able to get second string from first string by removing character then the output should be "0".

Runtime Input : 
aabcdefg
fbd
Output : 
5

import java.util.*;
public class getSecondStringByRemoveFirst 
{
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);  
String str=sc.next();
String str1=sc.next();
int count=0,flag=0;
	 for(int i=0;i<str.length();i++)
	 {
		 if(!str1.contains(Character.toString(str.charAt(i))))
		 {
			 count++;
		 }
		 
		 
	 }
	 for(int i=0;i<str1.length();i++)
	 {
	 if(!str.contains(Character.toString(str1.charAt(i))))
	 {
		 flag=1;
	 }
	 }
	 if(flag==1)
	 {
		 System.out.println("0");
	 }
	 else
	 {
	 System.out.println(count);
	 }
	
	}
}
