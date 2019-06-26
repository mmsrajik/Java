// digitSum opt: sum of even or odd digits



public class digitSumopt
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int input1=sc.nextInt();
int input2=sc.next();
int sum=0;
    if(input2.equals("even"))
		{
int num;
    while(input1>0)
    {
       num=input1%10;
        if(num%2==0)
        {
          sum+=num;
        }
        input1/=10;
    }
	
		}
		else if(input2.equals("odd"))
		{
			int n;
while(input1>0)
{
    n=input1%10;
    if(n%2!=0)
    {
    sum+=n;
    }
    input1/=10;
}

		}
	return sum;	
	
}
}