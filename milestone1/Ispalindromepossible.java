// Is palindrome possible

import java.io.*;
import  java.util.*;
public class Ispalindromepossible
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int input1=sc.nextInt();


              int con=1;
		if(input1>=1 && input1<=25000)
		{
			con=0;
		}
		String str=Integer.toString(input1);
		int even=2,count=0;
		int len=str.length();
		char arr[]=str.toCharArray();
		int narr[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					narr[i]++;
				}
			}
		}
		if(len%2==0)
		{
			even=1;
		}
		else if(len%2!=0)
		{
			even=0;
		}

        for(int i=0;i<narr.length;i++)
		{
           if(narr[i]!=1)
		   {
			   count++;
		   } 
		}
		if(even==1 && count==len && con!=1)
		{
			System.out.println("true");
		}
		else if(even==0 && count==len-1 && con!=1)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}


	}
}






//Mehod 2

import java.io.*;
import  java.util.*;
public class Ispalindromepossible
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int input1=sc.nextInt();


 String input=Integer.toString(input1);
	   int[] charCount = new int[128];
                for(int i = 0 ; i <input.length() ; i++)
                {
                    charCount[(int)input.charAt(i)]++;
                }
                int oddCount = 0 ;
                for(int i  = 0 ; i < 128 ; i++)
                {
                    if(charCount[i] % 2!=0)
                    {
                        oddCount++;
                    }
                }

                if(oddCount != 0 && oddCount != 1)
                {
                    System.out.println("false");
                }		
                 else
                System.out.println("true");
}
}