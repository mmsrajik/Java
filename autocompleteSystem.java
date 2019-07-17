Question :
Implement an autocomplete system. That is, given a query string s and a set of all possible query strings, print all strings in the set that have s as a prefix in the order which they appeared.
Input format:
First line contains a string(single word) s and second line contains set of all possible query strings.
Output format:
A line contains strings in the set that have s as a prefix.
Example:
Input:
de
dog deer deal
Output:
deer deal



import java.util.*;
public class autocompleteSystem
{
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);  
String str=sc.nextLine();
String fstr=sc.nextLine();
String arr[]=fstr.split(" ");
for(int i=0;i<arr.length;i++)
{
	if(arr[i].startsWith(str))
	{
		if(i==arr.length-1)
		System.out.print(arr[i]);
		else
			System.out.print(arr[i]+" ");
	}
}

	}
}
