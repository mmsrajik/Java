// Is Palindrome


import java.util.Scanner;
public class palindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int input1=sc.nextInt();
int n,sum=0;
int temp=input1;
while(input1>0)
{
n=input1%10;
sum=(sum*10)+n;
input1/=10;

}
if(temp==sum)
{
    return 2;
}
else
{
    return 1;
}

    
}