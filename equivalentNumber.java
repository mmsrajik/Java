Question :
    Create a code that takes a string and replaces each letter with its appropriate position in the alphabet. "a" is 1, "b" is 2, "c" is 3, etc, etc.
    Example:
    Input:
    Wow, does that work?
    Output:
    23152341551920812023151811
    Explanation:
    W - 23
    o - 15
    w - 23
    d - 4
    0 - 15
    e - 5
    s - 19
    t - 20
    h - 8
    a - 1
    t - 20
    w - 23
    o - 15
    r - 18
    k - 11
    Note: 
    If any character in the string isn't a letter(alphabet), ignore it.


Runtime Input : 
Wow, does that work?
Output : 
23152341551920812023151811





import java.util.Scanner;
public class equivalentNumber 
{
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);  
      String str=sc.nextLine();
      char c;
      String s;
      int j;
      char st;
      for(int i=0;i<str.length();i++)
      {
    	  st=str.charAt(i);
    	  for(j=1,c='a';j<=26;j++,c++)
    	  {
    		  s=(String.valueOf(c)).toUpperCase();
    		  if(st==c || (str.substring(i,i+1)).equals(s))
    		  {
    			  System.out.print(j);
    			  break;
    		  }
    	  }
      }
      
	  
	}
}
