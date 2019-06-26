// digitSum odd: sum of odd digits in N



public class digitSumodd
{
public static void main(String args[]);
{
Scanner sc=new Scanner(System.in);
int input1=sc.nextInt();
int n,sum=0;
while(input1>0)
{
    n=input1%10;
    if(n%2!=0)
    {
    sum+=n;
    }
    input1/=10;
}
System.out.println(sum);
}