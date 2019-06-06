
Stella and friends have set out on a vacation to Manali. They have booked accommodation in a resort and the resort authorities headed by Bob, organize Camp fires every night as a part of their daily activities. Stella volunteered herself for an activity called the "Stick Game".
Stella was given a total of N sticks. Length of i-th stick is Ai. Bob insists Stella to choose any four sticks and to make a rectangle with those sticks as its sides. Bob warns Stella not to break any of the sticks, she has to use sticks as a whole.
Also, Bob wants that the rectangle formed should have the maximum possible area among all the rectangles that Stella can make. Stella takes this challenge up and overcomes it. You have to help her know whether it is even possible to create a rectangle. If yes, then tell the maximum possible area of rectangle.
 Input Format:
The first line of the input contains a single integer N denoting the number of sticks.
The second line of each test case contains N space-separated integers A1, A2, ...,AN denoting the lengths of sticks.
Output Format:
Output a single line containing an integer representing the maximum possible area for rectangle or output -1, if it's impossible to form any rectangle using the available sticks.
Refer sample input and output for formatting specifications.




import java.util.*;
public class rectanglearea
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int biggest;
        int a[]=new int[num];
        int b[]=new int[num];
        for(int i=0;i<num;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<num;i++)
        {
            int count=0;
            for(int j=i;j<num;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                }
            }
            if(count==2)
            b[i]=a[i];
        }
        int longest=b[0]*b[1];
        for(int i=0;i<num;i++)
        {
            for(int j=i+1;j<num;j++)
            {
                if(b[i]*b[j]>longest)
                longest=b[i]*b[j];
            }
        }
        if(longest>0)
        System.out.print(longest);
        else
        System.out.print("-1");
    }
}
