Sum of Largest Three Digit Numbers from given Three Numbers

Given 3 input numbers, You need to find the sum of the largest numbers that can be produced using 3 digits from each of the 3 numbers.

Example-1
If the 3 input numbers are 23792,37221 and 10270.
The largest numbers that can be produced using 3 digits from each of these are 973,732 and 721 respectively, and the sum of these largest numbers will be 2426.
Therefore, the expected result is 2426.

Note– All the given 3 numbers will be >=100 and <=99999.

Runtime Input : 
23792 37221 10270
Output : 
2426

import java.util.*;
public class sum3of3 
{
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);  
	
	 
	 int arr[]=new int[3];
	 for(int i=0;i<3;i++)
	 {
		 arr[i]=sc.nextInt();
	 }
	 int len;
	 String st;
	 int m=0;
	 int iarr[]=new int[3];
	 for(int i=0;i<3;i++)
	 {
		 st=String.valueOf(arr[i]);
		 len=st.length();
		 int intarr[]=new int[len];
		 for(int j=0;j<len;j++)
		 {
			 intarr[j]=Character.getNumericValue(st.charAt(j));
		 }
		 Arrays.sort(intarr);
		 for(int k=1;k<=3;k++)
		 {
			 m=(m*10)+intarr[len-k];
			
		 }System.out.println(m+"m");
		 iarr[i]=m;
		 m=0;
	 }
	     
	 int sum=0;
	for(int i=0;i<3;i++)
	{
		sum=sum+iarr[i];
		//System.out.println(iarr[i]);
	}
	System.out.println(sum);
	}
}
