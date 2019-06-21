Question :
Given an expression of length n consisting of some brackets. The task is to print the bracket numbers when the expression is being parsed.
Example1:
    Input expression:
    (a+b)/(c+d)

    Output:
    1 1 2 2

Example2:
    Input expression:
    ((a+b)-c)/(c+d)

    Output:
    1 2 2 1 3 3

Note: If the number of brackets are opened is not matching with number of brackets closed, then print "Invalid Expression"

Runtime Input : 
(a+b)/(c+d)
Output : 
1 1 2 2



import java.util.*;
public class checkParentheses 
{
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);  
		String str=sc.next();
		char arr[]=str.toCharArray();
		int k=0;
		Stack<Integer> stk=new Stack<Integer>();
		String st="";
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='(')
			{
				k++;
				stk.push(k);
				if(i==arr.length-1)
				{
					st+=String.valueOf(stk.peek());
				}
				else
				{
				st+=String.valueOf(stk.peek())+" ";
				}
				//System.out.print(stk.peek());
			}
			else if(arr[i]==')')
			{
				if(stk.isEmpty())
				{
					System.out.print("Invalid Expression");
					System.exit(0);
				}
				else
				{
					if(i==arr.length-1)
					{
						st+=String.valueOf(stk.peek());
					}
					else
					{
					st+=String.valueOf(stk.peek())+" ";
					}
					//System.out.print(stk.peek());
					stk.pop();
				}
			}
		}
		if(stk.isEmpty())
		{
			System.out.print(st);
		}
		else
		{
			System.out.print("Invalid Expression");
		}
	
	}
}
