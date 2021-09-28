Most modern aircrafts are equipped with an autopilot system – one of the most useful features in fighter jets. In the beta testing of autopilot mode, one of the inputs is a string of literals containing the directions, which is fed into the flight computer before the take-off. The jet plane is put on an auto-landing mode that enables the plane to land automatically once all the directions in the string are complete Given the directions in the string str, the task here is to find out whether the jet plane returns to the same returns to the same
position on the base where it took off.

Each direction in the string changes at an interval of 1 minute(1&lt; =i&lt;= N), where N is the number of directions in the input string
The directions are North (N), South(S), West(W) and East(E)
Display a message "Returned successfully" if the plane returns to the starting position.
Display a message  "Not returned successfully" if the plane does not return to the starting position

Example 1:
Input
NESW-Value of str
Output
Returned successfully


Example 2
Input: NNWESW-Value of str
Output:
Not returned successfully



type 1:

import java.util.*;
public class directions{

public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine().toUpperCase();
    
    int countns=0;
    int countew=0;
    
    for(int i=0;i<str.length();i++)
    {
        if(str.charAt(i)=='N')
        {
            countns++;
        }
        else if(str.charAt(i)=='S')
        {
            countns--;
        }
        else if(str.charAt(i)=='E')
        {
            countew++;
        }
        else if(str.charAt(i)=='W')
        {
            countew--;
        }
    }
    
    if(countns==0 && countew==0)
    {
      System.out.println("Returned successfully");  
    }
    else
    {
        System.out.println("Not returned successfully");
    }
    
    
    
}

}


otherway:

import java.util.Scanner;

public class directions
{

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in); 
		String s =sc.nextLine();

		int N = 0, E=0, W= 0, S= 0 ,i; 
		
		for (i=0;i<s.length();i++)
		{

			if(s.charAt(i)=='N') 
			{
				  N++;
			}
			if(s.charAt(i)=='E')
			{
				E++;
			}
			if(s.charAt(i)=='W')
			{
				W++;
			}
			if(s.charAt(i)=='S')
			{
				S++;
			}
		}
		
		if( N==S && E==W )
		{
		System.out.println("Returned successfully");
		}
		else 
		{
			System.out.println("Not Returned successfully");
		}

	}
}
