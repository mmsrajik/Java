// digitSum even: sum of even digits in N

public class digitSumeven
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int input1=sc.nextInt();
int num,sum=0;
    while(input1>0)
    {
       num=input1%10;
        if(num%2==0)
        {
          sum+=num;
        }
        input1/=10;
    }
    System.out.println(sum);

}