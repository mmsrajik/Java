//Create PIN using alpha, beta, gamma

import java.io.*;
import java.util.*;
class CreatePIN
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
               int input1=sc.nextInt();
                   int input1=sc.nextInt();
                 int input1=sc.nextInt();
                int largest=0;
		int sum=0,n;
		int arr[]=new int[3];
		int sarr[]=new int[3];
		arr[0]=input1;
		arr[1]=input2;
		arr[2]=input3;
		for(int j=0;j<arr.length;j++)
		{
			sum=arr[j];
		for(int i=0;i<arr.length;i++)
		{
			n=arr[i]%10;
			if(n>largest)
			{
              largest=n;
			}
			
            if(n<sum)
			{
				sum=n;
			}
			arr[i]=arr[i]/10;

		}
       sarr[j]=sum;
		sum=0;
		}
		for(int i=3;i>0;i--)
		{
			largest=(largest*10)+sarr[i-1];
		}
		System.out.print(largest);

	}
}